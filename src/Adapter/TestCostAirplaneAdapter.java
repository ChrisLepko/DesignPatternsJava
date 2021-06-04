package Adapter;

public class TestCostAirplaneAdapter {
    public static void main(String[] args) {
        Cost boeingDreamliner = new BoeingDreamliner();

        CostAdapter boeingDreamlinerAdapter = new CostAdapterImpl(boeingDreamliner);

        System.out.println("Cena w milionach złoty: " + boeingDreamlinerAdapter.getPrice());
    }
}
