// A Java source file can contain multiple classes, but only one class can be a public class
// The source file name must match the name of the public class defined in the file with the .java extension

class Animal{
	private String name="Dihan";
	public void PrintName()
	{
		System.out.println(this.name);
	}
}

public class Class{
	public static void main(String[] args)
	{
		Animal Dog=new Animal();
		Dog.PrintName();
	}
}