// WildCard: ?
// MyClass<?> matches any MyClass Object

// class Stats<?>  // Invalid

class Stats<T> {
    T [] nums;

    Stats(T[] o) {
        nums = o;
    }

 	void sameAvg(Stats<T> obj) {

    }
    void sameAvgAny(Stats<?> obj) {  // No matter what T of obj is, this will work fine     
    }

    // Wild Card Can be Bounded
    void f3(Stats<? extends Number> obj){

    }
}


public class WildCard {
    public static void main(String[] args) {
        Integer [] n1 = {10, 20, 30, 40, 50};
        Stats<Integer> s1 = new Stats<>(n1);

        Integer [] n2 = {50, 20, 40, 10, 30};
        Stats<Integer> s2 = new Stats<>(n2);
        s1.sameAvg(s2);
        s1.sameAvgAny(s2);

        Double [] n3 = {50.0, 40.0, 30.0, 20.0, 10.0};
        Stats<Double> s3 = new Stats<>(n3);
        // s2.sameAvg(s3); // Invalid. That's why wild card is needed
        s2.sameAvgAny(s3);
    }
}
