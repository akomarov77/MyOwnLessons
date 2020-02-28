package Lesson10;

public class Employee extends Person {
    public int income;

    public Employee(String name, int age, Gender gender, int income) {
        super(name, age, gender);
        this.income = income;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "income=" + income +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

