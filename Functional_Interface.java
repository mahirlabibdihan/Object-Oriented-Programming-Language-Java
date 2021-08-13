/*
 ______   _________ _      _       _
|  ____ \|___   ___| |    | |     | |
| |    \ \   | |   | |____| |     | |
| |    | |   | |   |  ____  |     | |
| |____/ /___| |___| |    | |_____| |
|_______/|_________|_|    |_________|
M A H I R     L A B I B     D I H A N

*/

// A functional interface is an interface that contains only one abstract method.

@FunctionalInterface
interface Functional {
	void call();
}

class Functional_Interface {
	static void f(Functional f){

	}
	static void f2(){

	}
	void f1(){

	}
	public static void main(String args[]) {
		// Different ways to send functional interface as parameter
		// 1: By creating anonymous class
		f(new Functional() {
			@Override
			public void call() {
				System.out.println("Implements Functional Interface");
			}
		});


		// 2: Using Lambda
		f(()-> {
			System.out.println("Implements Functional Interface");
		});


		// 3: Non-Static method
		Functional_Interface fi1 = new Functional_Interface();
		f(()-> fi1.f1());
		
		f(()-> (new Functional_Interface()).f1());

		f(fi1::f1);
		

		// 4: Static Methpd
		Functional_Interface fi2 = new Functional_Interface();
		f(()-> Functional_Interface.f2());

		f(Functional_Interface::f2);
	}
}