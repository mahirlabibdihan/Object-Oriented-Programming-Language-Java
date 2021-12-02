// super() must always be the first statement executed inside a subclass’ constructor
// So super() can be called only once in a constructor
// If a constructor does not explicitly invoke a superclass constructor by using super(), the Java compiler automatically inserts a call to the no-argument constructor of the superclass.

// super() calls the cunstructor of base class
// super can be used to call parent class’ variables and methods.

class Base{
	int a;
	Base(){
		System.out.println("default constructor");
	}
	Base(int n){
		System.out.println("parameterized constructor");
	}
}
class Super extends Base{
	Super(){
		super(10);
		super.a=10;
	}
	public static void main(String args[]){
		Super s = new Super();
	}
}
