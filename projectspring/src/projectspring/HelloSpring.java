package projectspring;

import java.util.List;
import java.util.Map;

public class HelloSpring {
	
	private String name;
	private List<String> cityList;
	private Map<String, String> cityMap;

	public HelloSpring() {
	}

	public HelloSpring(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public List<String> getCityList() {
		return cityList;
	}

	public void setCityList(List<String> cityList) {
		this.cityList = cityList;
	}

	public Map<String, String> getCityMap() {
		return cityMap;
	}

	public void setCityMap(Map<String, String> cityMap) {
		this.cityMap = cityMap;
	}

	
	
	

}
