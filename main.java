package conditionalStatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter value for a");
		int a = sc.nextInt();
		System.out.println("Enter value for b");
		int b = sc.nextInt();
		System.out.println("Enter the operation");
		sc.nextLine();
		char operator = sc.nextLine().charAt(0);
		int result = 0;
		switch (operator) {
		case '+' :
			result= a + b;
			break;
		case '-' :
			result= a - b;
			break;
		case '*' :
			result= a * b;
			break;
		case '/' :
			result= a / b;
			break;
		default :
			System.out.println("No operator found");
		}
		System.out.println("Result is " + result);

		
	}

}
