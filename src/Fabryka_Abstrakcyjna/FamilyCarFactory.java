package Fabryka_Abstrakcyjna;

public class FamilyCarFactory implements CarsFactory {

    @Override
    public Engine createEngine() {
        return new FamilyEngine();
    }

    @Override
    public Tire createTire() {
        return new FamilyTire();
    }
}
