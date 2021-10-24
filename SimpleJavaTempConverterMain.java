package simpleJavaTempConverter;

//@author Torin 

import javax.swing.*; import java.awt.event.*; import java.awt.*;
public class SimpleJavaTempConverterMain{
	//Global Var Declaration
	private static JFrame w = new JFrame();
	private static JPanel p = new JPanel();
	private static JLabel tbTitleC = new JLabel("Enter Temp In Celsius: ");
	private static JTextField tfC = new JTextField(14);
	private static JButton bC = new JButton("Convert");
	private static JLabel tbTitleF = new JLabel("Enter Temp In Fahrenheit: ");
	private static JTextField tfF = new JTextField(14);
	private static JButton bF = new JButton("Convert");
	private static String inputC;
	private static String inputF;
	
	public static void main(String[] args) {
		
		w.setTitle("Temp Converter");
		w.setSize(500, 260);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setVisible(true);
		w.setLocationRelativeTo(null);
		p.add(tbTitleC);
		p.add(tfC);
		p.add(bC);
		p.add(tbTitleF);
		p.add(tfF);
		p.add(bF);
		p.setBackground(new Color(205, 200, 206));
		bC.addActionListener(new bCListener());
		bF.addActionListener(new bFListener());
		w.add(p);
		System.out.println("Window Displayed!");
	}
	public static void errorMsg() {
		JOptionPane.showMessageDialog(null, "Whoops! There Was An Error.");
		System.out.println("Whoops! There Was An Error.");
	}
	public static class bCListener implements ActionListener {
		
		public void actionPerformed(ActionEvent a) {
			try {
			inputC = tfC.getText();
			double inputDbl = Double.parseDouble(inputC);
			double newTemp = (inputDbl / 5) * (9) + (32);
			JOptionPane.showMessageDialog(null, "The Converted Temperature Is: "+newTemp+" F°");
			} catch(Exception e) {
				errorMsg();
			}
		}
	}
	public static class bFListener implements ActionListener {
		
		public void actionPerformed(ActionEvent a) {
			try {
			inputF = tfF.getText();
			double inputDbl = Double.parseDouble(inputF);
			double newTemp = (inputDbl - 32) * (5) / (9);
			JOptionPane.showMessageDialog(null, "The Converted Temperature Is: "+newTemp+" C°");
			} catch(Exception e) {
				errorMsg();
			}
		}
	}
		
}
