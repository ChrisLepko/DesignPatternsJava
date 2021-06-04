package Dekorator;

public class ModelDecorator extends CarDecorator {

    public ModelDecorator(Car customCar) {
        super(customCar);
    }

    @Override
    public String create() {
        return customCar.create() + addModel();
    }

    public String addModel(){
        return " + RS6";
    }
}
