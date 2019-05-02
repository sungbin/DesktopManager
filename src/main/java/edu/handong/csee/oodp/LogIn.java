package edu.handong.csee.oodp;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogIn extends JFrame{

	private JButton login_btn;
	private JButton reset_btn;
	private JLabel guest_label;
	private JButton signup_btn;
	private JPasswordField pw_txt;
	private JTextField id_txt;
	
	LogIn(){
		setTitle("Login");
		setSize(400, 200);

		setLocation(750, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		placeLoginPanel(panel);
		add(panel);
		
		
		setVisible(true);
	}
	
	public void placeLoginPanel(JPanel panel){
		panel.setLayout(null);
		JLabel id_label = new JLabel("Id");
		id_label.setBounds(50, 10, 80, 25);
		panel.add(id_label);
		
		JLabel pw_label = new JLabel("Password");
		pw_label.setBounds(50, 40, 80, 25);
		panel.add(pw_label);
		
		id_txt = new JTextField(20);
		id_txt.setBounds(150, 10, 160, 25);
		panel.add(id_txt);
		
		pw_txt = new JPasswordField(20);
		pw_txt.setBounds(150, 40, 160, 25);
		panel.add(pw_txt);
		pw_txt.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent ae){
				isLoginCheck();
			}
		});
		
		reset_btn = new JButton("Reset");
		reset_btn.setBounds(10, 80, 100, 25);
		panel.add(reset_btn);
		reset_btn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ae){
				id_txt.setText("");
				pw_txt.setText("");
			}
		});
		
		signup_btn = new JButton("Sign-Up");
		signup_btn.setBounds(130, 80, 120, 25);
		panel.add(signup_btn);
		signup_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new SignUp();
				dispose();
//				setVisible(true);
			}
		});
		
		guest_label = new JLabel("Guest LogIn");
		guest_label.setBounds(155, 110, 120, 25);
		panel.add(guest_label);
		guest_label.addMouseListener(new MouseAdapter(){
			
			public void mouseClicked(MouseEvent me){
				try {
					new Desktop();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				dispose();
			}
		});
		
		
		login_btn = new JButton("Login");
		login_btn.setBounds(270, 80, 100, 25);
		panel.add(login_btn);
		login_btn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ae){
				isLoginCheck();
			}
		});
		
	}
	
	public void isLoginCheck(){
		boolean id_check = false;
		boolean pw_check = false;
		
		
		for(String id : SignUp.id_list){
		
			if(id_txt.getText().equals(id))
				id_check = true;
		}
		
		for(String pw : SignUp.pw_list){
				pw_check = true;
		}
		
		
		if(id_check == true && pw_check == true){
			
			JOptionPane.showMessageDialog(null, "Success");
			try {
				new Desktop();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		else
			JOptionPane.showMessageDialog(null, "Failed");
	}
	
/*	public void setMain(Main main){
		this.main = main;
	}*/
	


}
