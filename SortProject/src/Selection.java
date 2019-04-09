
/**classe per l'implementazione del Selection Sort**/

public class Selection {
	private static int min;
	
	public static void main(String args[]) {
		int[] vector = {7, 8 ,3,2,5,6,9,1,4};			//eliminare il main ed implementare generatore random per l'array
		vector = sort(vector);
		
		for(int h = 0; h < vector.length; h++)
			System.out.println(vector[h]);
		
	}

	public static int[] sort(int[] vector) {
		min = 0;
		for (int j = 0; j < vector.length; j++) {
			min = j;
			for (int i = j+1; i < vector.length; i++) {
				if (vector[i] < vector[min]) {
					min = i;
				}
			}
			exch(vector, min, j);
		}
		return vector;
	}

	
	public static int[] exch(int[] vector, int first, int second) {
		int temp;
		temp = vector[first];
		vector[first] = vector[second];
		vector[second] = temp;
		return vector;
	}
}
