public class Swap {
	public static void main(String[] args) {
		int x=5,y=10;
		System.out.println(x+" "+y);
		int temp=x;
		x=y;
		y=temp;
		System.out.println(x+" "+y);
		x+=(y-(y=x));
		System.out.println(x+" "+y);
	}
}
 