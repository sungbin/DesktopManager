package project.team.oodp.desktop;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import project.team.oodp.desktop.login.SuperLogInFactory;

public class GuestClockIcon implements GuestApplicationIcon{

	@Override
	public void makeGusetApplicationIcon() {
		// TODO Auto-generated method stub
		GuestDesktop.clock_btn = new JButton("Clock : $1");
		GuestDesktop.clock_btn.setBackground(Color.white);
		GuestDesktop.clock_btn.setBounds(200, 690, 80, 20);
		GuestDesktop.center_panel.add(GuestDesktop.clock_btn);
		
		GuestDesktop.clock_btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				GuestDesktop.center_panel.setVisible(false);
				GuestDesktop.side_panel.setVisible(false);
				GuestDesktop.bottom_panel.setVisible(false);
				
				new SuperLogInFactory().createLogIn();
			}

		});
	}

}
