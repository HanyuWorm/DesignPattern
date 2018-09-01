package DependencyInjection.DataBase;

public class Main {
    public static void main(String[] args) {
        /*
         1.Các module cấp cao không nên phụ thuộc vào các modules cấp thấp. Cả 2 nên phụ thuộc vào abstraction.
         2. Interface (abstraction) không nên phụ thuộc vào chi tiết, mà ngược lại.
        ( Các class giao tiếp với nhau thông qua interface, không phải thông qua implementation.)*/
        Client client = new Client();
        client.execute();
    }
}
