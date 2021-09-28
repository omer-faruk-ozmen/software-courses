
public class Car {
	private String color;
	private int doors;
	private int wheels;

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {

		if (doors < 2) {
			System.out.println("Kapı sayısı 2'den az olamaz");
		} else {
			this.doors = doors;
		}
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

}
