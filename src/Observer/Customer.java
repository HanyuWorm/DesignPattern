package Observer;

public class Customer implements Observer {
    String name;
    @Override
    public void update(String sms) {
        System.out.println(" xin chao :"+name+sms+"Viettel Khuyen Mai 100% gia tri the nap");
    }
    public Customer(String name) {
        super();
        this.name = name;
    }
}
