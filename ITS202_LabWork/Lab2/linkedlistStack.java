class Node{
	public int element;
	public Node next;

	//constructor
	public Node(int element, Node next){
		this.element = element;
		next = null;
	}
}
public class linkedlistStack{
	Node top;
	Node head;
	Node tail;
	int size;

	public linkedlistStack(){
		top = null;
		head = null;
		tail = null;
		size = 0;
	}

	//Returns the number of elements in the stack
	public int size(){
		return size;
	}

	//Returns a boolean indicating whether the stack is empty
	public boolean isEmpty(){
		if(this.top == null){
			return true;
		}
		else{
			return false;
		}
	}

	//Returns the top element of the stack, without removing it (or null if the stack is empty)
	public int top(){
		if(isEmpty()){
			return 0;
		}
		else{
			return top.element;
		}
	}

	//Adds element x to the top of the stack
	public void push(int x){
		Node newest = new Node(x, null);
		if(this.isEmpty()){
			this.head = newest;
			this.top = newest;
			this.tail = newest;
		}
		else{
			this.top.next = newest;
			this.top = newest;
		}
		size = size + 1;
	}

	//Removes and returns the top element from the stack (or null if the stack is empty)
	public int pop(){
		if(this.isEmpty()){
			return 0;
		}
		else{
			int i = this.top.element;

			//for only one node
			if(this.head == this.top){
				this.top = null;
				this.head = null;
			}
			else{
				Node newest = this.head;
				while(newest.next != this.top) //iterating to the last element
				newest = newest.next;
				newest.next = null;
				this.top = newest;
			}
			size = size - 1;
			return i;
		}
	}
}