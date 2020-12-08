public class arrayStackTest{
	public static void main(String[] args){
		arrayStack obj = new arrayStack(15);

		obj.push(11);
		obj.push(22);
		obj.push(33);
		obj.push(44);
		obj.push(55);
		obj.push(66);

	
		assert(obj.isEmpty() == false);
		assert(obj.size() == 6);
		assert(obj.pop() == 66);
		assert(obj.size() == 5);
		assert(obj.top() == 55);
			
		System.out.println("All Test Cases Passed");
	}
}