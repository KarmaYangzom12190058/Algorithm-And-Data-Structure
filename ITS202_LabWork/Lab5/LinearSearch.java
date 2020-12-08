public class LinearSearch{
	public static int linearsearch(int[] array, int element){
		for(int i = 0; i < array.length-1; i++){
			if(array[i] == element){
				System.out.println("Element: "+array[i]);
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int[] array = {6, 0, 7, 1, 4, 8};
		int element = 7;

		int ele_found = linearsearch(array, element);

		if(ele_found == -1){
			System.out.println("Element not found!");
		}
		else{
			System.out.println("Element is found at index: " +ele_found);
		}
	}
}