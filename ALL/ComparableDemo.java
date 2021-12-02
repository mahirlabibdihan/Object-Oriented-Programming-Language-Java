import java.util.*;
class TestClass implements Comparable<TestClass> {

    private String name;

    TestClass(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(TestClass o) {
        return this.name.compareTo(o.name);     // Ascending
        // return o.name.compareTo(this.name);     // Descending
    }
}

class ComparableDemo {

    public static void printList(List<TestClass> al) {
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i).getName() + "  ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        List<TestClass> al = new ArrayList<>();

        al.add(new TestClass("C"));
        al.add(new TestClass("A"));
        al.add(new TestClass("E"));
        al.add(new TestClass("B"));
        al.add(new TestClass("D"));
        al.add(new TestClass("F"));

        printList(al);
        Collections.sort(al);
        printList(al);
    }
}