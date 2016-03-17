/*
* ITC 115 W16 - 3182
* Assignment 7
* 
*Thomas Karchesy
* February 29, 2016
*/

package ui;

import java.text.NumberFormat;
import db.Sales;

/* Class Main contains main method.
 * This application takes the data of a rectangular array and displays it in 
 * tabular format. It also sums the rows and columns and displays that information.
 * Finally it displays the totals of all elements of the array.
 * The array is loaded in the db package, Sales class. 
 */
public class Main {

	public static void main(String[] args) {
		NumberFormat currency =NumberFormat.getCurrencyInstance();

		double total =0.00;
		int row;

        // displayLine a welcome message
        Console.displayLine("Welcome to the Sales Report");     
        
        /* 
         * The first section of the report should use nested for loops to 
         * display the sales by quarter for each region. Use tabs to line 
         * up the columns for this section of the report. This is done 
         * by the Sales.salesResults()method called at line 37 of this file.
         */
        Console.displayLine();        
        Console.displayLine("Region\tQ1\t\tQ2\t\tQ3\t\tQ4");
		/* The following statement does all the calculations within the 
		 * salesResults() method in the Sales class file in the db package.
		 */
        total = Sales.salesResults();
        
        /* 
         * The second section of the report should use nested for loops to 
         * calculate the sales by region by adding up the quarterly sales 
         * each region. This is done by the Sales.salesResults()method called 
         * at line 37 of this file.
         */
        Console.displayLine();
        Console.displayLine("Sales by region:");
        row = 0;
        for (double sales : Sales.regions){
        	String salesFormatted = currency.format(sales);
        	row++;
        	Console.displayLine("Region " + row + ": " + salesFormatted);
        }
        
        /* 
         * The third section of the report should use nested for loops to 
         * calculate the sales by quarter by adding up the individual region 
         * sales for each quarter. This is done by the Sales.salesResults()
         * method called at line 37 of this file.
         */
        Console.displayLine();
        Console.displayLine("Sales by quarter:");
        row = 0;
        /* Use the enhanced for loop to display the contents of Sales.quarters */
        for (double sales : Sales.quarters){
        	/* Format Number Class to display currency format */
        	String salesFormatted = currency.format(sales);
        	row++;
        	Console.displayLine("Q" + row + ": " + salesFormatted);
        }
                
        /* 
         * The fourth section of the report should use an enhanced for loop 
         * to calculate the total annual sales for all regions. This is done 
         * by the Sales.salesResults()method called at line 37 of this file.
         */
    	String totalFormatted = currency.format(total);
        Console.displayLine();
        Console.displayLine("Total annual sales, all regions: " + totalFormatted);
        Console.displayLine();
	}
}
