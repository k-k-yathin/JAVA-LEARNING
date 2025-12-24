class GenericList1<T>{
    private T[] items=(T[]) new Object[10];
    private int count;
    public void add(T item){
         items[count++]=item;
    }
    public T get(int index){
        return items[index];
    }
}
public class GenericExample {
    public static void main(String[] args) {
        // in general
        // T-parameter type
        // E-element
        // K-key
        // N-number
        // V-value
        var iList=new GenericList1<Integer>();
        iList.add(1);
        iList.add(2);
        iList.add(3);
        System.out.println(iList.get(1));

        var sList=new GenericList1<String>();
        sList.add("Hello");
        sList.add("Guys");
        System.out.println(sList.get(0));

    }
}
