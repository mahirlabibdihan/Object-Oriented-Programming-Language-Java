// nested class can be static and non-static
// Non-static nested class is called inner-class.
// Inner-class has It has access to all of the variables and methods of its outer class and may refer to them directly.

// And static nested class works same as normal nested class in c++
// Static nested class doesn't have access to members of outer class. They need an instance of outer class to access it's members.

// Static nested class vs Normal class: 
// Static nested class has access to private members
class NestedClass{
	private int n=0;
	class InnerClass1{
		static final int a=0;
		void f(){
			// System.out.println(n);
		}
	}

	static class InnerClass2{
		void f(){
			NestedClass a = new NestedClass();
			a.n=0;
		}	
		static void f1(){

		}
	}

	void f(){
		this.new InnerClass1().f();
		new InnerClass2().f();
		InnerClass2.f1();
	}

	public static void main(String[] args){
		NestedClass nc = new NestedClass();
		NestedClass.InnerClass1 ic1 = nc.new InnerClass1();
		NestedClass.InnerClass2 ic2 = new InnerClass2();
	}
}