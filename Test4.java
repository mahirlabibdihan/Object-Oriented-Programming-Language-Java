public class Q {
public static void main (String [] args) {
Integer [] n1 = {10, 20, 30, 40, 50};
MyStats<Integer> s1 = new MyStats<>(n1);
System.out.println(s1.average());
Integer [] n2 = {50, 20, 40, 10, 30};
MyStats<Integer> s2 = new MyStats<>(n2);
System.out.println(s2.average());
System.out.println(s1.sameAvg(s2));
Double [] n3 = {50.0, 40.0, 30.0, 20.0, 10.0};
MyStats<Double> s3 = new MyStats<>(n3);
System.out.println(s3.average());
System.out.println(s2.sameAvgAny(s3));
}
}