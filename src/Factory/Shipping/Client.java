package Factory.Shipping;

import Factory.Shipping.City.City;
import Factory.Shipping.Method.Method;

public class Client {
    public static void main(String[] args) {
        ShippingFactory shippingFactory = new CityFactory();
        City city = shippingFactory.getCity("DaNang");

        MethodFactory methodFactory = new MethodFactory();
        Method method = methodFactory.getMethod("express");

        int fee = city.calc() + method.calc();
        System.out.println(fee);
    }
}
