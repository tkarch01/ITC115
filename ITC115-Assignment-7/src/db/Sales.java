package db;

import java.text.NumberFormat;
import ui.Console;

/* The Sales class sets and calculates the data for this project.
 * The primary data is a rectangular array, sales[4][4]. Two other arrays
 * are created to hold the sums of quarters by region, quarters [4],
 * and region sums by quarter, regions [4].
 * The method salesResults() displays tabular sales, calculates the sums 
 * for regions[] and quarters[], and returns the total sum of all sales as a double.
 */
public class Sales {
	static NumberFormat currency =NumberFormat.getCurrencyInstance();
	
	/* The quarterly sales for each region should be hard-coded 
	 * into the program using the numbers shown in the console 
	 * output example. The sales numbers should be stored in a 
	 * rectangular array.
	 * The array sales is a rectangular array that represents 
	 * quarterly sales by four regions. The rows will be the 
	 * regions and the columns will be the quarters. The values
	 * will be sales in dollars.
	 */
	public static double[][] sales = { {1540.00, 2010.00, 2450.00, 1845.00}, {1130.00, 1168.00, 1847.00, 1491.00}, {1580.00, 2305.00, 2710.00, 1284.00}, {1105.00, 4102.00, 2391.00, 1576.00} }; //new double[4][4]
	
	/* regions contains annual sales by region: region 1 is index =0 */
	public static  double[] regions = { 0.00, 0.00, 0.00, 0.00 };
	
	/* quarters contains combined region sales by quarter: quarter 1 is index =0 */
	public static  double[] quarters = { 0.00, 0.00, 0.00, 0.00 };
	
	/* use nested for loops to calculate the sales by quarter by adding up 
	 * the individual region sales for each quarter. All the work will be done
	 * in the following method.
	 */
	public static double salesResults(){
		double total = 0.00;
		int row = 0;
		for (double[] region : sales){
			int col = 0;
			Console.displayItem(""+(row +1));
			for(double quarter : region){
				/* print out the sales by quarter by region */
				String quarterFormatted = currency.format(quarter);
				Console.displayItem("\t" + quarterFormatted);
				/* sum the quarter totals for each region */
				regions[row] += quarter;
				/* sum the quarter totals for each region */
				quarters[col] += quarter;
				/* add up the total */
				total += quarter;
				col++;		
			}
			Console.displayLine();
			row++;
		}
		return total;
	}

	/* use nested for loops to calculate the sales by region by adding up the 
	 * quarterly sales each region.
     */
	public double salesByRegion(int rgn){
		double result = 0.00;
		
		
		return result;
	}

}
