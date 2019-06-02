package paints.drawbuttons;

import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Rectangle implements DrawButton {
	private JButton button;
	public boolean on;
	
	 
	public void on() {
		on = true;
	}

	 
	public JButton getButton() {
		// TODO Auto-generated method stub
		return button;
	}
	public Rectangle(MouseListener m) {
		button = new JButton(new ImageIcon("icon/03.png"));
		button.setBorderPainted(true);
		button.addMouseListener(m);
	}

	 
	public void off() {
		on = false;
	}

	 
	public boolean getOn() {
		return on;
	}
}
