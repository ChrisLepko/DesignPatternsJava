package Metoda_Szablonowa;

public class LuxuryCar extends Car {


    @Override
    public void addEngine() {
        System.out.println("Zamontowano silnik sportowy.");
    }

    @Override
    public void constructDoors() {
        System.out.println("Skonstruowano drzwi.");
    }

    @Override
    public void addElectricity() {
        System.out.println("Dodano elektrykę.");
    }

    @Override
    public void installTires() {
        System.out.println("Zamontowano sportowe opony.");
    }

    @Override
    public void paintCar() {
        System.out.println("Pomalowano samochód.");
    }
}
