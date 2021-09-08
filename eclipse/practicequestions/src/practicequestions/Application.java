package practicequestions;
import java.io.*;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		try {
		System.out.println("Enter the first number : ");
		int num1 = scan.nextInt();
		System.out.println("Enter second number : ");
		int num2 = scan.nextInt();
		int num3 = num1+num2;
		System.out.println(num3);
		}
		catch (InputMismatchException e) {
			
		System.out.println("Enter Number only...");
		}
		finally {
		System.out.println("Operation completd.");
		}
		}
	}

	

