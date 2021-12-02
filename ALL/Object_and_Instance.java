// What is a object?
// An instance of a class. From one class we can create many instances .
// Creating an instance of a class is called instantiate .

class Animal{
	private int Height,Weight;
	Animal()
	{
		Height=Weight=0;
	}
	Animal(int Height,int Weight)
	{
		this.Height=Height;
		this.Weight=Weight;
	}
	public void Details()
	{
		System.out.println("Height : "+Height+"  Weight : "+Weight);
	}
}


public class Object_and_Instance {
	public static void main(String[] args) {
		// Creating an instance of a class is called instantiate .
		// An instance of class is created by calling its constructor and using the keyword new .
		new Animal(10,20);	
		//  Instantiation allocates the initial memory in the heap for the object and returns a reference .
		// To access the object a refernce variable should point to the allocated memory . So , we should assign the returned reference to a reference variable .
		// Creating reference variable of type Animal :
		Animal A1;
		// Object creation , Reference variable creation and Assigment :
		Animal A2 = new Animal(10,20);
		// To access an object we should always assign it to a reference variable at the time of creation .
		


		// An instance is required by non-static methods as they may operate on the non-static fields created by the constructor. Static methods don't need an instance .
		// Abstract classes can't be instantiated . But we can create reference variable of them .
	}
}
