package paints.drawbuttons;

import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Eclipse implements DrawButton {
	private JButton button;
	private boolean on;
	

	public void on() {
		on = true;
	}

	 
	public JButton getButton() {
		// TODO Auto-generated method stub
		return button;
	}
	
	public Eclipse(MouseListener m) {
		button = new JButton(new ImageIcon("icon/04.png"));
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
