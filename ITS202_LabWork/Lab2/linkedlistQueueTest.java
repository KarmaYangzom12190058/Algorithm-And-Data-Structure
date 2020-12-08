public class linkedlistQueueTest{
	public static void main(String[] args) {
		linkedlistQueue obj = new linkedlistQueue();

		obj.enqueue(2);
		obj.enqueue(5);
		obj.enqueue(4);
		obj.enqueue(9);
		obj.enqueue(1);

		assert(obj.is_empty() == false);
		assert(obj.len() == 5);
		assert(obj.first() == 2);
		assert(obj.dequeue() == 2);
		assert(obj.len() == 4);

		System.out.println("All Test Cases Passed");
	}
}