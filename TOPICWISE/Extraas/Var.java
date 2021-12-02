

public class Var{
    public static void main(String[] args){
 		var A=1;	// var variable must be initialized 
 		var B=new Var();
 		// var cannot be used as the name of a class . But can be used as identifier .
 		int var;

 		// var can be used to declare an array type, but cannot be used with an array initializer
 		var x=new int[5];
 		// var x={1,2,3}; // Invalid 

 		// var is not allowed as an element type of an array

 		// var x[]=new int[5]; // Invalid

 		// var cannot be used to declare a variable with null as the initializer

 		// var A=null;	// Invalid

 		// var can be used only to declare local variables, it cannot be used when declaring instance variables, parameters, or return types

 	}
}