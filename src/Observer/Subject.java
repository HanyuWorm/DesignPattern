package Observer;

public interface Subject {
    // Tu choi tin nhan tu 199 (option)
    void refuseObserver(Observer observer);
    // Cap nhat thong tin den tat ca cac thue bao
    void notifyObserver();
    // Tiep tuc Nhan tin nhan tu 199 ( default)
    void registerObserver(Observer observer);
}
