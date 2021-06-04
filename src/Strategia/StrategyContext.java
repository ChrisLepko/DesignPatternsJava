package Strategia;

public class StrategyContext {

    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute(int[] numbers){
        strategy.sortNumbers(numbers);
    }
}
