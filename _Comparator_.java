import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// To sort array/list of objects of a class, that class must implement Comparable

class Test {
	private String name;

	Test(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}

class TestComparator implements Comparator<Test> {
	@Override
	public int compare(Test o1, Test o2) {
		return o1.getName().compareTo(o2.getName());
	}
}


public class _Comparator_ {
	public static void main(String[] args) {
		List<Test> tl = new ArrayList<>();
		tl.add(new Test("C"));
		tl.add(new Test("A"));

		Collections.sort(tl, new TestComparator());

		Collections.sort(tl, new Comparator<Test>() {
			@Override
			public int compare(Test o1, Test o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		Collections.sort(tl,(o1, o2)-> o1.getName().compareTo(o2.getName()));
	}
}