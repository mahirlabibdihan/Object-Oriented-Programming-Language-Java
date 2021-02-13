// Multilevel inheritance but no multiple inheritance

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

class Dog extends Animal{
	String Name;
	Dog()
	{
		super();
		Name=null;
	}
	Dog(String Name,int Height,int Weight)
	{
		super(Height, Weight);
		this.Name=Name;
	}
	@Override
	public void Details()
	{
		System.out.println("I am "+Name+" .");
		super.Details();
	}
}
public class Inheritence{
	public static void main(String[] args){
		Dog Tom=new Dog("Tom",100,50);

		Tom.Details();
	}
}