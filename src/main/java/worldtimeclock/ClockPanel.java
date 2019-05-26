package worldtimeclock;

@SuppressWarnings("serial")
public class ClockPanel extends javax.swing.JPanel implements java.beans.PropertyChangeListener
{
    private City city = City.Seoul;
    private String cityName = City.Seoul.getName();
    private long offset = City.Seoul.getOffset();

    /*Creates new form ClockPanel*/
    public ClockPanel()
    {        
        initComponents();
        cityLabel.setText(cityName);
        clock.addPropertyChangeListener(this);
        setPreferredSize(new java.awt.Dimension(358, 74));
    }

    public City getCity()
    {
        return this.city;
    }

    public void setCity(City city)
    {
        this.city = city;
        this.cityName = city.getName();
        this.offset = city.getOffset();

        long localOffset = java.util.Calendar.getInstance().get(java.util.Calendar.ZONE_OFFSET);        
        long diff = localOffset + offset;
        int minDiff = (int) (diff % 3600000);
        int hourDiff = (int) (diff / 3600000);

        this.clock.setTimeZoneOffsetHour(hourDiff);
        this.clock.setTimeZoneOffsetMinute(minDiff);
        
        cityLabel.setText(this.cityName);       
    }

    private void initComponents() {

        cityLabel = new worldtimeclock.TextLabel();
        dayLabel = new worldtimeclock.TextLabel();
        clock = new worldtimeclock.AnalogClock();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(358, 100));
        setSize(new java.awt.Dimension(305, 100));

        cityLabel.setText("City");
        cityLabel.setFont(new java.awt.Font("Arial", 0, 36));
        cityLabel.setName("cityLabel");
        dayLabel.setText("today");
        dayLabel.setFont(new java.awt.Font("Arial", 0, 18));
        dayLabel.setName("dayLabel");
        clock.setName("clock");
        clock.setPreferredSize(new java.awt.Dimension(74, 74));

        org.jdesktop.layout.GroupLayout clockLayout = new org.jdesktop.layout.GroupLayout(clock);
        clock.setLayout(clockLayout);
        clockLayout.setHorizontalGroup(
            clockLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 74, Short.MAX_VALUE)
        );
        clockLayout.setVerticalGroup(
            clockLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 74, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
            		.add(clock, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            		.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            		.add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            				.add(layout.createSequentialGroup()
            						.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            						.add(dayLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 148, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            						.addContainerGap()
            					)
            				.add(cityLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
            			)
            	)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(cityLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                   .add(dayLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
            .add(clock, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
    }

    private worldtimeclock.TextLabel cityLabel;
    private worldtimeclock.AnalogClock clock;
    public worldtimeclock.TextLabel dayLabel;


    @Override
    public void propertyChange(java.beans.PropertyChangeEvent event)
    {
        if (event.getSource().equals(clock))
        {
            if (event.getPropertyName().equals("dayOffset"))
            {
                switch((Integer)event.getNewValue())
                {
                    case -1:
                        dayLabel.setText("yesterday");
                        break;
                    case 0:
                        dayLabel.setText("today");
                        break;
                    case 1:
                        dayLabel.setText("tomorrow");
                        break;
                    default:
                        dayLabel.setText("today");
                        break;
                }
            }
        }
    }
}
