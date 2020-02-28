package lesson12;

import Lesson10.Citizen;
import Lesson10.Employee;
import Lesson10.Gender;
import Lesson10.Person;
import Lesson9.homeWork.Car;
import Lesson9.homeWork.CarState;
import Lesson9.homeWork.Passenger;
import Lesson9.homeWork.Truck;


import java.util.function.*;

public class FunctionalInterfaces {
/*
    static void useSupplier(Supplier<String> stringSupplier) {
        System.out.println(stringSupplier.get());
    }

    static String useFunction(Function<Integer, String> function,
                              Integer integer) {
        return function.apply(integer);
    }

    static void usePredicate(Predicate<Car> carPredicate, Car testCar) {
        boolean isOk = carPredicate.test(testCar);
        System.out.println(isOk ? "Car is Ok" : "Not a good One");
    }
    static void getAverage(BiFunction<Citizen, Employee, Object> biF,
                           Citizen citizen,
                           Employee employee){
        System.out.println("Average age is" + biF.apply(citizen, employee));
    }
    static void usUnaryOperator(UnaryOperator<Person> unaryOperator, Person person){

    }

    static void activeUseCar(UnaryOperator<Car> unaryOperator, Car myCar ){

    }

    static void activeUseOfCar(UnaryOperator<Car> unaryOperator,Car car ){
        unaryOperator.apply(car);
        System.out.println("Car condition" + car );
        unaryOperator.apply(car);
        System.out.println("Car after " + car );
    }
     static void useUnaryOperator(UnaryOperator<Person> unaryOperator, Person person){
        unaryOperator.apply(person);
         System.out.println("Person After Id" + person );
     }

    public static void main(String[] args) {
        Car car = new Passenger( 2019,"BMW", CarState.EXCELLENT, 12);
        Person person = new Person("NIK",56, Gender.FEMALE);
        UnaryOperator<Person> classUnaryOperator = new MyUnaryOperator();
        useUnaryOperator(classUnaryOperator,person);
        int delta =67;
        useUnaryOperator(classUnaryOperator, person);
        useUnaryOperator((p)-> {
            p.setAge(p.getAge()+6);
            return p;
                }
                , person);
        String newCompany = "Google";
        activeUseOfCar((c)-> {
                    c.setCartState(CarState.BAD);
                    return c;
                }, car
        );

        Citizen citizen = new Citizen("NIK",34,Gender.MALE, true);
        Employee employee = new Employee("JO", 56, Gender.MALE, 500){
            //getAverageAge(biF);
        //}

        //Supplier:
        Supplier<String> classSupplier = new MySupplier();
        Supplier<String> anonymousSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "from Anonymous initialization";
            }
        };
        Supplier<String> lambdaSuppler = () -> "from Lambda supplier";

        useSupplier(classSupplier);
        useSupplier(anonymousSupplier);
        useSupplier(lambdaSuppler);

        int age = 1300;
        useSupplier(() -> "A" + age);

        //Function:
        Function<Integer, String> classFunction = new MyFunction();
        Function<Integer, String> anonymousFunction = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return "String from anonymous initialization: " + integer.toString();

            }
        };
        Function<Integer, String> lambdaFunction = (i) -> "From Lambda: " + i. ();
        System.out.println(useFunction(classFunction, 444));
        System.out.println(useFunction(anonymousFunction, 890));
        System.out.println(useFunction(lambdaFunction, 666));
        System.out.println(useFunction((i) -> i + "from Inline Lambda", 22));

        //Predicate:
        Predicate<Car> classPredicate = new MyPredicate();
        Car car1 = new Truck(2050, "BMW", CarState.EXCELLENT,4);
        Car car2 = new Truck(2050, "Tesla", CarState.EXCELLENT,2);
        usePredicate(classPredicate, car1);
        usePredicate(classPredicate, car2);

   }
   */

}
