import java.awt.Graphics;
import java.awt.Color;

public class OvalDemoPanel extends MyPanel
{

	public OvalDemoPanel()
	{
		super();
	}
	
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		
		int centerX = 40;
		int centerY = 50;
		
		int width = 40;
		int height = 50;
		
		g.drawOval(centerX, centerY, width, height);
		g.fillOval(centerX+30, centerY+30, width+20, height+20);
		
	}
}
