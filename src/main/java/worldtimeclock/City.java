
package worldtimeclock;

public enum City
{
    Seoul("Seoul", -32400000),
    HongKong("Hong Kong", -28800000),
    NewYork("New York", 18000000),
    LaPaz("La Paz", 14400000);

    private long offset;
    private String name;

    City(String name, long offset)
    {
        this.name = name;
        this.offset = offset;
    }

    public String getName()
    {
        return this.name;
    }

    public long getOffset()
    {
        return this.offset;
    }
}
