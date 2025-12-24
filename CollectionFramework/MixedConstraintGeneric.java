class MixedGeneric<T extends Number & Comparable<T>> {
    T value;

    MixedGeneric(T value) {
        this.value = value;
    }

    double square() {
        return value.doubleValue() * value.doubleValue();
    }

    boolean isGreaterThan(T other) {
        return value.compareTo(other) > 0;
    }
}

public class MixedConstraintGeneric {
    public static void main(String[] args) {
        MixedGeneric<Integer> g1 = new MixedGeneric<>(10);
        MixedGeneric<Double> g2 = new MixedGeneric<>(3.5);

        System.out.println(g1.square());
        System.out.println(g1.isGreaterThan(5));
        System.out.println(g2.square());
        System.out.println(g2.isGreaterThan(2.0));
    }
}
