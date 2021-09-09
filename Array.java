// Array index must be a nonnegative integer
import java.util.Arrays;
public class Array {
	void modifyArray(int a[]) {

	}
	public static void main(String[] args) {
		// int x[12]; // Error
		int x[] = new int[12];
		// When created by new, all the elements are initialized with default values
		// – byte, short, char, int, long, float and double are initialized to zero
		// – boolean is initialized to false

		int y[];
		y = new int[12];
		for (int i = 0; i < 12; i++) {
			y[i] = i;
			System.out.println(y[i]);
		}
		System.out.println(y);

		int[] z = {1, 2, 3, 4, 5};	// Array of size 5

		int A[], B;

		int[] C, D; // int c[],D[];

		// Sorting
		Arrays.sort(z);


		// Printing
		for (int i : y) {
			System.out.println(i);
		}

		int X[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

		for (int[] i : X) {
			for (int j : i) {
				System.out.println(j);
			}
		}

		/*int x[][] = {
			{0},
			{1, 2},
			{3, 4, 5},
			{6, 7, 8, 9}
		};


		int x[][] = new int[4][];
		for (int i = 0; i < 4; i++) {
			x[i] = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				x[i][j] = (i) * (i + 1) / 2 + j;
			}
		}

		int x[][] = new int[4][];
		x[0] = new int[1];
		x[1] = new int[2];
		x[2] = new int[3];
		x[3] = new int[4];
		x[0][0] = 0;
		x[1][0] = 1; x[1][1] = 2;
		x[2][0] = 3; x[2][1] = 4; x[2][2] = 5;
		x[3][0] = 6; x[3][1] = 7; x[3][2] = 8; x[3][3] = 9;*/

	}
}
