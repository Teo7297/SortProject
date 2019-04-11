
/**classe per l'implementazione della gui**/

import java.awt.*;
import javax.swing.*;
import java.*;

public class Gui extends JFrame {

	public static void main(String args[])
	{
		new Gui();
		
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

	public Gui()
	{
		setTitle("prova");
		int[] values;

		JFrame j = new JFrame("gui");

		Container c = j.getContentPane();
		
		JPanel panel = new JPanel();

		c.setBackground(Color.white);

		j.setSize(600, 500);
		j.setVisible(true);
	}
}
	
	/*public void paintComponent(Graphics g) 
	{
		g.setColor(Color.black);
		g.drawLine(50, 0, 1, 100);
		
	}
	}*/
  public void Line() 
  {
	Line l = new Line();
  }
   
   

