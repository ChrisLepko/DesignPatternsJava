package Metoda_Szablonowa;

public abstract class Car {

    public final void constructNewCar(){
        constructBackbone();
        addEngine();
        constructDoors();
        addElectricity();
        installTires();
        paintCar();
        completeCarConstruction();
    }

    public final void constructBackbone(){
        System.out.println("Stworzono szkielet samochodu.");
    }
    public abstract void addEngine();
    public abstract void constructDoors();
    public abstract void addElectricity();
    public abstract void installTires();
    public abstract void paintCar();

    public final void completeCarConstruction(){
        System.out.println("Samochód został stworzony pomyślnie.");
    }
}
