public class InsertionSort{
	public static void insertion(int[] array1){
		int n = array1.length;

		for(int i = 0; i < n-1; i++){
			for(int j = i+1; j > 0 && Compare(j-1, j, array1); j--){
				int temp = array1[j-1];
				array1[j-1] = array1[j];
				array1[j] = temp;
			}
		}
	}
	//to compare the elements in the array
	public static boolean Compare(int i, int j, int[] array1){
		if(array1[i] > array1[j]){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		int[] array = {3, 9, 11, 8, 14, 2};

		InsertionSort obj = new InsertionSort();

		System.out.println("Array before Sorting:");

		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		//calling function 
		obj.insertion(array);

		System.out.println("Array after Insertion Sort:");
		
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}