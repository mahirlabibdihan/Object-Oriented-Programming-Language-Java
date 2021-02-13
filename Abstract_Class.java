abstract class Animal{
	public abstract void call();
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
	    	public void call()
			{

			}
    	};
    	Jerry.call();
 	}
}