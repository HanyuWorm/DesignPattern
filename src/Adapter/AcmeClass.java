package Adapter;

public class AcmeClass implements AcmeInterface {
    String firstNameAce;
    String lastNameAce;
    @Override
    public void setFirtName(String firtName) {
        firstNameAce=firtName;
    }

    @Override
    public void setLastName(String lastName) {
    lastNameAce=lastName;
    }

    @Override
    public String getFirstName() {
        return firstNameAce;
    }

    @Override
    public String getLasttName() {
        return lastNameAce;
    }
}
