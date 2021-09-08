package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		Customer cust1 =new Customer("Alex", "Addr", 25000);
		
		
		Vehicle veh1 = new Vehicle("Honda", "Neon", 1000, true);
		
		
		Employee emp = new Employee();
		cust1.purchanseCar(veh1, emp, false);


	}

}
