package project.team.oodp.desktop;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ClockIcon implements ApplicationIcon{

	@Override
	public void makeApplicationIcon() {
		// TODO Auto-generated method stub
		JLabel clock_name = new JLabel("Clock");
		clock_name.setBounds(220, 690, 80, 20);
		UserDesktop.center_panel.add(clock_name);
		
		UserDesktop.clock_btn = new JButton();
		UserDesktop.clock_btn.setBackground(Color.white);
		UserDesktop.clock_btn.setBounds(200, 690, 80, 20);
		UserDesktop.center_panel.add(UserDesktop.clock_btn);
		
	}

}
