
/**classe per l'implementazione della gui**/

import java.awt.*;

import javax.sound.sampled.Line;
import javax.swing.*;
import javafx.*;

public class Gui extends JFrame {

	public static void main(String args[])
	{
		
		    JFrame j = new JFrame("gui");
		
			visual n= new visual ();
			
			j.add(n);
			int[] values;

			
			Container c = j.getContentPane();
			
			JPanel panel = new JPanel();

			c.setBackground(Color.white);

			j.setSize(600, 500);
			j.setVisible(true);
		
		
	}

		/*
		 * int numero = 500;
		 * 
		 * values = new int[600];
		 * 
		 * Random number = new Random(); int n;
		 * 
		 * for(int i= 0; i<values.length; i++) { n=number.nextInt(500);
		 * 
		 * values[i] = n;
		 * 
		 * //System.out.println(n); // ho dei valori random ora dovrei // tecnicmante
		 * fare le strisce }
		 */
		/*
		 * values = Selection.sort(values); for(int s = 0; s< values.length; s++)
		 * System.out.println(values[s]);
		 */

	
}


    

