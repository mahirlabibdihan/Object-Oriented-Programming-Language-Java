import java.util.*;
import java.lang.*;

class Tokenizer{
	public static void main(String[] args){
		// String::split=> creates empty token
		String s1 = "Hello  world";
		String[] out = s1.split(" ");
		System.out.println(out.length);
		for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }

        // StringTokenizer=> doesn't create empty token
        StringTokenizer tokens = new StringTokenizer(s1);
        System.out.println(tokens.countTokens());
        while (tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken());
        }
	}
}

