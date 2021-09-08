package car_dealership;

public class Vehicle {
	String Brand;
	String Model;
	double Carprice;
	boolean Checkavailability;
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public double getCarprice() {
		return Carprice;
	}
	public void setCarprice(double carprice) {
		Carprice = carprice;
	}
	public Vehicle(String brand, String model, double carprice, boolean checkavailability) {
		super();
		Brand = brand;
		Model = model;
		Carprice = carprice;
		Checkavailability = checkavailability;
	}
	public boolean isAvailable() {
		return Checkavailability;
	}
	public void setAvailable(boolean Checkavailability) {
		//Checkavailability = true;
		this.Checkavailability = Checkavailability;
	}
	
}
