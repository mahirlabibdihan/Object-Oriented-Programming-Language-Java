public class Exception_Handling{
    public static void main(String[] args){
    	int a=5,b=0,c;
    	try{
    		c=a/b;
    		System.out.println(a+" / "+b+" = "+c);
    	} catch(Exception e){		// ArithmeticException e
    		System.out.println(e);
    	} finally{
    		System.out.println("End of Division");
    	}
 	}
}