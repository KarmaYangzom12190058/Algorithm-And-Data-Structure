public class arrayQueueTest{
	public static void main(String[] args){
		arrayQueue obj = new arrayQueue(9);

		obj.enqueue(5);
		obj.enqueue(8);
		obj.enqueue(2);
		obj.enqueue(1);
		obj.enqueue(7);

		assert(obj.is_empty() == false);
		assert(obj.dequeue() == 5);
		assert(obj.len() == 4);
		assert(obj.first() == 8);

		System.out.println("All Test Cases Passed");
	}
}