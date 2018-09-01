package Observer;
public class MainObserver {
    public static void main(String[] args) {
        Customer c1 = new Customer("Mai Xuan Huu \n");
        Customer c2 = new Customer("Le Minh Hieu \n");
        Customer c3 = new Customer("TA VAN HUNG \n");

        Event ev1 = new Event("Nhan dip 20-10 \n");
        Event ev2 = new Event("Nhan dip 20-11 \n");
        Event ev3 = new Event("Nhan dip KM \n");

        ev1.registerObserver(c1); // sự kiện 1 đăng ký khách hàng c1
        ev1.registerObserver(c2);//sự kiện  1 đăng ký khách hàng c2
        ev1.notifyObserver(); // gửi thông báo 1 đến c1,c2
        ev1.refuseObserver(c1);

        ev2.registerObserver(c1); // sự kiện 2 đăng ký khách hàng c1
        ev2.registerObserver(c2); // sự kiện 2 đăng ký khách hàng c2
        ev2.notifyObserver(); //gửi thông báo 2 đến c1,c2

        ev3.registerObserver(c3);
        ev3.notifyObserver();
    }
}
