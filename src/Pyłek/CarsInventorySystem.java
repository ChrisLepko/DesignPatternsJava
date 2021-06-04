package Pyłek;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CarsInventorySystem {
    private final CarsCatalog carsCatalog = new CarsCatalog();

    private final List<CarOrder> orders = new CopyOnWriteArrayList<>();

    public void makeOrder(String carName, int carId){
        Car car = carsCatalog.find(carName);
        CarOrder order = new CarOrder(carId, car);
        orders.add(order);
    }

    public void process(){
        for (CarOrder currOrder : orders){
            currOrder.completeOrder();
        }
    }

    public String report(){
        return "Liczba samochodów w katalogu wynosi: " + carsCatalog.totalCarsQuantity();
    }
}
