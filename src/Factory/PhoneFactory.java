package Factory;

import Phone.*;

public class PhoneFactory {
    public void viewPhone(PhoneType typePhone){
        Phone phone ;
        if ("".equals(typePhone)){
            System.out.println("Phone can not null");
            return;
        }
        if ("SAMSUNG".equals(typePhone)){
            phone = new SamsungPhone();
            phone.showInfo();
        }else if ("APPLE".equals(typePhone)){
            phone = new ApplePhone();
            phone.showInfo();
        }else {
            System.out.println("Phone not in list");
        }
    }
    public enum PhoneType {
        SAMSUNG, NOKIA, APPLE
    }
}
