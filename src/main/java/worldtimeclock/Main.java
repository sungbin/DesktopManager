package worldtimeclock;

@SuppressWarnings("serial")
public class Main extends javax.swing.JFrame
{

	private worldtimeclock.BackgroundPanel backgroundPanel1;
    private worldtimeclock.ClockPanel clockPanel1;
    private worldtimeclock.ClockPanel clockPanel2;
    private worldtimeclock.ClockPanel clockPanel3;
    private worldtimeclock.ClockPanel clockPanel4;
    
    public Main()
    {
        initComponents();
    }

    private void initComponents() {

        backgroundPanel1 = new worldtimeclock.BackgroundPanel();
        clockPanel1 = new worldtimeclock.ClockPanel();
        clockPanel2 = new worldtimeclock.ClockPanel();
        clockPanel3 = new worldtimeclock.ClockPanel();
        clockPanel4 = new worldtimeclock.ClockPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel1.setName("backgroundPanel1");

        clockPanel1.setCity(worldtimeclock.City.Seoul);
        clockPanel1.setName("clockPanel1"); 

        clockPanel2.setCity(worldtimeclock.City.HongKong);
        clockPanel2.setName("clockPanel2"); 

        clockPanel3.setCity(worldtimeclock.City.NewYork);
        clockPanel3.setName("clockPanel3"); 

        clockPanel4.setCity(worldtimeclock.City.LaPaz);
        clockPanel4.setName("clockPanel4"); 

        org.jdesktop.layout.GroupLayout backgroundPanel1Layout = new org.jdesktop.layout.GroupLayout(backgroundPanel1);
        backgroundPanel1.setLayout(backgroundPanel1Layout);
        
        backgroundPanel1Layout.setHorizontalGroup(
            backgroundPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(backgroundPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .add(backgroundPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(clockPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(clockPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(clockPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(clockPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundPanel1Layout.setVerticalGroup(
            backgroundPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(backgroundPanel1Layout.createSequentialGroup()
            .add(20, 20, 20)
            .add(clockPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(18, 18, 18)
            .add(clockPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(18, 18, 18)
            .add(clockPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(18, 18, 18)
            .add(clockPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(21, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(backgroundPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 398, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(backgroundPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 391, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                Main app = new Main();
                app.setLocationRelativeTo(null);
                app.setVisible(true);
            }
        });
    }
    
}
