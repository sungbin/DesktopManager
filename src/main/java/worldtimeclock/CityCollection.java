package worldtimeclock;

public interface CityCollection {
	public void addCity(Place C);
	public void removeCity(Place C);
	public CityIterator iterator (CityEnum type);
}
