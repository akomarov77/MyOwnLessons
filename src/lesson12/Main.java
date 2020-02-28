package lesson12;

import Lesson10.Citizen;
import Lesson10.Employee;
import Lesson10.Gender;
import Lesson10.Person;
import Lesson9.homeWork.Car;
import Lesson9.homeWork.CarState;
import Lesson9.homeWork.Passenger;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Citizen> people = new HashMap<>(20);
        Citizen p1 = new Citizen("Nik",43, Gender.MALE, true);
        Citizen p2 = new Citizen("Mike",12, Gender.MALE, true);
        Person p3 = new Employee("Jo",39, Gender.MALE, 50000);
        Person p4 = new Employee("Anna",25, Gender.FEMALE, 40000);
        people.put(p1.getName(), p1);
        people.put(p2.getName(), p2);
        //people.put(p3.getName(), p3);
        //System.out.println(people);
        //people.put(p4.getName(), p4);
        System.out.println(people);
        System.out.println(people.get("Nik").getName());
        Car car1 = new Passenger(1990, "BMW", CarState.EXCELLENT, 1);
        Car car2 = new Passenger(1993, "BMW", CarState.EXCELLENT, 2);
        Car car3 = new Passenger(1994, "BMW", CarState.EXCELLENT, 3);
        Car car4 = new Passenger(1995, "BMW", CarState.EXCELLENT,10);

        Map<String, Car> autoRegistry = new HashMap<>();
        autoRegistry.put(car1.getYear() + car1.getManufacturer(), car1);
        autoRegistry.put(car2.getYear() + car2.getManufacturer(), car2);
        autoRegistry.put(car3.getYear() + car3.getManufacturer(), car3);
        autoRegistry.put(car4.getYear() + car4.getManufacturer(), car4);
        System.out.println("Total car number is: " + autoRegistry.size());

        Map<String, Car> autoRegistryNew = new HashMap<>();
        //autoRegistryNew = autoRegistry;
        autoRegistryNew.putAll(autoRegistry);
        System.out.println("New map: " + autoRegistryNew);
        Car lookupCar = autoRegistry.get("1994BMW+X");
        System.out.println("Lookup Car: "+ lookupCar);
    }
}