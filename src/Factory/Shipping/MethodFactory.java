package Factory.Shipping;


import Factory.Shipping.City.City;
import Factory.Shipping.Method.Express;
import Factory.Shipping.Method.Method;
import Factory.Shipping.Method.Normal;

public class MethodFactory extends ShippingFactory {
    @Override
    City getCity(String cityName) {
        return null;
    }

    @Override
    Method getMethod(String methodName) {
        Method method = null;

        switch (methodName) {
            case "normal":
                method = new Normal();
                break;
            case "express":
                method = new Express();
        }

        return method;
    }
}
