public class Merge{

	// stably merge a[lo .. mid] with a[mid+1 ..hi] using aux[lo .. hi]
	private static void merge(int[] array, int[] aux, int lo, int mid, int hi){
		//to copy the array in aux array
		for(int k = lo; k <= hi; k++){
			aux[k] = array[k];
		}
		//merging back to a[]
		int i = lo, j = mid+1;
		for(int k = lo; k <= hi; k++){
			if(i > mid){
				array[k] = aux[j++];
			}					
			else if(j>hi){
				array[k] = aux[i++];
			}						
			else if(less(aux[j], aux[i])){
				array[k] = aux[j++];
			}		
			else{
				array[k] = aux[i++];
			}								
		}
	}

	// mergesort a[lo..hi] using auxiliary array aux[lo..hi]
	private static void sort(int[] array, int[] aux, int lo, int hi){
		if(hi <= lo){
			return;
		}
		else{
			int mid = (lo + hi)/2;
			sort(array, aux, lo, mid);
			sort(array, aux, mid+1, hi);
			merge(array, aux, lo, mid, hi);
		}
	}

	public static void sort(int[] array){
		int[] aux = new int[array.length];
		int lo = 0;
		int hi = array.length-1;
		sort(array, aux, lo, hi);
	}

	// is v < w ?
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static boolean isSorted(int[] array) {
        return isSorted(array, 0, array.length - 1);
    }

    private static boolean isSorted(int[] array, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(array[i], array[i-1])) {
                return false;
            }
        return true;
    }

	// print array to standard output
    private static void show(int[] array) {
    	System.out.println("Array after Merge sort:");
        for(int i = 0; i< array.length; i++){
        	System.out.print(" "+array[i]);
        }

    }
	public static void main(String[] args){
		int[] array = {5, 1, 8, 2, 0, 4};
		Merge.sort(array);
		show(array);
	}
}
