package worldtimeclock;

import java.util.ArrayList;
import java.util.List;

public class CityCollectionImpl implements CityCollection {

	private List<Place> citiesList;

	public CityCollectionImpl() {
		citiesList = new ArrayList<>();
	}

	public void addCity(Place c) {
		this.citiesList.add(c);
	}

	public void removeCity(Place c) {
		this.citiesList.remove(c);
	}

	@Override
	public CityIterator iterator(CityEnum type) {
		return new CityIteratorImpl(type, this.citiesList);
	}

	private class CityIteratorImpl implements CityIterator {

		private CityEnum type;
		private List<Place> cities;
		private int position;

		public CityIteratorImpl(CityEnum ty,
				List<Place> citiesList) {
			this.type = ty;
			this.cities = citiesList;
		}

		@Override
		public boolean hasNext() {
			while (position < cities.size()) {
				Place c = cities.get(position);
				if  (c.getTYPE().equals(type) || type.equals(CityEnum.SINGLETON)) {
					return true;
				} else
					position++;
			}
			return false;
		}

		@Override
		public Place next() {
			Place c = cities.get(position);
			position++;
			return c;
		}

	}
}
