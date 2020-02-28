package lesson12;



import Lesson10.Person;

import java.util.function.UnaryOperator;

public class MyUnaryOperator implements UnaryOperator<Person> {
    @Override
    public Person apply(Person person) {
        person.setAge(person.getAge()+5);
        return person;
    }
}
