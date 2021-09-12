class X {
	int a = 1;
	void display () {
		Y obY = new Y ();
		obY.display();
		Z obZ = new Z ();
		obZ.display();
	}
	void showNested () {
		// System.out.println(b);
		// System.out.println(c);
	}
	class Y {
		int b = 2;
		void display () {
			System.out.println(a);
			System.out.println(b);
		}
	}
	static class Z {
		int c = 3;
		void display () {
			// System.out.println(a);
			System.out.println(c);
		}
	}
}
public class Test {
	public static void main (String [] args) {
		X obX = new X ();
		obX.display();
		obX.showNested();
		Y obY = new Y ();
		obY.display();
		Z obZ = new Z ();
		// obZ.display();
	}
}