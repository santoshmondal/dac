package package2;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	private String modal;
	private String brand;
	private String color;
	
	@Autowired
	private AC ac;

	public String getModal() {
		return modal;
	}

	public void setModal(String modal) {
		this.modal = modal;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public AC getAc() {
		return ac;
	}
	
	public void setAc(AC ac) {
		this.ac = ac;
	}
	
	
}
