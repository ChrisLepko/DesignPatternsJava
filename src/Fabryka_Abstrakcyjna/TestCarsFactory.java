package Fabryka_Abstrakcyjna;

public class TestCarsFactory {

    public static void main(String[] args) {
        CarsFactory sportCars = Factory.getCarType(CarType.SPORT);
        Engine sportEngine = sportCars.createEngine();
        Tire sportTire = sportCars.createTire();

        System.out.println("Rodzaj silnika: " + sportEngine.getEngineType());
        System.out.println("Rodzaj opony: " + sportTire.getTireType());

        System.out.println();

        CarsFactory familyCars = Factory.getCarType(CarType.FAMILY);
        Engine familyEngine = familyCars.createEngine();
        Tire familyTire = familyCars.createTire();

        System.out.println("Rodzaj silnika: " + familyEngine.getEngineType());
        System.out.println("Rodzaj opony: " + familyTire.getTireType());
    }
}
