package project.team.oodp.desktop;

public class CityListIterator implements CityIterator{
	private CityList cityList;
	private int index;
	
	public CityListIterator(CityList cityList){
		this.cityList = cityList;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return cityList.getCityNum() > index;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		City city = cityList.getCities(index);
		index++;
		return city;
	}
	
	

}
