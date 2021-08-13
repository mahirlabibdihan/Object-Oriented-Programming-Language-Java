import java.io.IOException;
class MyException extends Exception {
    String detail;
    MyException(String detail){
        this.detail = detail;
    }
    @Override
    public String toString(){
        return detail;
    }
}
public class Exception_Handling{
    public static void main(String[] args) throws Exception{
    	int a=5,b=0,c;
    	try{
    		c=a/b;
    		System.out.println(a+" / "+b+" = "+c);
    	} catch(ArithmeticException e){		
    		System.out.println(e);
    	} catch(NullPointerException e){       
            System.out.println(e);
        }finally{
    		System.out.println("End of Division");
    	}
        throw new MyException("Dihan");
 	}
}