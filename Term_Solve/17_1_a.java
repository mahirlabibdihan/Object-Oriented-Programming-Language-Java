import java.util.*;
import java.lang.*;

class Tokenizer{
	public static void main(String[] args){
		// String::split=> creates empty token
		Scanner sc= new Scanner(System.in);
		String s1 = sc.nextLine();

        // StringTokenizer=> doesn't create empty token
        StringTokenizer tokens = new StringTokenizer(s1);
        System.out.println(tokens.countTokens());
        while (tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken());
        }
	}
}