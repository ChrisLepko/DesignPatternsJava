package Dekorator;

public class ColorDecorator extends CarDecorator {

    public ColorDecorator(Car customCar) {
        super(customCar);
    }

    @Override
    public String create() {
        return customCar.create() + addColor();
    }

    private String addColor(){
        return " + Czarny";
    }
}
