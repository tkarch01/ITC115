/*
* ITC 115 W16 - 3182
* Assignment 7
* 
*Thomas Karchesy
* February 29, 2016
*/

package assignment7;

import java.text.NumberFormat;

public class Main {

	public static void main(String[] args) {
		NumberFormat currency = NumberFormat.getCurrencyInstance();

		/* The quarterly sales for each region should be hard-coded 
		 * into the program using the numbers shown in the console 
		 * output example. The sales numbers should be stored in a 
		 * rectangular array.
		 * The array sales is a rectangular array that represents 
		 * quarterly sales by four regions. The rows will be the 
		 * regions and the columns will be the quarters. The values
		 * will be sales in dollars.
		 */
		double[][] sales = { {1540.00, 2010.00, 2450.00, 1845.00}, {1130.00, 1168.00, 1847.00, 1491.00}, {1580.00, 2305.00, 2710.00, 1284.00}, {1105.00, 4102.00, 2391.00, 1576.00} }; //new double[4][4]

		
		


	/* total used to get grand total.
	 * row is used to label the outputs that need row number.
	 */
	double total = 0.00;
	int row = 0;

	// displayLine a welcome message
	Console.displayLine("Welcome to the Sales Report");     
	
	/* 
	 * The first section of the report should use nested for loops to 
	 * display the sales by quarter for each region. Use tabs to line 
	 * up the columns for this section of the report. 
	 */
	Console.displayLine();        
	Console.displayLine("Region\tQ1\t\tQ2\t\tQ3\t\tQ4");
	
	row = 0;
	for (double[] region1 : sales){
		Console.displayItem(""+(row +1));
		for(double quarter : region1){
			/* print out the sales by quarter by region */
			String quarterFormatted = currency.format(quarter);
			Console.displayItem("\t" + quarterFormatted);
		}
		Console.displayLine();
		row++;
	}
	
	
	/* 
	 * The second section of the report should use nested for loops to 
	 * calculate the sales by region by adding up the quarterly sales 
	 * each region. 
	 */
	Console.displayLine();
	Console.displayLine("Sales by region:");
 
	for (int region = 0; region <4; region++){
		Console.displayItem("Region "+(region +1)+": ");
		total = 0.00;
		for (int quarter = 0; quarter < 4; quarter++){
			total += sales[region][quarter];
		}
		String totalFormatted = currency.format(total);
		Console.displayItem(totalFormatted +"\n");
	}

	/* 
	 * The third section of the report should use nested for loops to 
	 * calculate the sales by quarter by adding up the individual region 
	 * sales for each quarter. 
	 */
	Console.displayLine();
	Console.displayLine("Sales by quarter:");

	for (int quarter = 0; quarter <4; quarter++){
		Console.displayItem("Q"+(quarter +1)+": ");
		total = 0.00;
		for (int region = 0; region < 4; region++){
			total += sales[region][quarter];
		}
		String totalFormatted = currency.format(total);
		Console.displayItem(totalFormatted +"\n");
	}
	
	/* 
	 * The fourth section of the report should use an enhanced for loop 
	 * to calculate the total annual sales for all regions. 
	 */
	
	total = 0.00;
	for (double[] region4 : sales){
		for(double quarter : region4){
			total += quarter;	
		}
	}
	
	String totalFormatted = currency.format(total);
	Console.displayLine();
	Console.displayLine("Total annual sales, all regions: " + totalFormatted);
	Console.displayLine();
	
	}

}
