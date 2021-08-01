import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class TestClassComparator implements Comparator<TestClass> {

    @Override
    public int compare(TestClass o1, TestClass o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

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
        return this.name.compareTo(o.name);
    }
}

class ComparatorDemo {

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
        //Collections.sort(al);
        Collections.sort(al);
        //Collections.sort(al, new TestClassComparator());
        printList(al);
    }
}