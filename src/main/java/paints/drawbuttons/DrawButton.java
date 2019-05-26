package paints.drawbuttons;

import javax.swing.JButton;

public interface DrawButton {
	public void on();
	public void off();
	public JButton getButton();
	public boolean getOn();
}
