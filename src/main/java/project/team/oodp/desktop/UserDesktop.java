package project.team.oodp.desktop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import project.team.oodp.desktop.clocks.SuperClock;
import project.team.oodp.desktop.folderColor.FolderColor;
import project.team.oodp.desktop.folderColor.RedFolder;
import project.team.oodp.desktop.folderColor.YellowFolder;
import project.team.oodp.desktop.login.SuperLogIn;
import project.team.oodp.desktop.login.SuperLogInFactory;

public class UserDesktop extends Desktop{


	public static JPanel whole_panel, center_panel, bottom_panel, side_panel;
	public static JButton window_btn, paint_btn,clock_btn;
	JLabel empty1, empty2, empty3, empty4, empty5, empty6;
	JButton create_folder, delete_folder, create_file, delete_file;

	JButton[] folder_btn = new JButton[30];
	static int number_of_folder = 0;
	static ArrayList<String> folder_name = new ArrayList<String>();
	IMediator mediator = new ConcreteMediator();
	FileMaker makeFileColleague = new FileMaker(mediator);
	FileDeleter deleteFileColleague = new FileDeleter(mediator);



	public UserDesktop() throws IOException{

		//superlogin에서 current_id 추가해주기 
		FlyweightFactory factory = new FlyweightFactory();
		String flyweight = factory.getFlyweight(SuperLogIn.current_id);
		setTitle(flyweight);


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
		bottom_panel.setSize(100, 100);
		bottom_panel.setLayout(new GridLayout(1, 10));
		window_btn = new JButton("Start");
		window_btn.addActionListener(new ActionListener() {

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

		clock_btn = new JButton("Clock");

		clock_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				CheckColor cc = new CheckColor(); // Strategy Pattern
			}

		});

		clock_btn.setBackground(new java.awt.Color(248, 248, 248));
		create_folder.setBackground(new java.awt.Color(248, 248, 248));
		delete_folder.setBackground(new java.awt.Color(248, 248, 248));

		bottom_panel.add(create_folder);
		bottom_panel.add(delete_folder);


		JPanel clock_panel = new JPanel();
		SuperClock time = new SuperClock();

		clock_panel.add(time);


		bottom_panel.add(clock_panel);      

		side_panel = new JPanel();

		add(center_panel, "Center");
		add(bottom_panel, "South");

		//수정 

//폴터 생성
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

				makeFileColleague.modifyFile(folder_panel);	
			}

		});
		center_panel.setLayout(null);

		ApplicationIcon makePaintIcon = new PaintIcon();
		ApplicationIcon makeClockIcon = new ClockIcon();
		makePaintIcon.makeApplicationIcon();
		makeClockIcon.makeApplicationIcon();


		FolderColor yellow = new YellowFolder();
		FolderColor red = new RedFolder();


		if(number_of_folder > 0) {
			int folder_pointer = 0;
			int folder_pointer2 = 0;
			center_panel.setLayout(null);
			for (int i = 0; i < number_of_folder; i++) {
				folder_btn[i] = new JButton();
				if(i%2 == 0) {
					folder_btn[i].setBackground(yellow.setFolderColor());
				}else {
					folder_btn[i].setBackground(red.setFolderColor());
				}
				folder_btn[i].setBounds(80+folder_pointer, 100+150*folder_pointer2, 80, 80);
				center_panel.add(folder_btn[i]);

				JLabel name = new JLabel(folder_name.get(i));
				name.setBounds(100+folder_pointer, 150+150*folder_pointer2, 80, 80);
				center_panel.add(name);

				folder_pointer2++;

				if((i+1) % 4 == 0) {
					folder_pointer += 140;
					folder_pointer2 = 0;
				}
			}
		}

//폴더 삭제 
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

				deleteFileColleague.modifyFile(folder_panel);
			}

		});

	}

}