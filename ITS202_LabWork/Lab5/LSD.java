public class LSD{
	public static void sort(String[] array, int width){
		int N = array.length;
		int R = 256;

		String[] aux = new String[N];

		for(int d = width-1; d >= 0; d--){
			//sorting dth char by key-index counting sort
			int[] count = new int[R+1];
	
			//to calculate frequency counts
			for(int i = 0; i < N; i++){
				count[array[i].charAt(d) + 1]++;
			}

			//to transform counts to indices
			for(int r = 0; r < R; r++){
				count[r+1] = count[r+1] + count[r];
			}

			//to distribute the records
			for(int i = 0; i < N; i++){
				aux[count[array[i].charAt(d)]++] = array[i];
			}

			//to copy back
			for(int i = 0; i < N; i++){
				array[i] = aux[i];
			}

			for(int i = 0; i < N; i++){
				System.out.println(array[i]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		String[] array = {"Kizom", "Tashi", "Karma", "Euden", "Sanga", "Dorji"};
		int width = array[0].length();
		sort(array, width);
	}
}