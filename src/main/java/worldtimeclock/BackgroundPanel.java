package worldtimeclock;

@SuppressWarnings("serial")
public class BackgroundPanel extends javax.swing.JPanel
{
    private java.awt.image.BufferedImage backgroundImage;

    public BackgroundPanel()
    {
        this.setPreferredSize(new java.awt.Dimension(200, 150));
        this.setSize(new java.awt.Dimension(200, 150));
        setOpaque(false);
        init();
    }

    private void init()
    {
        this.backgroundImage = null;
    }

    @Override
    public void setSize(int width, int height)
    {
        super.setSize(width, height);
        this.backgroundImage = null;
        repaint();
    }


    @Override
    public void setSize(java.awt.Dimension dim)
    {
        super.setSize(dim);
        this.backgroundImage = null;
        repaint();
    }


    @Override
    protected void paintComponent(java.awt.Graphics g)
    {
        super.paintComponent(g);
        
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();

        if (this.backgroundImage == null)
        {
            this.backgroundImage = createBackgroundImage();
        }

        g2.drawImage(backgroundImage, 0, 0, null);

        g2.dispose();
    }

    private java.awt.image.BufferedImage createBackgroundImage()
    {
        java.awt.GraphicsConfiguration gfxConf = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
        final java.awt.image.BufferedImage IMAGE = gfxConf.createCompatibleImage(getWidth(), getHeight(), java.awt.Transparency.TRANSLUCENT);

        java.awt.Graphics2D g2 = IMAGE.createGraphics();

        g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        
        java.awt.geom.Point2D BACKGROUND_START = new java.awt.geom.Point2D.Double(0, 0);
        java.awt.geom.Point2D BACKGROUND_STOP = new java.awt.geom.Point2D.Double(0, getHeight());

        final float[] BACKGROUND_FRACTIONS =
        {
            0.0f,
            1.0f
        };

        final java.awt.Color[] BACKGROUND_COLORS =
        {
            new java.awt.Color(0x505652),
            new java.awt.Color(0x393E3A)
        };

        final java.awt.Shape BACKGROUND = new java.awt.geom.RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 5, 5);

        final java.awt.LinearGradientPaint BACKGROUND_GRADIENT = new java.awt.LinearGradientPaint(BACKGROUND_START, BACKGROUND_STOP, BACKGROUND_FRACTIONS, BACKGROUND_COLORS );

        g2.setPaint(BACKGROUND_GRADIENT);
        g2.fill(BACKGROUND);

        java.awt.geom.Point2D INNER_BACKGROUND_START = new java.awt.geom.Point2D.Double(0, 10);
        java.awt.geom.Point2D INNER_BACKGROUND_STOP = new java.awt.geom.Point2D.Double(0, getHeight() - 10);

        final float[] INNER_BACKGROUND_FRACTIONS =
        {
            0.0f,
            1.0f
        };

        final java.awt.Color[] INNER_BACKGROUND_COLORS =
        {
            new java.awt.Color(0x4D5651),
            new java.awt.Color(0x393E3A)
        };

        final java.awt.Shape INNER_BACKGROUND = new java.awt.geom.RoundRectangle2D.Double(10, 10, getWidth() - 20, getHeight() - 20, 5, 5);

        final java.awt.LinearGradientPaint INNER_BACKGROUND_GRADIENT = new java.awt.LinearGradientPaint(INNER_BACKGROUND_START, INNER_BACKGROUND_STOP, INNER_BACKGROUND_FRACTIONS, INNER_BACKGROUND_COLORS );

        g2.setPaint(INNER_BACKGROUND_GRADIENT);
        g2.fill(INNER_BACKGROUND);
                
        g2.dispose();

        return IMAGE;
    }
}
