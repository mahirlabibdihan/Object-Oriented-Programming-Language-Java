/*
	public
	private
	protected
	package
*/

// While overriding methods, we can change access specifiers.
// But we can't assign weaker access specifier
// Like we can go from package to public . Not to private

// Valid transformation
// Public -> Public
// Protected -> Protected
// Protected -> Public
// Package -> Package
// Package -> Public
// Package -> Protected

// Public > Protected > Package > Private

abstract class A{
	abstract void f();	// Package

	abstract protected void f1();  // Public 
}

class B extends A{

	// Valid
	@Override
	void f(){	// Package

	}

	// Valid
	/*@Override
	public void f(){	// public

	}*/

	// Valid
	/*@Override
	protected void f(){	// protected

	}*/

	// InValid
	/*@Override
	private void f(){	// private

	}*/

	@Override
	private void f1(){	// private

	}

}
class Access_Specifier{
	protected void f(){

	}
	public static void main(String args[]){

	}
}