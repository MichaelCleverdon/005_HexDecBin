//import java.text.DecimalFormat;
import java.util.Scanner;

public class BinPower {

	//Fixed Scanner bug with float inputs

	private Scanner input = new Scanner(System.in);
	//DecimalFormat format = new DecimalFormat("0.#");
	public BinPower() {
		
	}
	
	public void setBinary() {
		
		//int and double are "primitive" means no Class for it
		//String is capital because there is a Class for it
		
		double exp;
		double base;
		double Answer;
		int ans=0;
		//2 ** 2 doesn't work, not Python, got error message
		String name = ""; 
		
		
		System.out.println("Welcome to my Hexadecimal, Decimal or "
				+ "Binary conversion program!");
			System.out.println("What is your name?");
			name = input.nextLine();
			System.out.println("Very nice to meet you " + name + " let's begin: \n");
			System.out.println(name + " please input a base number");
			
		//don't need 
		//Math myMath = new Math();
		//Math is "static" meaning we can just use it
		base = input.nextDouble();
		System.out.println("You have inputed " + base);
		System.out.println(name + " please input a binary exponent");
		exp = input.nextDouble();
		System.out.println("You have inputed " + exp);

		ans = 0;
		//(int) "Type Casting" -- pow requires double, which binary doesn't need
		//type cast  to get correct answer
		Answer = Math.pow(base, exp);
		System.out.println("Answer is " + Answer);
		
		
		
		
	}

}
