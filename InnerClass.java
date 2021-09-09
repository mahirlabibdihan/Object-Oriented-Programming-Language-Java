// Non-static nested class is called inner-class.
// Inner-class has It has access to all of the variables and methods of its outer class and may refer to them directly.

// InnerClass's members can't be static
// modifier 'static' is only allowed in constant variable declarations
class InnerClass{
	private int n=0;
	class InnerClass1{
		static final int a=0;	// Valid
		// static final int b;		// InValid
		// static int c;			// InValid
		// static void f1(){		// InValid
			
		// }
		void f2(){				// Valid
			System.out.println(n);
		}
	}

	public static void main(String[] args){
		NestedClass nc = new NestedClass();
		NestedClass.InnerClass1 ic1 = nc.new InnerClass1();
	}
}