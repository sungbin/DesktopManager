package project.team.oodp.desktop.clocks;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.Timer;

public class SuperClock extends JLabel implements ActionListener{
	
	SimpleDateFormat sdf;
	
	
	public SuperClock(){
		setForeground(Color.black);
	    setVisible(true);
	    
	    sdf = new SimpleDateFormat("hh:mm:ss \n yyyy MM d");
        setFont(new Font("sans-serif", Font.PLAIN, 12));
	    
	    Timer t = new Timer(1000, this);
		t.start();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Date d = new Date();
		setText(sdf.format(d));
		
	}
	
	
}
