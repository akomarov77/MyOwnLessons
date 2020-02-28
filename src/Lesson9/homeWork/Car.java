package Lesson9.homeWork;

public abstract class Car {
    private int year;
    private String manufacturer;
    private CarState cartState;
    private  int yearofrelease;

    public Car() {
    }

    public Car(int year, String manufacturer, CarState cartState) {
        this.year = year;
        this.manufacturer = manufacturer;
        this.cartState = cartState;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setCartState(CarState cartState) {
        this.cartState = cartState;
    }

    public int getYearofrelease() {
        return yearofrelease;
    }

    public int getYear() {
        return year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public CarState getCartState() {
        return cartState;
    }
}
