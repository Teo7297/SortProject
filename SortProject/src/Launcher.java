import java.io.*;

/**
 * questa classe dovrebbe creare l'array di valori random e in base all'input
 * ricevuto chiamare l'algoritmo di ordinamento necessario NOTA BENE la classe
 * di ogni algoritmo dovrebbe chiamare la gui in modo da crearla con i valori
 * giusti per la visualizzazione dell'algoritmo
 ***/
public class Launcher {
	BufferedReader br;
	String algorithm;
	int[] array;

	public Launcher() {
	}

	// aggiungere 1 case per ogni algoritmo
	public int[] sort(int[] array, String alg) {
		switch (alg) {
		case "selection":
			array = Selection.sort(array);
			break;
		}
		return array;
	}
}
