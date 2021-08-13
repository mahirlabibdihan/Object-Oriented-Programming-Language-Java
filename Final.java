

// Declare a final variable, prevents its contents from being modified
// final variable must initialize when it is declared
// It is common coding convention to choose all uppercase identifiers for final variables
// final int FILE_NEW = 1;


// To prevent overriding
class A{
	final void f(){

	}
}

class B extends A{
	void f(){

	}
}



// To prevent inheritance
final class C{

}

class D extends C{

}

class Final{
	public static void main(String[] args){

	}
}