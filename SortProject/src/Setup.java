import java.io.*;

public class Setup {
	int[] array;
	String command;
	BufferedReader br;
	
	public Setup() {
	}
	
	public int[] makeArray() {
		array = new int[(int) (100000 * Math.random())];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (100000 * Math.random());
		}

		return array;
	}

	public String setCommand() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("inserire tipo di ordinamento \n scegliere tra: \n -selection per Selection Sort"); 				//Aggiungere man mano con gli algoritmi
		return command = br.readLine();
	}
}
