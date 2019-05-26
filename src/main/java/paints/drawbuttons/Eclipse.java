package paints.drawbuttons;

import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Eclipse implements DrawButton {
	private JButton button;
	private boolean on;
	
	@Override
	public void on() {
		on = true;
	}

	@Override
	public JButton getButton() {
		// TODO Auto-generated method stub
		return button;
	}
	
	public Eclipse(MouseListener m) {
		button = new JButton(new ImageIcon("red.png"));
		button.setBorderPainted(true);
		button.addMouseListener(m);
	}

	@Override
	public void off() {
		on = false;
	}

	@Override
	public boolean getOn() {
			return on;
	}


}
