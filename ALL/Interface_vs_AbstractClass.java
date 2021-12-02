// Interface: Implemented methods must be public
// Abstract class: Implemented methods can be anything

abstract class MyAbstractClass{
	abstract void f();	// Package
}

interface MyInterface{
	void f(); // Public
}

class ImplementsInterface extends MyAbstractClass implements MyInterface{
	@Override
	public void f(){

	}
}


class ExtendsAbstractClass extends MyAbstractClass{
	@Override
	void f(){	

	}
}


class Interface_vs_AbstractClass{
	public static void main(String[] args){

	}
}