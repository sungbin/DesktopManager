package project.team.oodp.desktop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuestFileDeleter extends GuestColleague{
	
	public GuestFileDeleter(GuestIMediator guestMediator) {
		this.guestMediator = guestMediator;
	}

	@Override
	public void guestModifyFile(JPanel folder_panel) {
		// TODO Auto-generated method stub
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
					for(int i = 0; i < GuestDesktop.number_of_folder; i++) {
						if(folder_name_txt.getText().equals(GuestDesktop.folder_name.get(i))) {
							GuestDesktop.folder_name.remove(i);
							GuestDesktop.number_of_folder--;
							break;
						}
					}

					new GuestDesktop();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
	}
	
	

}
