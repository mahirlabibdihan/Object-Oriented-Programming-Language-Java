// We can call it a pure abstract class having no concrete methods
// A class can only extend from a single class, but a class can implement multiple interfaces

// Simple Interface
interface Animal{
	void call();
}

// Extending Interfaces
interface Cat extends Animal{
	void sound();
}

// Implementing Interface
class Dog implements Animal{
	@Override
	public void call()
	{

	}
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
 	}
}