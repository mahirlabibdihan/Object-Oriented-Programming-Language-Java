public class Right_Shift{
	public static void main(String[] args)
	{
		int a=-1;	// 11111111 11111111 11111111 11111111

		a>>=31;		// 11111111 11111111 11111111 11111111
		System.out.println(a);
		a>>>=31;	// 00000000 00000000 00000000 00000001
		System.out.println(a);
	}
}