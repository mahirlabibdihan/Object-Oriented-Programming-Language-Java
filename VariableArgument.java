import java.util.*;
import java.lang.Math;

class Main {
	private static int minmax(String type,int ... n){
		if(type.equals("min")){
			int min=Integer.MAX_VALUE;
			for(int i:n){
				min = Math.min(min,i);
			}
			return min;
		}else{ 
			int max=Integer.MIN_VALUE;
			for(int i:n){
				max = Math.max(max,i);
			}
			return max;
		}
	}
	public static void main (String [] args) {
		int a = minmax ("min", 2, 1, 6, 4, 5); // a = 1
		int b = minmax ("min", 3, 0, 6); // b = 0
		int c = minmax ("max", 1, 2, 6, 5); // c = 6
		int d = minmax ("max", 1, 3, 7); // d = 7
	}
}
class VariableArgument{
	VariableArgument(int ... v){

	}
	// 1
	static void va(int ... v){
		for(int x:v){
			System.out.println(x);
		}
	}

	// 2
	static void va(boolean ... v){
		for(boolean x: v){
			System.out.println(x);
		}
	}

	// 3
	static void va(int n,int ... v){
		for(int x:v){
			System.out.println(x);
		}
	}

	// 4 : ERROR : Varargs as first parameter
	static void va(int ... v,int n){
		for(int x:v){
			System.out.println(x);
		}
	}

	// 5 : ERROR : Multiple varargs
	static void va(int ... u,int ... v){
		for(int x:v){
			System.out.println(x);
		}
	}

	public static void main(String[] args){
		va(); // Ambiguity between 1 and 2
		va(1,2,3);	// Ambiguity between 1 and 3
	}
}