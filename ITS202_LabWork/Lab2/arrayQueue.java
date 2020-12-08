public class arrayQueue{
	int front;
	int rear;
	int first;
	int len;
	int[] array;

	public arrayQueue(int x){
		front = -1;
		rear = -1;
		first = -1;
		len = 0;
		array = new int[x];
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
		return false;
	}

	//Returns a reference to the front of the queue, without removing it; an error occurs if the queue is empty
	public int first(){
		if(is_empty()){
			return 0;
		}
		else{
			return array[front];
		}
	}

	//Add element to the back of the Queue
	public void enqueue(int x){
		if(is_empty()){
			array[0] = x;
			front = 0;
			rear = 0;
			first = array[0];
		}
		else{
			array[rear+1] = x;
			rear = rear+1;
		}
		len = len + 1;
	}

	//Remove and return the first element from queue
	public int dequeue(){
		if(is_empty()){
			return 0;
		}
		else{
			front = front+1;
			len = len-1;
			return array[front-1];
		}
	}
}