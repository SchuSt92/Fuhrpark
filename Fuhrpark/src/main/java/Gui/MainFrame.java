package Gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {
	
	private JFrame mainFrame;
	private Container container;
	private JPanel lefJPanel;
	private JPanel midJPanel;
	private JPanel rightJPanel;
	
	
	

	public MainFrame() {
		mainFrame = new JFrame("Fuhrpark App");
		mainFrame.setSize(600, 400);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addPanels();
		mainFrame.setVisible(true);
	}
	
	
	private void addPanels() {	
		container = mainFrame.getContentPane();
		container.setLayout(new GridLayout(1,3));
		lefJPanel = new JPanel();
		midJPanel = new JPanel();
		rightJPanel = new JPanel();
		container.add(lefJPanel);
		container.add(midJPanel);
		container.add(rightJPanel);
		midJPanel.setBackground(Color.LIGHT_GRAY);
	}
	
	
	
	
	
	
	
	
	
	

}
