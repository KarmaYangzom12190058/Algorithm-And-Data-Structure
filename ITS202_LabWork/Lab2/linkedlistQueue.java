class Node{
	public int element;
    public Node next;

    //constructor
	public Node(int element, Node next){
		this.element = element;
		next = null;
	}
}
public class linkedlistQueue{
	Node front;
	Node rear;
	Node head;
	int len;

	public linkedlistQueue(){
		front = null;
		rear = null;
		head = null;
		len = 0;
	}

	//Returns the number of elements in queue
	public int len(){
		return len;
	}

	//Returns true if queue does not contain any element
	public boolean is_empty(){
		if(len == 0){
			return true;
		}
		else{
			return false;
		}
	}

	//Returns a reference to the front of the queue, without removing it; an error occurs if the queue is empty
	public int first(){
		if(is_empty()){
			return 0;
		}
		else{
			return front.element;
		}
	}

	//Add element to the back of the Queue
	public void enqueue(int x){
		Node newest = new Node(x, null);
		if(this.is_empty()){
			this.head = newest;
            this.rear = newest;
            this.front = newest;
		}
		else{
			this.rear.next = newest;
            this.rear = newest;
		}
		len = len + 1;
	}

	//Remove and return the first element from queue
	public int dequeue(){
        int i = front.element;
        if (is_empty()) {
        	return 0;
        }
        else {
            front = front.next;
        }
        len = len - 1;
        return i;
    }
}
