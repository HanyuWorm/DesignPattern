package Strategy.Car;

import Strategy.GoByDrivingAlgorithm;
import Strategy.Vehicle;

public class FormulaOne extends Vehicle {
    public FormulaOne(){
        setGoAlgorithm(new GoByDrivingAlgorithm());
    }

}
