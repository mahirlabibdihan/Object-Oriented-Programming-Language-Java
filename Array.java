// Array index must be a nonnegative integer
import java.util.Arrays;
public class Array {
	void modifyArray(int a[]){
		
	}
	public static void main(String[] args) {
		// int x[12]; // Error
		int x[]=new int[12];
		// When created by new, all the elements are initialized with default values
		// – byte, short, char, int, long, float and double are initialized to zero
		// – boolean is initialized to false

		int y[];
		y=new int[12];
		for(int i=0;i<12;i++)
		{
			y[i]=i;
			System.out.println(y[i]);
		}
		System.out.println(y);

		int[] z={1,2,3,4,5};	// Array of size 5

		int A[],B;

		int[] C,D;  // int c[],D[];

		// Sorting
		Arrays.sort(z);


		// Printing
		for(int i:y){
			System.out.println(i);
		}

		int X[][] = {{1,2,3},{4,5,6},{7,8,9}};

		for(int[] i:X){
			for(int j:i){
				System.out.println(j);
			}
		}
		
	}
}
