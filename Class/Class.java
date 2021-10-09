// A Java source file can contain multiple classes, but only one class can be a public class

// classes can't be private/protected. (Nested classes can)

// No access modifier means "package private". That means this class is only visible to other code within the same package.

// The source file name must match the name of the public class defined in the file with the .java extension

// Methods inside a normal class must have body. It means methods can't be declared, must be defined

class Animal{
	private String name="Dihan";
	public void PrintName()
	{
		System.out.println(this.name);
	}
}

class Class{
	public static void main(String[] args)
	{
		Animal Dog=new Animal();
		Dog.PrintName();
	}
}
