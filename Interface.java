/*
 ______   _________ _      _       _
|  ____ \|___   ___| |    | |     | |
| |    \ \   | |   | |____| |     | |
| |    | |   | |   |  ____  |     | |
| |____/ /___| |___| |    | |_____| |
|_______/|_________|_|    |_________|
M A H I R     L A B I B     D I H A N

*/

// We can call it a pure abstract class having no concrete methods
// A class can only extend from a single class, but a class can implement/extend multiple interfaces

// Simple Interface
interface Animal{
	/*public static final*/ int a=0;	// All variables declared in an interface are implicitly public, static and final

	/*public abstract*/ void call();	// Methods of interface can't be protected/private
			         			// Doesn't need to use abstract keyword explicitly
	// All methods declared in an interface are implicitly public and abstract
 

	// Interface method's can also have body in certain cases
 	// A default method lets you define a default implementation for an interface method
 	public default void f1(){f3();}		// Can't be protected/private

 	// Static method
 	// Not inherited by either an implementing class or subinterface
 	// So there is no need of protected
 	public static void f2(){}  // Can't be protected

 	// Private method
 	private void f3(){}  // can be called only by default/private method of same interface
}

// Extending Interfaces
interface Cat extends Animal{	// Only Interfacecan extend an Interface

	
}

interface A extends Animal,Cat{		// An interface can extend multiple interfaces too 
			
} 


// Implementing interface
abstract class B implements Animal{   // If a class implements an Interface and doesn't implement its methods then it must be an abstract class

}

class Dog implements Animal{
	@Override
	public void call()		// While implementing abstract methods of interface we must use public access specifier.
	{

	}

	// @Override
	// public void f1(){

	// }
}

class C extends Dog implements Animal,Cat{		
	// Dog has already implemented call method, so we don't need to do that again.
}

public class Interface{
    public static void main(String[] args){
    	Dog Tom=new Dog();

    	Tom.call();
    	// Anonymous Subclass
    	Animal Jerry=new Animal(){
	    	public void call()
			{

			}
    	};
    	Jerry.call();

    	// Animal.a=10;
 	}
}