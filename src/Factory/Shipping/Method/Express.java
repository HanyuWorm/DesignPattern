package Factory.Shipping.Method;

public class Express implements Method {
    @Override
    public int calc() {
        return 15000;
    }
}
