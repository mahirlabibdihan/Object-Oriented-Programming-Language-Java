public class AutoBoxingUnboxingDemo {
	static int f (Integer v) {
		return v;
	}
	public static void main (String args []) {
		Integer a = f (100);
		Integer iOb, iOb2;
		int i;
		iOb = 100;
		++iOb;
		iOb2 = iOb + (iOb / 3);
		i = iOb + (iOb / 3);
		Integer intOb = 100;
		Double doubleOb = 98.6;
		doubleOb = doubleOb + intOb;
	}
}