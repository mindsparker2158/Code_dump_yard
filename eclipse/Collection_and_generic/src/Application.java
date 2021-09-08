import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter First number : ");
	int first= scan.nextInt();
	System.out.println("Enter second number : ");
	int second = scan.nextInt();
	ArrayList<Integer> number = new ArrayList<Integer>();
	number.add(first);
	number.add(second);
	int num1 = number.get(0);
	int num2 = number.get(1);
	System.out.println(num1 + num2);

	}

}
