// Class Object is the root of the class hierarchy. Every class has Object as a superclass. All objects, including arrays, implement the methods of this class.

@FunctionalInterface
interface EqualsInterface {
   boolean equals(Object obj); // The compiler gives the error: "EqualsInterface is not a functional interface: no abstract method found in interface EqualsInterface". Why? Since the method equals is from Object, it is not considered as a functional interface. 
}

interface A{
	boolean equals(Object obj);
}
class B implements A{
	// Doesn't need to implement equals. Because it's already implemented in Object
}
class ObjectClass{
	public static void main(String[] args){

	}
}