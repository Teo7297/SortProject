
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;



public class Sort 
{        
	
	
	public static void main(String args[])
	{
		int [] values;
		
		JFrame j = new JFrame("gui");

		
		Container c = j.getContentPane();

		c.setBackground(Color.black);
		
		j.setSize(600,500);
		j.setVisible(true);
		
		int numero = 500;
		
		values = new int[600];
		
		Random number = new Random();
		int n;
		
		for(int i= 0; i<values.length; i++)
		{
			n=number.nextInt(500);
			
			values[i] = n;
			
			System.out.println(n); // ho dei valori random ora dovrei
			                       // tecnicmante fare le strisce
		}
		
		
		
	}

}
