package Factory.Shipping;

import Factory.Shipping.City.City;
import Factory.Shipping.Method.Method;

public abstract class ShippingFactory {
    abstract City getCity(String cityName);
    abstract Method getMethod(String methodName);
}
