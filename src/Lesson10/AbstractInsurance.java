package Lesson10;

public abstract class AbstractInsurance<T extends Person> {
    public void issuePolice(T p) {
        System.out.println("Prepare blank");
        validate(p);
        System.out.println("Registrar policy in a Global System");

    }
    protected abstract T validate(T person);
}
