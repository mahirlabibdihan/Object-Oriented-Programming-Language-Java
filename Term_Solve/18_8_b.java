interface iQueue<T extends Number>{
	void enqueue();
	void dequeue();
	boolean isEmpty();
}

class Queue<T extends Number> implements iQueue<T>{
	@Override
	public void enqueue(){

	}

	@Override
	public void dequeue(){

	}

	@Override
	public boolean isEmpty(){
		return true;
	}
}	