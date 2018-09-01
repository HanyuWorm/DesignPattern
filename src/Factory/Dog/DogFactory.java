package Factory.Dog;

public class DogFactory {
    public Dog getDog(String typeDog){
        switch (typeDog){
            case "Poodle":
                return new Poodle();
            case "Rottweiler":
                return new Rottweiler();
            case "SiberianHusky":
                return new SiberianHusky();
                default:
                    return null;
        }
    }

}
