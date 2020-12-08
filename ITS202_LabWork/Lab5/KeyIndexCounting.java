public class KeyIndexCounting{
	public static void keyindexsort(char[] array){
		int N = array.length;
		int R = 256; //take R equal 256 (Total ASCII value)
		
		char[] aux = new char[N];
		int[] count = new int[R+1]; //taking count as int since count is taken in terms of ASCII value

		//to calculate frequency counts
		for(int i = 0; i < N; i++){
			count[array[i] + 1]++;
		}

		//to transform counts to indices
		for(int r = 0; r < R; r++){
			count[r+1] = count[r+1] + count[r];
		}

		//to distribute the records
		for(int i = 0; i < N; i++){
			aux[count[array[i]]++] = array[i];
		}

		//to copy back
		for(int i = 0; i < N; i++){
			array[i] = aux[i];
		}

		for(int i = 0; i < N; i++){
			System.out.print(array[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		char[] array = {'g', 'c', 'a', 'f', 'x', 'z'};
		keyindexsort(array);	
	}
}