package Factory.Dog;

public class SiberianHusky implements Dog {
    @Override
    public void speak() {
        System.out.println("The husky says \"Dude, what's up?\"");
    }
}
