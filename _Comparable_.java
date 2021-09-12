import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Test implements Comparable<Test>{
    private String name;

    Test(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Test o) {
        return this.name.compareTo(o.name);
    }
}


public class _Comparable_ {
    public static void main(String[] args) {
        List<Test> tl = new ArrayList<>();
        tl.add(new Test("C"));
        tl.add(new Test("A"));

        Collections.sort(t);
    }
}