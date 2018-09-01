package Factory;

import Factory.Car.Car;
import Factory.Car.*;
public class CarFactory {
    public void viewCar(String carType){
        Car car;
        if (carType.equalsIgnoreCase("HONDA")) {
            car = new Honda();
            car.view();
        } else if (carType.equalsIgnoreCase("NEXUS")) {
            car = new Nexus();
            car.view();
        }
    }
}
