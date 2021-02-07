class Animal{
	public String name="Dihan";
	public void PrintName()
	{
		System.out.println(this.name);
	}

}

class Dog extends Animal{
	@Override
	public void PrintName()
	{
		System.out.println("Nahid");
	}
	
}
public class Learn{
    public static void main(String[] args){     
        
        System.out.print("Hello ");
        System.out.println("World");   // Output
        System.out.printf("Hello World\n");

        java.util.Scanner input = new java.util.Scanner(System.in);
 		// int number = input.nextInt();	// Input
 		// String name = input.nextLine(); 
 		// double price = input.nextDouble();


 		// Variables
 		boolean A$2; // 1 bit - %b
 		byte A2 = 5;   // 8 bit
 		short A2_ = 5;  // 16 bit   
 		int A_2 = 5;	// 32 bit - %d
 		long _A2 =5L;	// 64 bit - %d
 		float $A_2 = 5.5f;   // 32 bit - %f
 		double A2$ = 5.5;  // 64 bit - %f
 		char A2_$;  // 16 bit - %c
 		String A$_2;  // %s


 		
 		// Arrays
 		int x[]= new int [10];
 		int y[]= {1,2,3,4,5,6,7,8,9,0};
 		int z[][]=new int[2][3];

 		// Arraylist
 		java.util.ArrayList<String> A = new java.util.ArrayList<String>();
 		A.add("1");
 		A.add("2"); 
 		java.util.List<Integer> B = new java.util.ArrayList<>();
 		B.add(1);
 		B.add(2);

 		System.out.println(A);
 		System.out.println(B);
 		System.out.println(Add(5,4));
 		Animal One=new Animal(); 
 		Dog Two=new Dog();
 		One.PrintName();
 		Two.PrintName();


    } 

    public static int Add(int a,int b)
    {
    	return a+b;
    }
} 


