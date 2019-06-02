package worldtimeclock;

public class IteratorTest {
	public static void main(String[] args) {
		CityCollection cities = populateCities();
		CityIterator baseIterator = cities.iterator(CityEnum.SINGLETON);
		while (baseIterator.hasNext()) {
			Place c = baseIterator.next();
			System.out.println(c.toString());
		}
		System.out.println("******");
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
