package Fabryka_Abstrakcyjna;

public class Factory {

    public static CarsFactory getCarType(CarType carType){
        switch (carType){
            case SPORT:
                return new SportsCarFactory();
            case FAMILY:
                return new FamilyCarFactory();
            default:
                return null;
        }
    }
}
