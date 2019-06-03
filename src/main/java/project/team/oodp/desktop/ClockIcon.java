package project.team.oodp.desktop;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import project.team.oodp.desktop.clocks.SuperClock;

public class ClockIcon extends JFrame implements ApplicationIcon{

   private static final City Port = null;

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
      
      UserDesktop.clock_btn.addActionListener(new ActionListener() {
    	  public void actionPerformed(ActionEvent e) {
    		  
//    		  CityIterator city_iterator = Main.cy.city_iterator();
//    		  
//    		  JFrame frame = new JFrame("Global Clock");
//    			frame.setVisible(true);//.setDefaultLookAndFeelDecorated(true);
//    			frame.setSize(300, 500);
//    			frame.setLocation(350,300);
//    			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//    			frame.setLayout(null);
//    			 
//    			
//              while(city_iterator.hasNext()){
//                 City city = (City)city_iterator.next();
//                 System.out.println(city);
//                 if(city.toString().contains("America")){// && UserDesktop.count == 0){
//                	 
//                	GlobalClockLabel date = new GlobalClockLabel("date", city.toString()); 
//         			GlobalClockLabel time = new GlobalClockLabel("time", city.toString()); 
//         			GlobalClockLabel day = new GlobalClockLabel("day", city.toString());
//         			
//         			
//         			frame.add(date);
//         			frame.add(time);
//         			frame.add(day);
//                 }
//                 
////                else if(city.toString().contains("Brazil")){// && UserDesktop.count == 1){
////                    GlobalClock brazil = new GlobalClock(city.toString());
////                    System.out.println(city.toString());
////                 }
////                 
////                else if(city.toString().contains("Iceland")){// && UserDesktop.count == 2){
////                    GlobalClock iceland = new GlobalClock(city.toString());
////                    System.out.println(city.toString());
////                }
////                 
////                 else if(city.toString().contains("Port")){// && UserDesktop.count == 3){
////                    GlobalClock porto = new GlobalClock(city.toString());
////                    System.out.println(city.toString());
////                 }
//                    
//              }
//              
//             frame.getContentPane().setBackground(Color.black);
//  			 frame.setVisible(true);
    		  
    		  
  			SuperClock time = new SuperClock();
  			CheckColor cc = new CheckColor();
    		  
    	  }

      });
      
      
     // clock_name.addMouseListener(new MouseListener() {
    	  
    	  //GlobalClock gc = new GlobalClock(title);
         
//         @Override
//         public void mouseReleased(MouseEvent e) {
//            // TODO Auto-generated method stub
//            
//         }
//         
//         @Override
//         public void mousePressed(MouseEvent e) {
//            // TODO Auto-generated method stub
//            
//         }
//         
//         @Override
//         public void mouseExited(MouseEvent e) {
//            // TODO Auto-generated method stub
//            
//         }
//         
//         @Override
//         public void mouseEntered(MouseEvent e) {
//            // TODO Auto-generated method stub
//            
//         }
//         
//         @Override
//         public void mouseClicked(MouseEvent e) {
//            // TODO Auto-generated method stub
//            java.awt.EventQueue.invokeLater(new Runnable(){
//                  @Override
//                  public void run()
//                  {
//                	  GlobalClock gc = new GlobalClock(title);
////                     worldtimeclock.Main app = new worldtimeclock.Main();
////                      app.setLocationRelativeTo(null);
////                      app.setVisible(true);
//                  }
//              });
//            
//         }
//      });
      
//  	Main.cy.addCities(new City("America/Los_Angeles"));
//    Main.cy.addCities(new City("Brazil/East"));
//    Main.cy.addCities(new City("Iceland"));
//    Main.cy.addCities(new City("Portugal"));
      
     // SuperClock time = new SuperClock();
      	  
    	  
    	  
      
   }

}