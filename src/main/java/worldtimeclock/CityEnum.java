package worldtimeclock;

public enum CityEnum {
	  	SINGLETON("Seoul", -32400000);
	    
	    private long offset;
	    private String name;

	    CityEnum(String name, long offset)
	    {
	        this.name = name;
	        this.offset = offset;
	    }
	    
	    public void setNameOffset(String name, long offset) {
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
