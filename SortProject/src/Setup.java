import java.io.*;

/**
 * questa classe organizza il setup, ovvero crea un array disordinato di int da
 * 0 a 100'000 e legge l'input per determinare quale algoritmo verrà applicato
 **/
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
		System.out.println("inserire tipo di ordinamento \n scegliere tra: \n -selection per Selection Sort"); // Aggiungere
																												// man
																												// mano
																												// con
																												// gli
																												// algoritmi
		return command = br.readLine();
	}
}
