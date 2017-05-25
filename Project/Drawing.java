import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Drawing extends JComponent {
	private String thickness;
	private Image image;
	private Graphics2D graphics2D;
	private int currentX;
	private int currentY;
	private int startX;
	private int startY;
	private int endX;
	private int endY; 
	public int i; 
	
	public Drawing() {
		setDoubleBuffered(false);
		
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				startX = e.getX();
				startY = e.getY();
			}
			public void mouseReleased(MouseEvent e)
			{
			endX = e.getX();
			endY = e.getY();
			
			}
		}); 

		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) 
			{
				if(i == 0)
				{
					currentX = e.getX();
					currentY = e.getY();
					graphics2D.drawLine(startX, startY, currentX, currentY);
					repaint();
					startX = e.getX();
					startY = e.getY();
				}
				else
				{
					
					graphics2D.drawLine(startX, startY, endX, endY); 
					repaint();
				}
			
			}
		});
		
		

	}
	public void paintComponent(Graphics g) {
		if(image == null){
			image = createImage(getSize().width, getSize().height);
			graphics2D = (Graphics2D)image.getGraphics();
			graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			clear();
		}
		g.drawImage(image, 0, 0, null);
	}
	public void clear() {
		graphics2D.setPaint(Color.WHITE);
		graphics2D.fillRect(0,0,getSize().width, getSize().height);
		graphics2D.setPaint(Color.BLACK);
		repaint();
	}
	public void red() {
		graphics2D.setPaint(new Color(252,0,0));
		repaint();
	}
	public void orange(){
		graphics2D.setPaint(new Color(224,123,0));
		repaint();
	}
	public void yellow(){
		graphics2D.setPaint(new Color(252,248,0));
		repaint();
	}
	public void green(){
		graphics2D.setPaint(new Color(0,153,0));
		repaint();
	}
	public void blue(){
		graphics2D.setPaint(new Color(0,4,252));
		repaint();
	}
	public void purple(){
		graphics2D.setPaint(new Color(137,0,179));
		repaint();
	}
	public void grey(){
		graphics2D.setPaint(new Color(92,92,92));
		repaint();
	}
	public void black(){
		graphics2D.setPaint(Color.BLACK);
		repaint();
	}
	public void custom(){
		Color color = Color.white;
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		color = JColorChooser.showDialog(frame,"Choose a color",color);
		graphics2D.setPaint(color);
		repaint();
	}
	public void erase(){
		graphics2D.setPaint(Color.WHITE);
		repaint();
	}
	public void changeThickness(int t) {
		float width = t;
		graphics2D.setStroke(new BasicStroke(width));
	}
	
	public void key(){
		if( i == 0)
			i = 1;
		else
			i = 0;
	}
	

}
