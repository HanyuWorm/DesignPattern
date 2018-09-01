package Factory.Dog;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new DogFactory().getDog("Poodle");
        dog.speak();
        dog = new DogFactory().getDog("SiberianHusky1");
        dog.speak();
    }
}
