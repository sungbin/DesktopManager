package project.team.oodp.desktop;

public class CityList implements CityAggregate{
	
	private City [] cities;// = new City[]{};
	private int last_city = 0;
	
	public CityList(int maxsize){
		this.cities = new City[maxsize];
	}

	public City getCities(int index) {
		return cities[index];
	}

	public void addCities(City string) {
		this.cities[last_city] = string;
		last_city++;
	}
	
	public int getCityNum(){
		return last_city;
	}

	@Override
	public CityIterator city_iterator() {
		// TODO Auto-generated method stub
		return new CityListIterator(this);
	}
	
	
	


}
