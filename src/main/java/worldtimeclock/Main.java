package worldtimeclock;

@SuppressWarnings("serial")
public class Main extends javax.swing.JFrame
{

   private BackgroundPanel backgroundPanel1;
    private ClockPanel clockPanel1;
    private ClockPanel clockPanel2;
    private ClockPanel clockPanel3;
    private ClockPanel clockPanel4;

    
    public Main()
    {
        initComponents();
    }

    private void initComponents() {
       CityCollection cities = populateCities();
      CityIterator baseIterator = cities.iterator(CityEnum.SINGLETON);
      CityEnum singleton = CityEnum.SINGLETON;
   
        backgroundPanel1 = new BackgroundPanel();
        clockPanel1 = new ClockPanel();
        clockPanel2 = new ClockPanel();
        clockPanel3 = new ClockPanel();
        clockPanel4 = new ClockPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        backgroundPanel1.setName("backgroundPanel1");

        while (baseIterator.hasNext()) {
         Place c = baseIterator.next();
         singleton.setNameOffset("Seoul", -32400000);
         clockPanel1.setCity(CityEnum.SINGLETON);
          clockPanel1.setName("clockPanel1"); 
          singleton.setNameOffset("HonKong", -28800000);
          c = baseIterator.next();
          clockPanel2.setCity(CityEnum.SINGLETON);
          clockPanel2.setName("clockPanel2"); 
          singleton.setNameOffset("New York", 18000000);
          c = baseIterator.next();
          clockPanel3.setCity(CityEnum.SINGLETON);
          clockPanel3.setName("clockPanel3");
          singleton.setNameOffset("La Paz", 14400000);
          c = baseIterator.next();
          clockPanel4.setCity(CityEnum.SINGLETON);
          clockPanel4.setName("clockPanel4"); 
      }

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

    
    private static CityCollection populateCities() {
      CityCollection cities = new CityCollectionImpl();
      
      cities.addCity(new Place(-32400000, CityEnum.SINGLETON));
      cities.addCity(new Place(-28800000, CityEnum.SINGLETON));
      cities.addCity(new Place(18000000, CityEnum.SINGLETON));
      cities.addCity(new Place(14400000, CityEnum.SINGLETON));
   
      return cities;
   }
}