package worldtimeclock;

public class Place {
	private long timeDiff;
	private CityEnum TYPE;
	
	public Place(long timeDiff, CityEnum type){
		this.timeDiff=timeDiff;
		this.TYPE=type;
	}

	public long getDiff() {
		return timeDiff;
	}

	public CityEnum getTYPE() {
		return TYPE;
	}
	
	@Override
	public String toString(){
		return "TimeDiff="+this.timeDiff+", City Name="+this.TYPE;
	}
	
	
}
