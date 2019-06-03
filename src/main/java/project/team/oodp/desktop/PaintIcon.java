package project.team.oodp.desktop;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import paints.Frame;

public class PaintIcon implements ApplicationIcon{

	@Override
	public void makeApplicationIcon() {
		// TODO Auto-generated method stub 
		
		UserDesktop.paint_btn = new JButton("Paint");
		UserDesktop.paint_btn.setBackground(Color.white);
		UserDesktop.paint_btn.setBounds(80, 690, 80, 20);
		UserDesktop.center_panel.add(UserDesktop.paint_btn);
		
		
		
		UserDesktop.paint_btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				UserDesktop.center_panel.setVisible(false);
				UserDesktop.side_panel.setVisible(false);
				UserDesktop.bottom_panel.setVisible(false);
				Frame fram = new Frame();
			}

		});
	}

}
