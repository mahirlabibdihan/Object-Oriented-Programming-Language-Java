// java MyClass arg1 arg2 … argN
// Words after the class name are treated as command-line arguments by Java
// Java creates a separate String object containing each command-line argument, places them in a String array and supplies that array to main
// That’s why we have to have a String array parameter (String args[ ]) in main


public class Command_Line_Argument {
	public static void main(String[] args) {
		System.out.println(args.length);

		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
}