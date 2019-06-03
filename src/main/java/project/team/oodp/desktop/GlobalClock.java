package project.team.oodp.desktop;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;


public class GlobalClock extends JFrame{
	
	
	public GlobalClock(String cityName){
		super("Global Clock");
		
		JFrame frame = new JFrame("Global Clock");
		frame.setVisible(true);//.setDefaultLookAndFeelDecorated(true);
		frame.setSize(300, 500);
		frame.setLocation(350,300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLayout(new GridLayout(3, 1));
		
		GlobalClockLabel date = new GlobalClockLabel("date", cityName);
		GlobalClockLabel time = new GlobalClockLabel("time", cityName); 
		GlobalClockLabel day = new GlobalClockLabel("day", cityName);
		
		
		frame.add(date);
		frame.add(time);
		frame.add(day);
		
		frame.getContentPane().setBackground(Color.black);
		frame.setVisible(true);
		
		
	}


}


 class GlobalClockLabel extends JLabel implements ActionListener {
    
    String type;
    SimpleDateFormat sdf;
   
    public GlobalClockLabel(String type, String cityName) {
      this.type = type;
      setForeground(Color.WHITE);
      setBackground(Color.black);
      setVisible(true);
      
      switch (type) {
      case "date" : sdf = new SimpleDateFormat("  MMMM dd yyyy");
      				sdf.setTimeZone(TimeZone.getTimeZone(cityName));
                    setFont(new Font("sans-serif", Font.PLAIN, 12));
                    setHorizontalAlignment(SwingConstants.LEFT);
                    break;
      case "time" : sdf = new SimpleDateFormat("hh:mm:ss a");
      			    sdf.setTimeZone(TimeZone.getTimeZone(cityName));
                    setFont(new Font("sans-serif", Font.PLAIN, 40));
                    setHorizontalAlignment(SwingConstants.CENTER);
                    break;
      case "day"  : sdf = new SimpleDateFormat("EEEE  ");
      				sdf.setTimeZone(TimeZone.getTimeZone(cityName));
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


