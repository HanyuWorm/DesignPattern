package Factory.Dog;

public class Poodle implements Dog {
    @Override
    public void speak() {
        System.out.println("The poodle says \"arf\"");
    }
}
