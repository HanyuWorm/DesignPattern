package Factory.Shipping;


import Factory.Shipping.City.City;
import Factory.Shipping.City.DaNang;
import Factory.Shipping.City.HaNoi;
import Factory.Shipping.Method.Method;

public class CityFactory extends ShippingFactory{
    @Override
    City getCity(String cityName) {
        City city =null;
        switch (cityName){
            case "HaNoi":
                city=new HaNoi();
                break;
            case "DaNang":
                city=new DaNang();
                break;
            case "SaiGon":
                city=new DaNang();
                break;
            default:
                city=null;
                System.out.println("Null City");

        }
        return city;
    }

    @Override
    Method getMethod(String methodName) {
        Method method = null;
        return method;
    }
}
