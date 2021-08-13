// creating nested class object from a static method

// nested class can be static and non-static

class NestedClass{
	class InnerClass1{

	}

	static class InnerClass2{
		
	}

	public static void main(String[] args){
		NestedClass nc = new NestedClass();
		NestedClass.InnerClass1 ic1 = nc.new InnerClass1();
		NestedClass.InnerClass2 ic2 = new InnerClass2();
	}
}