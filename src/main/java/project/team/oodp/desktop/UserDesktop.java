package project.team.oodp.desktop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import paints.Frame;
import project.team.oodp.desktop.clocks.SuperClock;
import project.team.oodp.desktop.folderColor.FolderColor;
import project.team.oodp.desktop.folderColor.RedFolder;
import project.team.oodp.desktop.folderColor.YellowFolder;
import project.team.oodp.desktop.login.SuperLogInFactory;

public class UserDesktop extends Desktop {

	JPanel whole_panel, center_panel, bottom_panel, side_panel;
	JButton window_btn, paint_btn, watch_btn;
	JLabel empty1, empty2, empty3, empty4, empty5, empty6;
	JButton create_folder, delete_folder, create_file, delete_file;
	JButton clock_btn;
	// ìˆ˜ì •
	// FileManager fm = new FileManager();
	JButton[] folder_btn = new JButton[30];
	static int number_of_folder = 0;
	static ArrayList<String> folder_name = new ArrayList<String>();

	public UserDesktop() throws IOException {

//		JFrame jf = new JFrame("Welcome to Desktop Manager :)");

//		jf.setLayout(new BorderLayout());
		setTitle("Welcome to Desktop Manager :)");
		setSize(1000, 750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
//		add(jf);

		setLayout(new BorderLayout());
		center_panel = new JPanel();
		center_panel.setBackground(new Color(0, 128, 128));

		side_panel = new JPanel();
		side_panel.setSize(100, 100);
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
		bottom_panel.add(clock_btn);

		JPanel clock_panel = new JPanel();
		SuperClock time = new SuperClock();

		clock_panel.add(time);

		clock_panel.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		bottom_panel.add(clock_panel);

		side_panel = new JPanel();

		add(center_panel, "Center");
		add(bottom_panel, "South");

		// ìˆ˜ì •

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
				placeCreateFolderPanel(folder_panel);

				add(folder_panel);

				setVisible(true);

				// dispose();
			}

		});

		// ì–´í”Œë¦¬ì¼€ì�´ì…˜ ìƒ�ì„±í•˜ëŠ” ë¶€ë¶„
		center_panel.setLayout(null);
		JLabel paint_name = new JLabel("Paint");
		paint_name.setBounds(100, 690, 80, 20);
		center_panel.add(paint_name);

		paint_btn = new JButton();
		paint_btn.setBackground(Color.white);
		paint_btn.setBounds(80, 690, 80, 20);
		center_panel.add(paint_btn);

		paint_btn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				center_panel.setVisible(false);
				side_panel.setVisible(false);
				bottom_panel.setVisible(false);
				Frame fram = new Frame();
				fram.main(null);
			}

		});

		JLabel watch_name = new JLabel("Watch");
		watch_name.setBounds(220, 690, 80, 20);
		center_panel.add(watch_name);

		watch_btn = new JButton();
		watch_btn.setBackground(Color.white);
		watch_btn.setBounds(200, 690, 80, 20);
		center_panel.add(watch_btn);
		
		watch_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			}


		});

		// í�´ë�”ë¥¼ ìƒ�ì„±í•˜ëŠ” ë¶€ë¶„
		FolderColor yellow = new YellowFolder();
		FolderColor red = new RedFolder();
		Iterator<String> itr = folder_name.iterator();

		if (number_of_folder > 0) {
			int folder_pointer = 0;
			int folder_pointer2 = 0;
			center_panel.setLayout(null);
			for (int i = 0; i < number_of_folder; i++) {
				folder_btn[i] = new JButton();
				if (i % 2 == 0) {
					folder_btn[i].setBackground(yellow.setFolderColor());
				} else {
					folder_btn[i].setBackground(red.setFolderColor());
				}
				folder_btn[i].setBounds(80 + folder_pointer, 100 + 150 * folder_pointer2, 80, 80);
				center_panel.add(folder_btn[i]);

				JLabel name = new JLabel(folder_name.get(i));
				name.setBounds(100 + folder_pointer, 150 + 150 * folder_pointer2, 80, 80);
				center_panel.add(name);

				folder_pointer2++;

				if ((i + 1) % 4 == 0) {
					folder_pointer += 140;
					folder_pointer2 = 0;
				}
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

				placeDeleteFolderPanel(folder_panel);

				add(folder_panel);

				setVisible(true);
			}

		});
	}

	private void placeCreateFolderPanel(JPanel folder_panel) {
		JTextField folder_name_txt;

		folder_panel.setLayout(null);

		JLabel folder_name_label = new JLabel("Folder Name");
		folder_name_label.setBounds(120, 30, 80, 25);
		folder_panel.add(folder_name_label);

		folder_name_txt = new JTextField(20);
		folder_name_txt.setBounds(120, 70, 160, 25);
		folder_panel.add(folder_name_txt);

		JButton button = new JButton("Create");
		button.setBounds(120, 100, 80, 25);
		folder_panel.add(button);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				try {
					folder_name.add(folder_name_txt.getText());
					number_of_folder++;
					dispose();
					new UserDesktop();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

	}

	private void placeDeleteFolderPanel(JPanel folder_panel) {
		JTextField folder_name_txt;

		folder_panel.setLayout(null);

		JLabel folder_name_label = new JLabel("Folder Name");
		folder_name_label.setBounds(130, 30, 80, 25);
		folder_panel.add(folder_name_label);

		folder_name_txt = new JTextField(20);
		folder_name_txt.setBounds(120, 70, 160, 25);
		folder_panel.add(folder_name_txt);

		JButton button = new JButton("Delete");
		button.setBounds(120, 100, 80, 25);
		folder_panel.add(button);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				try {
					for (int i = 0; i < number_of_folder; i++) {
						if (folder_name_txt.getText().equals(folder_name.get(i))) {
							folder_name.remove(i);
							number_of_folder--;
							break;
						}
					}
					dispose();
					new UserDesktop();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

	}
}