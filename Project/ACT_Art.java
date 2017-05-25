import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ACT_Art extends JFrame {
	private final int CANVASSIZEX = 500; //change this to change the x-dimension of the window
	private final int CANVASSIZEY = 500; //change this to change the y-dimension of the window
	ImageIcon redImg = new ImageIcon("Red.jpg");
	ImageIcon orangeImg = new ImageIcon("Orange.jpg");
	ImageIcon yellowImg = new ImageIcon("Yellow.jpg");
	ImageIcon greenImg = new ImageIcon("Green.jpg");
	ImageIcon blueImg = new ImageIcon("Blue.jpg");
	ImageIcon purpleImg = new ImageIcon("Purple.jpg");
	ImageIcon greyImg = new ImageIcon("Grey.jpg");
	ImageIcon blackImg = new ImageIcon("Black.jpg");
	ImageIcon customImg = new ImageIcon("CustomColor.jpg");
	ImageIcon eraserImg = new ImageIcon("Eraser.jpg");
	
	JButton redButton = new JButton(redImg);
	JButton orangeButton = new JButton(orangeImg);
	JButton yellowButton = new JButton(yellowImg);
	JButton greenButton = new JButton(greenImg);
	JButton blueButton = new JButton(blueImg);
	JButton purpleButton = new JButton(purpleImg);
	JButton greyButton = new JButton(greyImg);
	JButton blackButton = new JButton(blackImg);
	JButton customButton = new JButton(customImg);
	JButton eraseButton = new JButton(eraserImg);
	JButton clearButton = new JButton("Clear");
	JButton lineButton = new JButton("Line");
	
	
	//Instantiate the color buttons for each checkbox.
	
	JComboBox penSize = new JComboBox();
	

	
	public ACT_Art() {
		super("ACT Art");
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JPanel toolbar = new JPanel();
		Drawing canvas = new Drawing();

		toolbar.setPreferredSize(new Dimension(32, 68));
		toolbar.setMinimumSize(new Dimension(32, 68));			
		toolbar.setMaximumSize(new Dimension(32, 68));
		
		
		
		
		contentPane.setLayout(new BorderLayout());
		
		//set up toolbar on the top of the window
		
		penSize.addItem(1);
		penSize.addItem(2);
		penSize.addItem(3);
		penSize.addItem(4);
		penSize.addItem(5);
		penSize.addItem(6);
		
		ActionListener redActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.red();
			}
		};
		ActionListener orangeActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.orange();
			}
		};
		ActionListener yellowActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.yellow();
			}
		};
		ActionListener greenActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.green();
			}
		};
		ActionListener blueActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.blue();
			}
		};
		ActionListener purpleActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.purple();
			}
		};
		ActionListener greyActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.grey();
			}
		};
		ActionListener blackActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.black();
			}
		};
		ActionListener customActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.custom();
			}
		};
		ActionListener eraseActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.erase();
			}
		};
		ActionListener clearActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.clear();
			}
		};
		ActionListener sizeActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int size = (int) penSize.getSelectedItem();
				canvas.changeThickness(size);
			}
		};
		ActionListener lineActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.key();
			}
		};
		
		redButton.addActionListener(redActionListener);
		orangeButton.addActionListener(orangeActionListener);
		yellowButton.addActionListener(yellowActionListener);
		greenButton.addActionListener(greenActionListener);
		blueButton.addActionListener(blueActionListener);
		purpleButton.addActionListener(purpleActionListener);
		greyButton.addActionListener(greyActionListener);
		blackButton.addActionListener(blackActionListener);
		customButton.addActionListener(customActionListener);
		eraseButton.addActionListener(eraseActionListener);
		clearButton.addActionListener(clearActionListener);
		penSize.addActionListener(sizeActionListener);
		lineButton.addActionListener(lineActionListener);
		
	
		redButton.setPreferredSize(new Dimension(16, 16));
		orangeButton.setPreferredSize(new Dimension(16, 16));
		yellowButton.setPreferredSize(new Dimension(16, 16));
		greenButton.setPreferredSize(new Dimension(16,16));
		blueButton.setPreferredSize(new Dimension(16, 16));
		purpleButton.setPreferredSize(new Dimension(16, 16));
		greyButton.setPreferredSize(new Dimension(16, 16));
		blackButton.setPreferredSize(new Dimension(16, 16));
		customButton.setPreferredSize(new Dimension(16,16));
		eraseButton.setPreferredSize(new Dimension(16,16));
		
		toolbar.add(redButton);
		toolbar.add(orangeButton);
		toolbar.add(yellowButton);
		toolbar.add(greenButton);
		toolbar.add(blueButton);
		toolbar.add(purpleButton);
		toolbar.add(greyButton);
		toolbar.add(blackButton);
		toolbar.add(customButton);
		toolbar.add(eraseButton);
		toolbar.add(penSize);
		toolbar.add(clearButton);
		toolbar.add(lineButton);
		
		
		contentPane.add(toolbar, BorderLayout.NORTH);
		
		//set up the canvas that we will draw on
		
		contentPane.add(canvas, BorderLayout.CENTER);
		
		this.setSize(CANVASSIZEX, CANVASSIZEY);
		this.setMinimumSize(new Dimension(500,500));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[]args) {
		ACT_Art window = new ACT_Art();
		
	}
}