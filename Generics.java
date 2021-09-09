// It's like Template in C++
// Type Safe

// Class/Interface/Method(including constructor) can be generic

// T is the name of a type parameter. It can be bounded. 
// Primitive types can't be used as type parameter.
class MyGenerics1<T>{
	private T a;

    public void setObj(T a) {
        this.a = a;
    }

    public T getObj() {
        return this.a;
    }
}

// Parameterized type can be multiple
class MyGenerics2<T,S>{
}

//Interface can be generic
interface iStack<T>{

}
class MyStack implements iStack<Integer>{

}

class MyStack2<T> implements iStack<T>{

}


 // Constructor/Methood can be generic
class GenericMethod{
	public <T> GenericMethod(T arg){

	}
	public <V> void add(V v){

	}
	public static void main(String args[]){
		GenericMethod gen = new<Integer>GenericMethod(1);
		GenericMethod gen1 = new GenericMethod(1);
		gen.add(1);
		gen.<Integer>add(1);
	}
}

// Bounding (Upper Bound)
class X{}
class Y extends X{}
class Z{}

class MyGenerics3<T extends X>{   // Will be bounded in, classes that extends X or class X itself
}

// Bounded type can extend multiple class+interface
// Can extend atmost one class and multiple interaces
// If there are multiple interfaces+class, the one class should come first in order
interface W{}
interface V{}


class U extends X implements W,V{

}

// Will be bounded in, classes that extends X and implements W,V. 
// X,W,V alone is not within the bound
class MyGenerics4<T extends X & W & V>{		// X & Y & W(Two claseses) , W & X(class doesn't come first) => Invalid

}

public class Generics{
	public static void main(String args[]){
		MyGenerics1<Integer> gen = new MyGenerics1<>();
		MyGenerics1 noGen = new MyGenerics1();  // Valid

		// MyGenerics3<Z> gen1;  // Invalid: Z doesn't extends X

		MyGenerics4<U> gen2;

	}
}