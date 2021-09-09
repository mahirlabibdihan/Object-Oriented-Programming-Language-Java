interface x1{
	void m1();
	void m2();
}

interface x2 extends x1{
	void m3();
	void m4();
}

interface x3 extends x2{
	void m5();
	void m6();
}

interface x4 extends x3{
	void m7();
	void m8();
}

class MyClass implements x4{
	public void m1(){

	}
	public void m2(){
		
	}
	public void m3(){
		
	}
	public void m4(){
		
	}
	public void m5(){
		
	}
	public void m6(){
		
	}
	public void m7(){
		
	}
	public void m8(){
		
	}
}