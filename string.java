// Strings created using the String class cannot be modified (immutable)
public class string{
    public static void main(String[] args){
    	char c[]={'D','i','h','a','n'};
    	byte b[]={(byte)'D',(byte)'i',(byte)'h',(byte)'a',(byte)'n'};
    	String s1 = new String();
		String s2 = new String("Dihan");
		String s3 = "Dihan";
		String s4 = "Di"+"han";
		String s5 = new String(s2);
		String s6 = new String(c);
		String s7 = new String(b);
		String s8 = new String(c,0,2);
		String s9 = new String(b,2,3);
		String s10 = null;
		s10 = new String();
		// String s = new String(s1,0,2);
		// String s = new String("Dihan",0,2);	// Invalid

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
		System.out.println(s10);

		System.out.println(s2.length());
		for(int i=0;i<s2.length();i++)
		{
			System.out.print(s2.charAt(i)+" ");
		}
		System.out.println();


		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s8));
		System.out.println(s2.equalsIgnoreCase("DIHAN"));
		System.out.println(s2.compareTo(s3));	
		System.out.println(s8.compareTo(s9));
		System.out.println(s9.compareTo(s8));



		// == compares the String , also the way it is created
		// System.out.println(s2 == s3);	// false
		// System.out.println(s3 == s4);	// true
 	}

}
