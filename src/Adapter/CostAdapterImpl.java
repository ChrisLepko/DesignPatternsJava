package Adapter;

public class CostAdapterImpl implements CostAdapter {

    private Cost airplanes;

    public CostAdapterImpl(Cost airplanes) {
        this.airplanes = airplanes;
    }

    @Override
    public double getPrice() {
        return convertUSDtoPLN(airplanes.getPrice());
    }

    private double convertUSDtoPLN(double usd){
        return usd * 3.68;
    }
}
