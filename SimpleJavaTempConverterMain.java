package simpleJavaTempConverter;

//@author Torin 

import javax.swing.*; import java.awt.event.*; import java.awt.*;
public class SimpleJavaTempConverterMain{
	//Global Var Declaration
	private static JFrame w = new JFrame();
	private static JPanel p1 = new JPanel();
	private static JPanel p2 = new JPanel();
	private static JPanel p3 = new JPanel();
	private static JPanel p4 = new JPanel();
	private static JPanel p5 = new JPanel();
	private static JPanel p6 = new JPanel();
	private static JLabel tbTitleC = new JLabel("Enter Temp In Celsius:");
	private static JTextField tfC = new JTextField(14);
	private static JButton bC = new JButton("Convert");
	private static JLabel tbTitleF = new JLabel("Enter Temp In "
			+ "Fahrenheit:");
	private static JTextField tfF = new JTextField(14);
	private static JButton bF = new JButton("Convert");
	private static JButton bE = new JButton("Exit");
	private static String inputC, inputF;
	private static JPanel[] pArr = {p1, p2, p3, p4, p5, p6};
	
	public static void main(String[] args) throws InterruptedException {
		/*||Setting size, relative location,  || 
		  ||title, close operation, and layout||*/
		w.setTitle("Temp Converter");
		w.setSize(500, 260);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setLocationRelativeTo(null);
		w.setLayout(new GridLayout(6, 1));
		
		//Adding Elements To Panels(3-4 and 6 are whitespace(grayspace?))
		p1.add(tbTitleC);
		p1.add(tfC);
		p1.add(bC);
		p2.add(tbTitleF);
		p2.add(tfF);
		p2.add(bF);
		p5.add(bE);
		
		//For Loop For Setting Custom Colors For Panels
		for(JPanel p : pArr) {
			p.setBackground(new Color(205, 200, 206));
		}
		
		//Setting Custom Color For Exit Button
		bE.setBackground(new Color(200, 0, 0));
		
		//Adding Action Listeners For Buttons
		bC.addActionListener(new bCListener());
		bF.addActionListener(new bFListener());
		bE.addActionListener(new bEListener());
		
		//For Loop For Adding Panels To Window
		for(JPanel p : pArr) {
			w.add(p);
		}
		
		//Setting Visibility And Displaying Message To Console
		w.setVisible(true);
		System.out.println("Window Displayed!");
	}
	
	//Error Message Function Using JOptionPane
	public static void errorMsg() {
		JOptionPane.showMessageDialog(null, "Whoops! There Was"
				+ " An Error.");
		System.out.println("Whoops! There Was An Error.");
	}
	
	//Event Listener For Celsius Converter Button
	public static class bCListener implements ActionListener {
		
		public void actionPerformed(ActionEvent a) {
			try {
			inputC = tfC.getText();
			double inputDbl = Double.parseDouble(inputC);
			double newTemp = (inputDbl / 5) * (9) + (32);
			JOptionPane.showMessageDialog(null, "The Converted"
					+ " Temperature Is: "+newTemp+" F°");
			} catch(Exception e) {
				errorMsg();
			}
		}
	}
	
	//Event Listener For Fahrenheit Converter Button
	public static class bFListener implements ActionListener {
		
		public void actionPerformed(ActionEvent a) {
			try {
			inputF = tfF.getText();
			double inputDbl = Double.parseDouble(inputF);
			double newTemp = (inputDbl - 32) * (5) / (9);
			JOptionPane.showMessageDialog(null, "The Converted"
					+ " Temperature Is: "+newTemp+" C°");
			} catch(Exception e) {
				errorMsg();
			}
		}
	}
	
	//Event Listener For Exit Button
	public static class bEListener implements ActionListener {
		
		public void actionPerformed(ActionEvent a) {
			System.exit(0);
		}
	}
		
}
