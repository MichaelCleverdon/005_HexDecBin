import java.util.Scanner;
public class HexDecBin {
	//Debugged Scanner naming problem
	private Scanner kbd = new Scanner(System.in);
	private String hex = "";
	private int num;
	
	public HexDecBin() {

	}
	
	public void setHexNumber() {
		
		
		System.out.println("\nEnter the hex number: ");
		hex = kbd.nextLine();
		// mouse over parseInt to read pop-up guide
		num = Integer.parseInt(hex, 16);
		System.out.println("You have entered hex " + hex);
		System.out.println("Decimal value is: " + num + " " + "(remember 0-" + num + " has " + (num+1) + " values)");
	}
	public void convert() {
		String binary = Integer.toBinaryString(num);
		
		System.out.println("Binary value is: " + binary);
		System.out.println("Number of bits is " + binary.length());
		System.out.println("Number of whole nibbles (4 bits) is "+ Math.round(binary.length()/4) + " with "+ Math.floorMod(binary.length(), 4) + " bits left over");
		System.out.println("Number of whole bytes (8 bits) is " + Math.round(binary.length()/8)+ " with "+ Math.floorMod(binary.length(), 8) +" left over");
	}
		
}
