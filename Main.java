import java.util.*;
import java.lang.Math;

class Main {
	private static int minmax(String type,int ... n){
		if(type.equals("min")){
			int min=1<<30;
			for(int i:n){
				min = Math.min(min,i);
			}
			return min;
		}else{ 
			int max=0;
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