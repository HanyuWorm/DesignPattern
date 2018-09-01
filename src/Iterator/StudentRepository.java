package Iterator;

public class StudentRepository implements Container {
    public static String[] students = {"An", "Binh", "Chi"};
    @Override
    public IteratorPattern getIterator() {
        return new StudentIterator();
    }
    private static class StudentIterator implements IteratorPattern {

        int index;

        @Override
        public boolean hasNext() {
            return (index < students.length);
        }

        @Override
        public Object next() {
            return hasNext() ? students[index++] : null;
        }
    }
}
