package Dekorator;

public class EngineDecorator extends CarDecorator {

    public EngineDecorator(Car customCar) {
        super(customCar);
    }

    @Override
    public String create() {
        return customCar.create() + addEngine();
    }

    public String addEngine() {
        return " + 4.0 TFSI V8";
    }
}
