package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import rectangle.Rectangle;

public class RectangleIO {

	public static final String fileName = "rectangles.txt";
	
	public static void save(Rectangle r){
		try (PrintWriter out = new PrintWriter(
								new BufferedWriter(
								new FileWriter (fileName, true)))){
				out.println(r.getLength() + "|" +
							r.getWidth() + "|" +
							r.getArea() + "|" +
							r.getPerimeter() );
			}
		 catch (IOException e) {
			 System.out.println(e);
		}
		
	}
	
	public static void printFile(){
		try(BufferedReader in = new BufferedReader(
			new FileReader(fileName))){
				String line = in.readLine();
				while(line != null){
					System.out.println(line);
					line = in.readLine();
				}
		}
		catch (IOException e){
			System.out.println(e);
		}
	}
	
	
		public static void saveHeader(){
		try (PrintWriter out = new PrintWriter(
								new BufferedWriter(
								new FileWriter (fileName, false)))){
				out.println("RECTANGLES (length|width|area|perimeter): ");
			}
		 catch (IOException e) {
			 System.out.println(e);
		}
		
	}
	

}
