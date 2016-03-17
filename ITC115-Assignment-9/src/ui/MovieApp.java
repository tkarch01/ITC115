/*
* ITC 115 W16 - 3182
* Assignment 9
* 
*Thomas Karchesy
* March 14, 2016
*/
package ui;

import business.Movie;
import db.MovieDB;

/* Movie App will display a list of movies selected by a category inputed by the user */
public class MovieApp {

	public static void main(String[] args) {
		
		Console.displayLine("Welcome to the Movie Lister");
		Console.displayLine();
		Console.displayLine("There are " + MovieDB.getAllMovies().size() + " movies in the list.");
		
		/* always do at least once then use while loop to query user whether to continue */
		do {
			Console.displayLine();
			/* Moving right to left 
			 * The user enters a category through Console.getString()
			 * The category is used by MovieDB.getMoviesOfCategory() to provide an array list 
			 * and that array list is iterated by the for loop and given to 
			 * Console.display() to display
			 */
			for (Movie movies : MovieDB.getMoviesOfCategory(   
				  Console.getString("What category are you interested in? ")  
															)
				 ){
				
				Console.displayLine(movies.getTitle());
			}
			
			Console.displayLine();
		}while ( Console.getChoice("Continue? (y/n): ", "y", "n").equalsIgnoreCase("y"));
	}
}
