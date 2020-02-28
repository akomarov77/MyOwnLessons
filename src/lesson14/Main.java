package lesson14;

import Lesson9.homeWork.Car;
import Lesson9.homeWork.CarState;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static Lesson9.homeWork.CarState.*;

public class Main {
/*

    public static void main(String[] args) {
        List<Car> cars = CarUtils.generateListOfCar(10);
        System.out.println("1+++++++++++++++++++++++++++++++++++++++");
        System.out.println(cars);
        System.out.println(cars.size());

        System.out.println("2+++++++++++++++++++++++++++++++++++++++");
        //System.out.println("Bad car = " + CarUtils.findOneCarByCondition(CarCondition.BAD, car));
        System.out.println("Bad car = " + cars.stream().filter(car -> car.getCartState()==BAD).findFirst().get());

        System.out.println("3+++++++++++++++++++++++++++++++++++++++");
        System.out.println("Millennium Car = " + cars.stream().filter(car -> car.getYearofrelease()==2000).findFirst().orElse(generateCar()));
        System.out.println("4+++++++++++++++++++++++++++++++++++++++");
        cars.stream().forEach(car -> System.out.println(car));
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        cars.stream().filter(car -> car.getCartState()==EXCELLENT).forEach(car -> System.out.println(car));

        System.out.println("5+++++++++++++++++++++++++++++++++++++++");


        long count =  cars.stream()
                .filter(car -> car.getCartState() == EXCELLENT)
                .peek(car -> System.out.println("peek().. year: " + car.getYearofrelease()))
                .peek(car -> System.out.println("peek() .. Manufacturer: " + car.getManufacturer()))
                .count();

        System.out.println("Excellent cars count = "+ count);

        // Тоже самое
        /*System.out.println("Excellent cars count = "
                + cars.stream()
                .filter(car -> car.getCarCondition() == EXCELLENT)
                .peek(car -> System.out.println("peek().. year: " + car.getYearOfRelease()))
                .peek(car -> System.out.println("peek() .. Manufacturer: " + car.getManufacturer()))
                .count());*/
/*
        long count1 =  cars.stream()
                .peek(car -> System.out.println("peek().. year: " + car.getYearofrelease()))
                .peek(car -> System.out.println("peek() .. Manufacturer: " + car.getManufacturer()))
                .filter(car -> car.getCartState() == EXCELLENT)
                .count();

        System.out.println("Excellent cars count = "+ count1);
        System.out.println("6+++++++++++++++++++++++++++++++++++++++");
        int year = LocalDateTime.now().getYear();
        System.out.println(year);

        System.out.println("7+++++++++++++++++++++++++++++++++++++++");
        cars.stream()
                .filter(car -> car.getCartState()==GOOD)
                .forEach(car -> System.out.println("Manufacturer: "+ car.getManufacturer()+ " and car age is: " + (year -car.getYearofrelease())));


        boolean hasBadCar = cars.stream().anyMatch(car -> car.getCartState()==BAD);
        System.out.println(hasBadCar ? "We have a bad car " : "All cars are OK ");

        boolean allBadCar = cars.stream().allMatch(car -> car.getCartState()==BAD);
        System.out.println(allBadCar ? "All cars are bad " : "Some cars are OK ");

        System.out.println("8+++++++++++++++++++++++++++++++++++++++");
        //boolean carOlder18 = cars.stream().anyMatch(car -> LocalDateTime.now().getYear() - car.getYearOfRelease()==18);
        boolean carOlder18 = cars.stream().anyMatch(car -> getAge(car)==18);
        System.out.println(carOlder18 ? "We have a car older 18 " : "All cars are younger than 18 ");

        //boolean allBCarThatOlder24 = cars.stream().allMatch(car -> LocalDateTime.now().getYear() - car.getYearOfRelease()==24);
        boolean allBCarThatOlder24 = cars.stream().allMatch(car -> getAge(car)<24);
        System.out.println(allBCarThatOlder24 ? "All cars are younger than 24 " : "Some cars are older than 24 ");

        System.out.println("9+++++++++++++++++++++++++++++++++++++++");

        List<CarState> listOfCondition = cars.stream()
                .map(car -> car.getCartState())
                .collect(Collectors.toList());
        System.out.println(listOfCondition);

        Set<CarState> setOfCondition = cars.stream()
                .map(car -> car.getCartState())
                .collect(Collectors.toSet());
        System.out.println(setOfCondition);

        Set<CarManufacturer> setOfCarManufacturers = cars.stream()
                .map(car -> car.getManufacturer())
                .collect(Collectors.toSet());
        System.out.println(setOfCarManufacturers);
        System.out.println(setOfCarManufacturers.size());

        cars.stream().peek( car -> System.out.println("Car from peek : " + car))
                map.(car ->car.getYear)) Stream<integer>
                .peek(y -> System.out.println("Car year peek:" + y)))
        map.(ny -> System.out.println("New car years peek:" + ny)))
        stream.count();
*/
   // }

    private static int getAge (Car car) {
        return LocalDateTime.now().getYear() - car.getYearofrelease();

    }
}
