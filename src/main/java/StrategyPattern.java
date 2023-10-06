public class StrategyPattern {

    private CalculationStrategy calculationStrategy;

    void calculate(){
        calculationStrategy.calculate();
    }

    public void setCalculationStrategy(CalculationStrategy calculationStrategy) {
        this.calculationStrategy = calculationStrategy;
    }
}

interface CalculationStrategy{
    void calculate();
}

class PolishCalculationStrategy implements CalculationStrategy {

    @Override
    public void calculate() {
        System.out.println("Liczę po polsku");
    }
}
class BritishCalculationStrategy implements CalculationStrategy {

    @Override
    public void calculate() {
        System.out.println("Liczę poza unią");
    }
}


