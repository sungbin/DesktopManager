package project.team.oodp.desktop;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import colors.Colors;

public class PopClock extends JFrame{
	
	
	public PopClock(Color color){
		super("Digital Clock");
		
		
		setDefaultLookAndFeelDecorated(true);
		setSize(300, 150);
		setLocation(350,300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new GridLayout(3, 1));
		
		ClockLabel date = new ClockLabel("date", color);
		ClockLabel time = new ClockLabel("time", color);
		ClockLabel day = new ClockLabel("day", color);
		
		
		add(date);
		add(time);
		add(day);
		
		getContentPane().setBackground(Color.black);
		setVisible(true);

		

	}
	
	class ClockLabel extends JLabel implements ActionListener {
	    
	     String type;
	     SimpleDateFormat sdf;
	    
	     public ClockLabel(String type, Color color) {
	       this.type = type;
//	       String concat = "Colors." + color
	       setForeground(color);
	       setBackground(Color.black);
	       setVisible(true);
	    
	       switch (type) {
	         case "date" : sdf = new SimpleDateFormat("  MMMM dd yyyy");
	                       setFont(new Font("sans-serif", Font.PLAIN, 12));
	                       setHorizontalAlignment(SwingConstants.LEFT);
	                       break;
	         case "time" : sdf = new SimpleDateFormat("hh:mm:ss a");
	                       setFont(new Font("sans-serif", Font.PLAIN, 40));
	                       setHorizontalAlignment(SwingConstants.CENTER);
	                       break;
	         case "day"  : sdf = new SimpleDateFormat("EEEE  ");
	                       setFont(new Font("sans-serif", Font.PLAIN, 16));
	                       setHorizontalAlignment(SwingConstants.RIGHT);
	                       break;
	         default     : sdf = new SimpleDateFormat();
	                       break;
	       }
	    
	       Timer t = new Timer(1000, this);
	       t.start();
	     }
	    
	     public void actionPerformed(ActionEvent ae) {
	       Date d = new Date();
	       setText(sdf.format(d));
	     }
	   }


}
