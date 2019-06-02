package project.team.oodp.desktop;

import java.util.Map;
import java.util.TreeMap;

public class FlyweightFactory {

	static Map<String, Flyweight> pool = new TreeMap<String, Flyweight>();

	public FlyweightFactory(){
	}


	public String getFlyweight(String key){
		String line;
		Flyweight flyweight = pool.get(key);
		if(flyweight == null){
			flyweight = new Flyweight(key);
			pool.put(key, flyweight);
			
			line = "Welcome to Desktop Manager :)"+key;
		}else{
			line = "Nice to meet you again :)" + key;
		}
		return line;

	}
}
