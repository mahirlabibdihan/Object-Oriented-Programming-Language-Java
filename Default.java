// 1 : VALID
interface A {
  	default void f(){

  	}
}

interface B extends A{
	default void f(){

	}
}

class Default implements A,B{
	public static void main(String[] args){

	}
}


// 2; VALID
interface A {
  	default void f(){

  	}
}

interface B {
	default void f(){

	}
}

class Default implements A,B{
	@Override
	public void f(){

	}
	public static void main(String[] args){

	}
}

// 3: INVALID
interface A {
  	default void f(){

  	}
}

interface B {
	default void f(){

	}
}

class Default implements A,B{
	public static void main(String[] args){

	}
}

// 4: VALID
interface A {
  	void f();
}

interface B {
	void f();
}

class Default implements A,B{
	@Override
	public void f(){

	}
	public static void main(String[] args){

	}
}
