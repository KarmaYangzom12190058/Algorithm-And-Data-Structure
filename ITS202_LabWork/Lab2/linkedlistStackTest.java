public class linkedlistStackTest{
	public static void main(String[] args){
		linkedlistStack obj = new linkedlistStack();

		obj.push(3);
		obj.push(7);
		obj.push(8);

		assert(obj.isEmpty() == false);
		assert(obj.size() == 3);
		assert(obj.pop() == 8);
		assert(obj.top() == 7);
		assert(obj.size() == 2);

		System.out.println("All Test Cases Passed");
	}
}