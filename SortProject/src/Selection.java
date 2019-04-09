
/** classe per l'implementazione del Selection Sort **/

public class Selection {
	private static int min;

	public static int[] sort(int[] vector) {
		min = 0;
		for (int j = 0; j < vector.length; j++) {
			min = j;
			for (int i = j + 1; i < vector.length; i++) {
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
