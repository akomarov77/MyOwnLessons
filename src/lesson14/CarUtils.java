package lesson14;

import Lesson9.homeWork.Car;
import Lesson9.homeWork.CarState;
import Lesson9.homeWork.Passenger;

import java.util.ArrayList;
import java.util.List;

public class CarUtils {
    public static List<Car> generateListOfCar (int amount){
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            result.add(generateCar());
        }
        return result;
    }

    public static Car generateCar() {
        int year = getRandomYear();
        // manufacturer = getManufacturer();
        CarManufacturer manufacturer = getManufacturer();
        CarState condition = getCarCondition();
        int capacity = getCarCapacity();
        return new Passenger(year,manufacturer.toString(),condition, capacity);
    }

    public static Car findOneCarByCondition (CarState condition, List<Car> cars){
        return cars.stream().filter(car -> car.getCartState()==condition).findFirst().get();

        /*Car result = null;
        for (Car car: cars){
            if (car.getCarCondition()== condition){
                result = car;
                break;

            }
        }*/
        /*Predicate<Car> predicate = new Predicate<Car>() {
            @Override
            public boolean test(Car car) {
                return car.getCarCondition() ==condition;
            }
        };*/
        //return result;
        //return cars.parallelStream().filter(car -> car.getCarCondition()==condition).findFirst().get();
    }


    private static int getRandomYear() {
        return (int) ((Math.random() *  25) + 1990);
    }

    /*private static String getManufacturer () {
        return UUID.randomUUID().toString();
    }*/

    private static CarManufacturer getManufacturer () {
        int randomPassengerCar = (int) (Math.random() *75);
        return CarManufacturer.values()[randomPassengerCar];
    }

    private static CarState getCarCondition (){
        int randomState = (int) (Math.random() *3);
        return CarState.values()[randomState];
    }

    private static int getCarCapacity (){
        int randomCapacity = (int) (Math.random() * 3+2);
        return randomCapacity;
    }
}