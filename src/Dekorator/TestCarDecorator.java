package Dekorator;

public class TestCarDecorator {
    public static void main(String[] args) {
        Car car = new ColorDecorator(new EngineDecorator(new ModelDecorator(new SimpleAudiCar())));

        System.out.println(car.create());
    }
}
