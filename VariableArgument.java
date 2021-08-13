class VariableArgument{
	// 1
	static void va(int ... v){
		for(int x:v){
			System.out.println(x);
		}
	}

	// 2
	static void va(boolean ... v){
		for(boolean x: v){
			System.out.println(x);
		}
	}

	// 3
	static void va(int n,int ... v){
		for(int x:v){
			System.out.println(x);
		}
	}
	public static void main(String[] args){
		va(); // Ambiguity between 1 and 2
		va(1,2,3);	// Ambiguity between 1 and 3
	}
}