import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {
		
		Setup setup = new Setup();
		int [] array = setup.makeArray();
		String command = setup.setCommand();
		array = new Launcher().sort(array, command);
		
		for(int i = 0; i < array.length; i ++) {
			System.out.println(array[i]);
		}
		
		
	}

}
