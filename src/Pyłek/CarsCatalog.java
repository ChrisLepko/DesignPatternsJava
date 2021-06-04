package Pyłek;

import java.util.HashMap;
import java.util.Map;

public class CarsCatalog {

    private Map<String, Car> cars = new HashMap<>();

    public Car find(String carName) {
        if(!cars.containsKey(carName)){
            cars.put(carName, new Car(carName));
        }
        return cars.get(carName);
    }

    public int totalCarsQuantity(){
        return cars.size();
    }
}
