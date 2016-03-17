import java.text.NumberFormat;
import java.util.Scanner;


public class TheMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//user greeting
		System.out.println("Welcome to the Invoice Calculator");
		
		//create a Scanner Object to read the user input
		Scanner sc = new Scanner(System.in);
		//NumberFormat nf = new NumberFormat.getCurrencyInstance().format();
		System.out.print("Enter invoice amount and I will tell you what is your total including tax: ");
		
		double invoice = Double.parseDouble(sc.nextLine());
		
		System.out.println ("Adding 10% tax rate...");
		
		//calculate total using 10% tax rate
		
		double totalAmount = invoice + (invoice * .1);
		
		System.out.println("total amount is " + NumberFormat.getCurrencyInstance().format(totalAmount));
		
		sc.close();
	}

}
