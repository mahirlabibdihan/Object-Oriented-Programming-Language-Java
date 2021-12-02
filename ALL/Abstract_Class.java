abstract class Animal{
	public abstract void call();
}

abstract class Cat extends Animal{		// Extending abstract class without implementing abstract method(s) makes the class abstract

}

class Dog extends Animal{
	@Override
	public void call()
	{

	}
}

public class Abstract_Class{
    public static void main(String[] args){
    	Dog Tom=new Dog();

    	Tom.call();
    	// Anonymous Subclass
    	Animal Jerry=new Animal(){
    		@Override
	    	public void call()
			{

			}
    	};
    	Jerry.call();
 	}
}