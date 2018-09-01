package Strategy.Car;

import Strategy.GoByDrivingAlgorithm;
import Strategy.Vehicle;

public class StreetRacer extends Vehicle {
    public StreetRacer(){

        setGoAlgorithm(new GoByDrivingAlgorithm());
    }
}
