// Type Wrappers: Class that encapsulate a primitive type within an object.
// Immutable

// - Character
// - Boolean
// - Double,Float,Long,Integer,Short,Byte

public class Type_Wrappers{
	public static void main(String[] args){
		/*
		Integer iOb = new Integer(100); // Boxing
		int i = iOb.intValue(); // Unboxing
		*/		

		Integer iOb2 = 100; // Auto-Boxing
		int i2 = iOb2; // Auto-Unboxing


		iOb2++;		// iOb2(Integer) => iOb2(int) => iOb2++ => iOb2(Integer)

		Integer a = 100;
		Integer b = a;
		b = 10; // a is still 100. Because
	}
}