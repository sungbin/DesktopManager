package project.team.oodp.desktop;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClockIcon extends JFrame implements ApplicationIcon{

   @Override
   public void makeApplicationIcon() {
      // TODO Auto-generated method stub
      JLabel clock_name = new JLabel(" ");
      clock_name.setBounds(220, 690, 80, 20);
      UserDesktop.center_panel.add(clock_name);
      
      UserDesktop.clock_btn = new JButton("Clock");
      UserDesktop.clock_btn.setBackground(Color.white);
      UserDesktop.clock_btn.setBounds(200, 690, 80, 20);
      UserDesktop.center_panel.add(UserDesktop.clock_btn);
      
      clock_name.addMouseListener(new MouseListener() {
         
         @Override
         public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub
            
         }
         
         @Override
         public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
            
         }
         
         @Override
         public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub
            
         }
         
         @Override
         public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub
            
         }
         
         @Override
         public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            java.awt.EventQueue.invokeLater(new Runnable(){
                  @Override
                  public void run()
                  {
                     worldtimeclock.Main app = new worldtimeclock.Main();
                      app.setLocationRelativeTo(null);
                      app.setVisible(true);
                  }
              });
            
         }
      });
      

      
   }

}