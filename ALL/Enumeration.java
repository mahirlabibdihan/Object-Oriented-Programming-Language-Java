// Enumeration is a class/reference type. But it can't instantiate using new.

// Unlike c, enum constants doesn't have any specfic values.
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

// But we can set values to the constants using constructor
enum Book{
	Math(10),English,Bangla,Physics,Chemistry;		// ; needs to be used if wee add constructor/methods
	private int price;

	// Enum constructors must be private
	// Constructor is called for every constant when we create our first enumeration object
	private Book(){
		price=0;
		System.out.println("Default");
	}
	private Book(int price){
		this.price = price;
		System.out.println("Parameter");
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
}

public class Enumeration{
	public static void main(String[] args){
			Apple ap;
			ap = Apple.Jonathan;	// Instantiation
			System.out.println(ap);		// It will print the name of constant

			switch (ap) {
            case Jonathan:		// Constants can be used here without enum name
                System.out.println("Jonathan is red.");
                break;
        	}

			// valueOf(s) returns the enum constant whose value corresponds to the string passed in
			ap = Apple.valueOf("GoldenDel");			
			System.out.println(ap);	

			// values() will return an array of all the enum constant
			Apple[] allApples = Apple.values();
			for (Apple a : allApples) {
            	System.out.println(a);
        	}  	

        	Book b1 = Book.Chemistry;
        	Book b2 = Book.Math;
        	System.out.println(b1+": "+b1.getPrice());
        	System.out.println(b2+": "+b2.getPrice());
	}		
}