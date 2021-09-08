import java.util.Scanner;

public class Student {
	public void bio() {
		System.out.println("Enter your name");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.println("Enter age");
		int age = input.nextInt();
		System.out.println(name +age);
		if(age>18) {
			
		}
		else {
			System.out.println("You can vote");System.out.println("wait till 18...");
		}
	}
}
