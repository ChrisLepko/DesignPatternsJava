package Dekorator;

public abstract class CarDecorator implements Car{
    protected Car customCar;

    public CarDecorator(Car customCar) {
        this.customCar = customCar;
    }

    @Override
    public String create() {
        return customCar.create();
    }
}
