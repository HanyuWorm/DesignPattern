package Observer;

import java.util.ArrayList;
import java.util.List;

public class Event implements Subject {
    private String eventName;
    private List<Observer> obs = new ArrayList<Observer>();

    public Event(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public void registerObserver(Observer observer) {
        obs.add(observer);
    }

    @Override
    public void refuseObserver(Observer observer) {
        obs.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : obs){
            // cap nhat thong tin den tat ca khach hang dang ky nhan sms tu 199
            observer.update(eventName);
        }
    }
}
