package Lesson10;

public enum Gender {
        MALE(0),
        FEMALE(1);


    Gender(int sex) {
        this.sex = sex;
    }

  public String toString() {
        if (MALE.sex == sex) {
            return "Male";
        }
        return "Female";
    }

    private int sex;
}
