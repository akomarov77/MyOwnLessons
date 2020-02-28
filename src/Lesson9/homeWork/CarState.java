package Lesson9.homeWork;

public enum CarState {
    EXCELLENT(3),
    GOOD(2),
    BAD(1);

    CarState(int rate) {
        this.rate = rate;

    }

    private int rate;

    public int getRate() {
        return rate;
    }
}
