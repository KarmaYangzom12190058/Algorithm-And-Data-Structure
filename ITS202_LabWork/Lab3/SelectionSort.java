public class SelectionSort{
	public static void selection(int array1[]){
		int n = array1.length;

		for(int i = 0; i < n-1; i++){
			int lowestindex = i;

			for(int j = i+1; j < n; j++){
				if(array1[j] < array1[lowestindex]){
					lowestindex = j; //to find the minimum element in the unsorted array
				}
			}

			int temp = array1[lowestindex];
			array1[lowestindex] = array1[i];
			array1[i] = temp; //Using temp variable, to swap the minimum element with first element of the sorted array 
		}
	}
	public static void main(String[] args){

		int[] array = {3, 9, 11, 8, 14, 2};
		
		System.out.println("Array before Sorting:");

		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();

		System.out.println("Array after Selection Sort:");

		//calling function 
		selection(array);
		for(int i:array){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}