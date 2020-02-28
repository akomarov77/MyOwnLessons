package Lesson9.homeWork;

public class Passenger extends Car {
    private int places;

    public int getPlaces() {
        return places;
    }

    public Passenger(int year, String manufacturer, CarState cartState, int places) {
        super(year, manufacturer, cartState);
        this.places = places;
    }

    public Passenger() {
    }
}
