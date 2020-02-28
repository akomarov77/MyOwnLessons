package Lesson9.homeWork;

public class Truck extends Car {
    private int bearing;

    public int getBearing() {
        return bearing;
    }

    public Truck(int year, String manufacturer, CarState cartState, int bearing) {
        super(year, manufacturer, cartState);
        this.bearing = bearing;
    }

    public Truck() {
    }
}
