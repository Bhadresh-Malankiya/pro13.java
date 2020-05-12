/*
Write a program for calculator to accept an expression as a string in which the operands and operator
 are separated by zero or more spaces. 
For ex: 3+4 and 3 + 4 are acceptable expressions .
*/
import java.util.Scanner;
class pro13
{
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Calculation:");
		String a=s1.nextLine();
		
		a = a.replaceAll(" ","");

		a = a.replaceAll("[+]","#+#");
		a = a.replaceAll("[-]","#-#");
		a = a.replaceAll("[*]","#*#");
		a = a.replaceAll("[/]","#/#");
		args = a.split("#");

		// Check number of strings passed
		if (args.length != 3) {
			System.out.println(
				"Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

		// The result of the operation
		int result = 0;

		// Determine the operator
		switch (args[1].charAt(0)) {
			case '+' : result = Integer.parseInt(args[0]) +
									  Integer.parseInt(args[2]);
						  break;
			case '-' : result = Integer.parseInt(args[0]) -
									  Integer.parseInt(args[2]);
						  break;
			case '*' : result = Integer.parseInt(args[0]) *
									  Integer.parseInt(args[2]);
						  break;
			case '/' : result = Integer.parseInt(args[0]) /
									  Integer.parseInt(args[2]);
						  break;
		}

		// Display result
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
			+ " = " + result);
	}
}
