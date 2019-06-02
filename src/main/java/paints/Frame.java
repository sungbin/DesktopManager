package paints;


import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Frame extends JFrame {
	ToolBar toolbar = new ToolBar();
	Canvas canvas = new Canvas();
	public Frame() {
		setTitle("그림판");
		setSize(1440,800);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		add(toolbar, BorderLayout.NORTH);
		add(toolbar.buttons.canvas);

		setVisible(true);
	}
	
	public static void main(String args[]){
		new Frame();
	}
}
