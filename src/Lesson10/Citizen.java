package Lesson10;

public class Citizen extends Person {
    boolean healthInsuranceStatus;
    private Person gender;

    public Citizen(String name, int age, Gender gender, boolean healthInsuranceStatus) {
        super(name, age, gender);
        this.healthInsuranceStatus = healthInsuranceStatus;
    }

    public boolean isHealthInsuranceStatus() {
        return healthInsuranceStatus;
    }

    public void setHealthInsuranceStatus(boolean healthInsuranceStatus) {
        this.healthInsuranceStatus = healthInsuranceStatus;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "healthInsuranceStatus=" + healthInsuranceStatus +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender.toString() +
                '}';
    }

}
