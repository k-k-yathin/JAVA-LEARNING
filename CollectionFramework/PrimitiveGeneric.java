class Box<T> {
    T value;

    Box(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class PrimitiveGenericDemo {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(10);
        Box<Double> doubleBox = new Box<>(5.5);
        Box<Character> charBox = new Box<>('A');

        System.out.println(intBox.getValue());
        System.out.println(doubleBox.getValue());
        System.out.println(charBox.getValue());
    }
}
