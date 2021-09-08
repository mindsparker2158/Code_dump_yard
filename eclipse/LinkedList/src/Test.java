import java.util.LinkedList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first : ");
		int num1 = scan.nextInt();
		System.out.println("Enter second number");
		int num2 = scan.nextInt();
		numbers.add(num1);
		numbers.add(num2);
		for (int number : numbers) {
			System.out.println(number);
		}

	}

}
