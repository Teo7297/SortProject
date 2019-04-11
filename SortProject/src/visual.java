import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class visual extends JPanel
{
	public void paintComponent(Graphics g) 
	{
		
		super.paintComponents(g);
		this.setBackground(Color.white);
		
		g.setColor(Color.black);
		
		for(int i = 1; i<600; i++)
		{
			
			
				g.drawLine(i, 0, i, (int) (600 * Math.random())); //int x1,y1, x2,y2 
                                       // 00 è nell'angolo in alto a sinistra
			
			
			
		}
		

}
}
