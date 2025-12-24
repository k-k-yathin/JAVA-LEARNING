import java.util.Iterator;

@SuppressWarnings("unchecked")
class GenericList<T> implements Iterable<T> {

    public T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < count;
        }

        @Override
        public T next() {
            return items[index++];
        }
    }
}

public class NeedOfIterableInterface {
    public static void main(String[] args) {

        var list = new GenericList<String>();
        list.add("Value 1");
        list.add("Value 2");
        list.add("Value 3");

        for (var item : list) {
            System.out.println(item);
        }

        // Direct array iteration (not recommended for collections)
        for (var item : list.items) {
            if (item != null)
                System.out.println(item);
        }
    }
}
