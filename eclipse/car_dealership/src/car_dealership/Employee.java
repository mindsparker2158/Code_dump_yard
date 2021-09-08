package car_dealership;

public class Employee {
	
	public void handleCustomer(Customer cust, Vehicle vehicle, boolean finance ) {
	
	if(vehicle.Checkavailability == true) {
		if(finance == true) {
			double loanAmount = (vehicle.getCarprice() - cust.getCashOnHand());
			System.out.println("Approved Loan Amount " +loanAmount);
			System.out.println("congratulations " +vehicle.getBrand() +vehicle.getModel() 
			+"is ready to be dispatched");
		}
		else if(vehicle.getCarprice() <= cust.getCashOnHand()) {
			System.out.println("congratulations Amount paid in cash & " +vehicle.getBrand() +" " +vehicle.getModel() 
			+" is ready to be dispatched");
		}
		else if(vehicle.getCarprice() > cust.getCashOnHand()) {
			System.out.println("Kindly check some lower price model, Thank you ");
		}
	}
	else{
		System.out.println("Prefered model is not available , Kindly proceed for advanced booking...");
	}
	
	
	}
	
	}
		