public class BubbleSort{
	public static void bubble(int array1[]){
		int n = array1.length;

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n-1; j++){
				if(array1[j] > array1[j+1]){
					//to swap elements using temp variable
					int temp = array1[j];
					array1[j] = array1[j+1];
					array1[j+1] = temp; 
				}
			}
		}

	}
	public static void main(String[] args){
		int[] array = {3, 9, 11, 8, 14, 2};

		System.out.println("Array before Sorting:");

		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();

		System.out.println("Array after Bubble Sort:");

		//calling function 
		bubble(array);
		for(int i:array){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}