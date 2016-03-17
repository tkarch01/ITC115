package ui;

import io.RectangleIO;

import java.util.Scanner;

import rectangle.Rectangle;

public class Main {

    public static void main(String args[]) {
        System.out.println("Welcome to the Area and Perimeter Calculator");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        RectangleIO.saveHeader();
        while (choice.equalsIgnoreCase("y")) {
            // get input from user
            System.out.print("Enter length: ");
            double length = Double.parseDouble(sc.nextLine());

            System.out.print("Enter width:  ");
            double width = Double.parseDouble(sc.nextLine());

            Rectangle r = new Rectangle(length, width);
            
            // format and display output
            String message = 
                "Area:         " + r.getAreaNumberFormat() + "\n" +
                "Perimeter:    " + r.getPerimeterNumberFormat() + "\n";
            System.out.println(message);
            //save rectangle r to file
            RectangleIO.save(r);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        //Call printFile
        RectangleIO.printFile();
        System.out.println("Bye!");
        sc.close();
    }
}
