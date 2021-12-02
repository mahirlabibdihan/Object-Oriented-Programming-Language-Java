
// The only way to call a non-static method from a static method is to have an instance of the class containing the non-static method. 


// static methods can't be override
/*
class A{
	public static void f(){

	}
}

class B extends A{
	@Override
	public static void f(){

	}
}
*/

class Static{
	static int a=0,b;
	int c;
	//Static block: 
	//–	Initialize static variables.
	//- Get executed exactly once, when the class is first loaded
	static{
		b=10;
	}

	// Non-static block
	{
		c=0;
	}
	void call(){
		new C1();
		this.new C1();
	}

	void f(){
		call();
		// call() means
		this.call();
	}

	interface I1{

	}

	class C1{

	}
	public static void main(String [] args){
		// static method can't refer to 'this' or 'super' 
		Static s = new Static();
		s.call();

		// Inner Interface can be directly accessed from static methods
		I1 c;
		Static.I1 d;

		C1 e =  s.new C1();
	}
}


// Only instance of classes can call non-static methods of that class
// Other non-static methods of a class can call that method directly or using this
// But a static method of a class can't call other non-static methods of that class
// So in a static method, we first need to create an instance of that class. And then call the non-static methods through that instance.