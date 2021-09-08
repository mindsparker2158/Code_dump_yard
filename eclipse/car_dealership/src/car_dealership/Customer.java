package car_dealership;

public class Customer {
	private String name;
	private String address;
	private double cashOnHand;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public Customer(String name, String address, double cashOnHand) {
		super();
		this.name = name;
		this.address = address;
		this.cashOnHand = cashOnHand;
	}


	public void setAddress(String address) {
		address += "Dealership city";
		this.address = address;
	}


	public double getCashOnHand() {
		return cashOnHand;
	}


	public void setCashOnHand(double cashOnHand) {
		cashOnHand +=500;
		this.cashOnHand = cashOnHand;
	}


	public void purchanseCar(Vehicle vehicle, Employee employee, boolean finance){
		employee.handleCustomer(this, vehicle, finance);
		
		
	}

	

}
