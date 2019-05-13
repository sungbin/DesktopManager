package project.team.oodp.desktop.login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUp extends JFrame {//implements ActionListener{
	
	JLabel id_label, pw_label, pw_check_label, email_label, phoneNum_label;
	JTextField id_txt, email_txt, phoneNum_txt;
	JPasswordField pw_txt, pw_check_txt;
	JButton confirm_btn;
	
	//hashmap이나 다른거 의견 모아서 바꿀것. 임시 사용
	static ArrayList <String> id_list = new ArrayList<String>();
	static ArrayList <String> pw_list = new ArrayList<String>();
	
	SignUp(){
		setTitle("Sign-Up");
		setSize(500,700);
		setLocation(1000, 300);
		setDefaultCloseOperation(SignUp.EXIT_ON_CLOSE);
		
		JLabel header_label = new JLabel("Registration Form for Desktop Manager: ");
		header_label.setForeground(Color.blue);
		header_label.setFont(new Font("Serif", Font.BOLD, 20));
		header_label.setBounds(60, 30, 400, 30);
		add(header_label);
		
		JPanel panel = new JPanel();
		placeSignUpPanel(panel);
		add(panel);
		setVisible(true);
	}
	
	public void placeSignUpPanel(JPanel panel){
		panel.setLayout(null);
		id_label = new JLabel("Id");
		id_label.setBounds(50, 100, 80, 25);
		panel.add(id_label);
		
		pw_label = new JLabel("Password");
		pw_label.setBounds(50, 130, 80, 25);
		panel.add(pw_label);
		
		pw_check_label = new JLabel("Confirm Password");
		pw_check_label.setBounds(50, 160, 150, 25);
		panel.add(pw_check_label);
		
		email_label = new JLabel("Email : ");
		email_label.setBounds(50, 190, 80, 25);
		panel.add(email_label);
		
		phoneNum_label = new JLabel("Phone No : ");
		phoneNum_label.setBounds(50, 220, 80, 25);
		panel.add(phoneNum_label);
		
		
		id_txt = new JTextField(20);
		id_txt.setBounds(240, 100, 160, 25);
		panel.add(id_txt);
		
		pw_txt = new JPasswordField(20);
		pw_txt.setBounds(240, 130, 160, 25);
		panel.add(pw_txt);
		
		pw_check_txt = new JPasswordField(20);
		pw_check_txt.setBounds(240, 160, 160, 25);
		panel.add(pw_check_txt);
		
		email_txt = new JTextField();
		email_txt.setBounds(240, 190, 160, 25);
		panel.add(email_txt);
		
		phoneNum_txt = new JTextField();
		phoneNum_txt.setBounds(240, 220, 160, 25);
		panel.add(phoneNum_txt);
		
		confirm_btn = new JButton("Confirm");
		confirm_btn.setBounds(240, 250, 100, 25);
		panel.add(confirm_btn);
		confirm_btn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				confirm_PW();
				
			}
			
		});
	}
	
	public void confirm_PW(){
		if(Arrays.equals(pw_txt.getPassword(), pw_check_txt.getPassword())){
			char [] pw_arr = pw_txt.getPassword();
			String pw = new String(pw_arr);
			id_list.add(id_txt.getText());
			pw_list.add(pw);
			dispose();
			new SuperLogInFactory().createLogIn();
		}
		
		else{
			JOptionPane.showMessageDialog(null, "Password not matched!\n Please check your password again");
		}
	}

}
