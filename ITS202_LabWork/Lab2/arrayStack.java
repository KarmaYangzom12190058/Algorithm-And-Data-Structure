public class arrayStack{
	int size;
	int top;
	int[] array;

	public arrayStack(int x){
		size = 0;
		top = -1;
		array = new int[x];
	}

	//Returns the number of elements in the stack
	public int size(){
		return size;
	}

	//Returns a boolean indicating whether the stack is empty
	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}

	//Returns the top element of the stack, without removing it (or null if the stack is empty)
	public int top(){
		if(size == 0){
			return 0;
		}
		else{
			return array[top];
		}
	}

	//Adds element x to the top of the stack
	public void push(int x){
		if(size == 0){
			array[0] = x;
			top = 0;
		}
		else{
			array[top+1] = x;
			top = top+1;
		}
		size = size+1;
	}

	//Removes and returns the top element from the stack (or null if the stack is empty)
	public int pop(){
		if(size == 0){
			return 0;
		}
		else{
			top = top-1;
			size = size-1;
			return array[top+1];
		}
	}
}

