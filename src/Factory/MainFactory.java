package Factory;

public class MainFactory {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        carFactory.viewCar("HONDA");
        PhoneFactory phoneFactory = new PhoneFactory();
        phoneFactory.viewPhone(PhoneFactory.PhoneType.SAMSUNG);
    }
}
