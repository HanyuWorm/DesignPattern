package Iterator;

public class App {
    public static void main(String[] args) {
//        StudentRepository repository = new StudentRepository();
//
//        for (IteratorPattern i = repository.getIterator(); i.hasNext();) {
//            System.out.println(i.next());
//        }
        NameRepository namesRepository = new NameRepository();

        for(IteratorPattern iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
