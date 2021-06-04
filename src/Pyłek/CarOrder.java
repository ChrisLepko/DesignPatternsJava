package Pyłek;

public class CarOrder {
    private final int carQuantity;
    private final Car car;

    public CarOrder(int carQuantity, Car car) {
        this.carQuantity = carQuantity;
        this.car = car;
    }

    public void completeOrder(){
        System.out.println("Samochód: " + car.getName() + " ilość: " + carQuantity);
    }
}
