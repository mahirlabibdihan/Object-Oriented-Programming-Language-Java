class Outer {
	int outer_x = 5;
	void test () {
		Inner inner = new Inner();
		inner.display() ;
	}
	class Inner {
		int z = 60;
		void display() {
			System.out.println(outer_x);
		}
	}
	void showz() {
		//System.out.println(z);	// Outer class can't access member(z) of inner class
	}
}