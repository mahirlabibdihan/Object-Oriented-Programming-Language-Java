public class Input_Output
{

	public static void main(String[] args)
	{
		// O U T P U T
		System.out.println("Hello World");
		System.out.print("Hello World\n");
		System.out.printf("%s\n","Hello World");

		// Using JOptionPane
		javax.swing.JOptionPane.showMessageDialog(null,"Hello World");


		// I N P U T
		// Using Scanner - Can take all types of input
		java.util.Scanner sc= new java.util.Scanner(System.in);
		

		int a=sc.nextInt();
		System.out.println("Input : "+a);
		System.out.printf("Input : %d\n",a);

		float b=sc.nextFloat();
		System.out.println("Input : "+b);
		System.out.printf("Input : %f\n",b);
		System.out.printf("Input : %g\n",b);

		long c=sc.nextLong();
		System.out.println("Input : "+c);
		System.out.printf("Input : %d\n",c);

		double d=sc.nextDouble();
		System.out.println("Input : "+d);
		System.out.printf("Input : %f\n",d);
		System.out.printf("Input : %g\n",d);

		boolean e=sc.nextBoolean();
		System.out.println("Input : "+e);
		System.out.printf("Input : %b\n",e);

		byte f=sc.nextByte();
		System.out.println("Input : "+f);
		System.out.printf("Input : %d\n",f);

		short g=sc.nextShort();
		System.out.println("Input : "+g);
		System.out.printf("Input : %d\n",g);

		// Whole Line
		sc.nextLine();
		String h=sc.nextLine();
		System.out.println("Input : "+h);
		System.out.printf("Input : %s\n",h);

		// Single Word
		String j=sc.next();
		System.out.println("Input : "+j);
		System.out.printf("Input : %s\n",j);

		// Single character
		char k=sc.next().charAt(0);
		System.out.println("Input : "+k);
		System.out.printf("Input : %c\n",k);

		// Using JOptionPane - Can only take String Input
		String i=javax.swing.JOptionPane.showInputDialog(null,"Enter name : ");
		System.out.println("Input : "+i);
		System.out.printf("Input : %s\n",i);
	}
}