package project.team.oodp.desktop;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.Timer;

import project.team.oodp.desktop.login.SuperLogInFactory;

public class GuestPaintIcon implements GuestApplicationIcon{

	@Override
	public void makeGusetApplicationIcon() {
		// TODO Auto-generated method stub
		
		ApplicationColor green = new GreenApplication();
		
		GuestDesktop.paint_btn = new JButton("Paint : $2");
		GuestDesktop.paint_btn.setBackground(Color.white);
		GuestDesktop.paint_btn.setBounds(80, 690, 80, 20);
		GuestDesktop.center_panel.add(GuestDesktop.paint_btn);
		
		Timer timer = new Timer(1000, new ActionListener()
		   {   
		    public void actionPerformed (ActionEvent e)
		    {
		    	GuestDesktop.clock_btn.setBackground(green.setAppColor());
		    }
		   });
		timer.start();
		
		GuestDesktop.paint_btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				GuestDesktop.center_panel.setVisible(false);
				GuestDesktop.side_panel.setVisible(false);
				GuestDesktop.bottom_panel.setVisible(false);
				new SuperLogInFactory().createLogIn();
			}

		});
	}

}
