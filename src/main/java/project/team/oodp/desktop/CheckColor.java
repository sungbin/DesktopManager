package project.team.oodp.desktop;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import colors.Blue;
import colors.Colors;
import colors.Cyan;
import colors.Green;
import colors.Pink;
import colors.Red;
import colors.Yellow;

public class CheckColor extends JFrame{
	
	String colors [] = {"Default", "Red", "Blue", "Yellow", "Green", "Pink", "Cyan"};
	String color;
	JComboBox<String> combo;
	JLabel msg;
	static Colors colors_checked;
	
	public CheckColor(){
		
		setLayout(new BorderLayout());
		combo = new JComboBox<String>(colors);
		msg = new JLabel("Choose a font color of Clock");

		add( combo, BorderLayout.CENTER);
		add(msg, BorderLayout.NORTH);
		  
		setSize(200, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		  
		  //콤보박스에 addActionListener 이벤트 처리를 합니다.
		combo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				color = combo.getSelectedItem().toString();
				
				
				switch(color){
				
				case "Red" :
					colors_checked = new Red();
					PopClock red_pc = new PopClock(colors_checked.getColor());
					break;
				
				case "Green":
					colors_checked = new Green();
					PopClock green_pc = new PopClock(colors_checked.getColor());
					break;
				
				case "Pink":
					colors_checked = new Pink();
					PopClock pink_pc = new PopClock(colors_checked.getColor());
					break;
					
				case "Yellow":
					colors_checked = new Yellow();
					PopClock yellow_pc = new PopClock(colors_checked.getColor());
					break;
					
				case "Blue":
					colors_checked = new Blue();
					PopClock blue_pc = new PopClock(colors_checked.getColor());
					break;
					
				case "Cyan":
					colors_checked = new Cyan();
					PopClock cyan_pc = new PopClock(colors_checked.getColor());
					break;
					
				
					
				}
			}
		   
		});
		
		
	}
}
