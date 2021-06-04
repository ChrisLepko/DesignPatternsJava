package Fabryka_Abstrakcyjna;

public class SportsCarFactory implements CarsFactory {

    @Override
    public Engine createEngine() {
        return new SportEngine();
    }

    @Override
    public Tire createTire() {
        return new SportTire();
    }
}
