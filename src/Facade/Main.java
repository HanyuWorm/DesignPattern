package Facade;

public class Main {
    public static void main(String[] args) {
        /*
        * Facade Pattern được dùng để các ứng dụng phía client dễ dàng giao tiếp với hệ thống.
        * Thay vì phải làm việc với nhiều hệ thống/module con, Facade Pattern giúp ứng dụng client chỉ phải giao tiếp với 1 hệ thống duy nhất.

        Ví dụ: Trên màn hình đăng ký, ta nhập thông tin như username, email… sau đó sang màn hình tiếp theo nhập địa chỉ
         (quận/huyện, phường/xã, đường, số nhà…)
        rồi sang màn hình tiếp để nhập các thông tin liên lạc như số điện thoại…

        Rõ ràng client sẽ phải tốn nhiều thời gian và thao tác không thân thiện.
        Với Facade Pattern, ta gộp tất các thông tin đó vào một màn hình, và client chỉ cần giao tiếp với màn hình đó thôi.*/
        PersonFacade person = new PersonFacade();
        person.setInformation();
        person.display();
    }
}
