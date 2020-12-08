public class BSTrecursiveTest{
	public static void main(String[] args){
		BSTrecursive<Integer, String> bst = new BSTrecursive<Integer, String>();

		bst.put(1, "Yang");
		bst.put(2, "Sangay");
		bst.put(3, "Tashi");
		bst.put(4, "Pema");
		bst.put(5, "Thinley");

		assert(bst.isEmpty() == false);
		assert(bst.size() == 5);
		assert(bst.min() == 1);
		assert(bst.floor(6) == 5);
		assert(bst.floor(3) == 3);
		assert(bst.select(3) == 4);
		assert(bst.get(2) == "Sangay");

		System.out.println(bst.keys(1, 4));

		System.out.println("All Test Cases Passed!");

		
	}
}