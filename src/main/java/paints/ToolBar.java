package paints;


import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JToolBar;

public class ToolBar extends JToolBar{
	Buttons buttons = new Buttons();
	
	ToolBar() {
		setBackground(Color.LIGHT_GRAY);
		
		add(buttons.toolbuttons[0]);
		add(buttons.toolbuttons[1]);
		addSeparator();
		add(buttons.toolbuttons[2]);
		addSeparator();
		
		for (int i = 0; i < buttons.drawbuttons.length; i++)
			add(buttons.drawbuttons[i].getButton());
		
		addSeparator();
		add(buttons.toolbuttons[3]);
		add(buttons.stroke);
		addSeparator();
		add(buttons.toolbuttons[5]);
		add(buttons.toolbuttons[7]);
		addSeparator(new Dimension(880,1));
	}
	
}
