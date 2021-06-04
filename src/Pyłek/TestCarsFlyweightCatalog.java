package Pyłek;

public class TestCarsFlyweightCatalog {
    public static void main(String[] args) {

        CarsInventorySystem carsInventorySystem = new CarsInventorySystem();

        carsInventorySystem.makeOrder("Porshe cayenne", 911);
        carsInventorySystem.makeOrder("Lamborghini Aventador", 913);
        carsInventorySystem.makeOrder("Subaru Impreza", 324);
        carsInventorySystem.makeOrder("Audi RS6", 591);

        carsInventorySystem.makeOrder("Porshe cayenne", 234);
        carsInventorySystem.makeOrder("Audi RS6", 456);

        carsInventorySystem.process();

        System.out.println();

        System.out.println(carsInventorySystem.report());

    }
}
