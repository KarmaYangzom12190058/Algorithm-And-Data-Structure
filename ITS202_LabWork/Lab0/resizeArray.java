public class resizeArray{
	static int[] array;

	public static int[] resize(int length){
		int[] seq = new int[length];

		for(int x=0; x<array.length; x++){
			seq[x] = array[x];
		}
		seq[length-1] = 4;
		array = seq;
		return array;
	}
	
	public static void main(String[] args){
		array = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;

		int[] newarray = resize(4);

		for(int x=0; x<newarray.length; x++){
			System.out.println(newarray[x]);
		}
	}
}