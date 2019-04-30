package edu.handong.csee.oodp;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Desktop extends JFrame{
	
	JPanel whole_panel, center_panel, bottom_panel;
	JButton window_btn;
	JLabel empty1, empty2, empty3, empty4, empty5, empty6;
	Desktop() throws IOException{
		
//		JFrame jf = new JFrame("Welcome to Desktop Manager :)");
		
		
//		jf.setLayout(new BorderLayout());
		setTitle("Welcome to Desktop Manager :)");
		setSize(1000,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
//		add(jf);
		
		setLayout(new BorderLayout());
		center_panel = new JPanel();
//		center_panel.setBackground(Color.blue);
		BufferedImage img = ImageIO.read(new File("D:/HGU_2019_1/객체지향/Desktop_images/window.jpg"));
		JLabel lbl = new JLabel(new ImageIcon(img));
		center_panel.add(lbl);
		
		
		bottom_panel = new JPanel();
		bottom_panel.setBackground(Color.GRAY);
		bottom_panel.setSize(100,100);
		bottom_panel.setLayout(new GridLayout(1,10));
		window_btn = new JButton("Start");
		bottom_panel.add(window_btn);
		empty1 = new JLabel();
		empty2 = new JLabel();
		empty3 = new JLabel();
		empty4 = new JLabel();
		empty5 = new JLabel();
		empty6 = new JLabel();
		bottom_panel.add(empty1);
		bottom_panel.add(empty2);
		bottom_panel.add(empty3);
		bottom_panel.add(empty4);
		bottom_panel.add(empty5);
		bottom_panel.add(empty6);
		add(center_panel, "Center");
		add(bottom_panel, "South");
		
//		whole_panel = new JPanel();
//		center_panel = new JPanel();
		
//		whole_panel.setLayout(new BorderLayout());
//		whole_panel.add(center_panel, "Center");
		
//		add(jf);
		

//		setContentPane(new Panel(new ImageIcon(ImageIO.read(new File("D:/HGU_2019_1/객체지향/Desktop_images/window2.jpg")))));
//		setContenetPane(new ImagePanel(ImageIO.read(new File("D:/HGU_2019_1/객체지향/Desktop_images/window.jpg"))));
//		Image img = new Image(new File("D:/HGU_2019_1/객체지향/Desktop_images/window.jpg"));
	}

}
