package Iterator;

public class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora","Robert2"};
    public Person[] person ={};
    @Override
    public IteratorPattern getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements IteratorPattern {
        int index;
        @Override
        public boolean hasNext() {
            if((index < names.length)){
                if (names[index].contains("Robert")) {
                    System.out.println("" + names[index]);
                    return true;
                }

            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }

}
