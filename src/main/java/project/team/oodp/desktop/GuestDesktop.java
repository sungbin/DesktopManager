package project.team.oodp.desktop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import project.team.oodp.desktop.clocks.SuperClock;
import project.team.oodp.desktop.login.SuperLogInFactory;

public class GuestDesktop extends Desktop{
	
	public static  JPanel whole_panel, center_panel, bottom_panel, side_panel;
	public static  JButton window_btn, paint_btn,clock_btn;
	JLabel empty1, empty2, empty3, empty4, empty5, empty6;
	JButton create_folder, delete_folder, create_file, delete_file;
	
	JButton[] folder_btn = new JButton[30];
	static int number_of_folder = 0;
	static ArrayList<String> folder_name = new ArrayList<String>();
	GuestIMediator guestMediator = new GuestConcreteMediator();
	GuestFileMaker makeGuestFileColleague = new GuestFileMaker(guestMediator);
	GuestFileDeleter deleteGuestFileColleague = new GuestFileDeleter(guestMediator);
	
	
	public GuestDesktop() throws IOException{
		
		setTitle("Welcome to Desktop Manager :)");
		setSize(1000,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		setLayout(new BorderLayout());
		center_panel = new JPanel();
		center_panel.setBackground(new Color(0, 128, 128));
		side_panel = new JPanel();
		side_panel.setSize(100,100);
		side_panel.setBackground(Color.yellow);
		create_folder = new JButton("Create Folder");
		delete_folder = new JButton("Delete Folder");
		create_file = new JButton("Create File");
		delete_file = new JButton("Delete File");
		side_panel.add(create_folder);
		side_panel.add(delete_folder);
		side_panel.add(create_file);
		side_panel.add(delete_file);
		
		
		bottom_panel = new JPanel();
		bottom_panel.setBackground(Color.GRAY);
		bottom_panel.setSize(100,100);
		bottom_panel.setLayout(new GridLayout(1,10));
		window_btn = new JButton("Start");
		window_btn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new SuperLogInFactory().createLogIn();
				dispose();
			}
			
		});
		bottom_panel.add(window_btn);
		empty1 = new JLabel();
		empty2 = new JLabel();
		empty3 = new JLabel();
		empty4 = new JLabel();
		empty5 = new JLabel();
		empty6 = new JLabel();

		bottom_panel.add(create_folder);
		bottom_panel.add(delete_folder);
		
		JPanel clock_panel = new JPanel();
		SuperClock time = new SuperClock();
	      
	      clock_panel.add(time);
	      
		bottom_panel.add(clock_panel);      
		
		
		side_panel = new JPanel();
		
//		add(side_panel, "West");
		add(center_panel, "Center");
		add(bottom_panel, "South");
		
		//수정 
		
		
		
		create_folder.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				center_panel.setVisible(false);
				side_panel.setVisible(false);
				bottom_panel.setVisible(false);
				
				setTitle("Create Folder");
				setSize(400, 200);
				
				setLocation(150, 150);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				JPanel folder_panel = new JPanel();
				add(folder_panel);
				
				
				makeGuestFileColleague.guestModifyFile(folder_panel);

			}

		});
		
		
		// make directory
		if(number_of_folder > 0) {
			center_panel.setLayout(null);
			for (int i = 0; i < number_of_folder; i++) {
				folder_btn[i] = new JButton();
				folder_btn[i].setBackground(Color.yellow);
				folder_btn[i].setBounds(80, 100+120*i, 80, 80);
				center_panel.add(folder_btn[i]);
				
				JLabel name = new JLabel(folder_name.get(i));
				name.setBounds(100, 150+120*i, 80, 80);
				center_panel.add(name);
			  }
		}
		
		delete_folder.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				center_panel.setVisible(false);
				side_panel.setVisible(false);
				bottom_panel.setVisible(false);
				
				setTitle("Delete Folder");
				setSize(400, 200);
				
				setLocation(150, 150);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				JPanel folder_panel = new JPanel();
				add(folder_panel);
				setVisible(true);
				
				deleteGuestFileColleague.guestModifyFile(folder_panel);

			}

		});
		
		
		//어플리케이션 생성
		center_panel.setLayout(null);
		
		GuestApplicationIcon makeGuestPaintIcon = new GuestPaintIcon();
		GuestApplicationIcon makeGuestClockIcon = new GuestClockIcon();
		makeGuestPaintIcon.makeGusetApplicationIcon();
		makeGuestClockIcon.makeGusetApplicationIcon();
		
	}
	public void UserDesktop() {
		
	}
}