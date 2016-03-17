package ui;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Console {

    private static Scanner sc = new Scanner(System.in);
    
    public static void displayLine() {
        System.out.println();
    }

    public static void displayLine(String s) {
        System.out.println(s);
    }
    
    public static void displayItem(String s) {
        System.out.print(s);
    }

    public static String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.nextLine();
        return s;
    }


    private static String getRequiredString(String prompt) {
        String s = "";
        while (true) {
            System.out.print(prompt);
            s = sc.nextLine();
            if (s.equals("")) {
                System.out.println("Error! This entry is required. Try again.");
            } else {
                break;
            }
        }
        return s;
    }

    public static String getChoice(String prompt, String s1, String s2) {
        String s = "";
        while (true) {
            s = getRequiredString(prompt);
            if (!s.equalsIgnoreCase(s1) && 
                !s.equalsIgnoreCase(s2)) {
                System.out.println("Error! Entry must be '"
                        + s1 + "' or '" + s2 + "'. Try again.");
            } else {
                break;
            }
        }
        return s;
    }
    
    public static String getChoice3(String prompt, String s1, String s2, String s3) {
        String s = "";
        while (true) {
            s = getRequiredString(prompt);
            if (!s.equalsIgnoreCase(s1) && 
            	!s.equalsIgnoreCase(s2) && 
                !s.equalsIgnoreCase(s3)) {
                System.out.println("Error! Entry must be '"
                		+ s1  + ", "  + s2 + ", or " + s2 + "'. Try again.");
            } else {
                break;
            }
        }
        return s;
    }
    

    public static int getInt(String prompt) {
        int i = 0;
        while (true) {
            System.out.print(prompt);
            try {
                i = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error! Invalid integer. Try again.");
            }
        }
        return i;
    }

    public static int getInt(String prompt, int min, int max) {
        int i = 0;
        while (true) {
            i = getInt(prompt);
            if (i <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min);
            } else if (i >= max) {
                System.out.println(
                        "Error! Number must be less than " + max);
            } else {
                break;
            }
        }
        return i;
    }

    public static double getDouble(String prompt) {
        double d = 0;
        while (true) {
            System.out.print(prompt);
            try {
                d = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error! Invalid decimal. Try again.");
            }
        }
        return d;
    }


public static double getDouble(String prompt, double min, double max) {
	/* For this assignment I use the Number Format to customize 
	 * this method to use two decimal places.
	 */
	NumberFormat format2places = new DecimalFormat("#0.00");   
    double d = 0;
    while (true) {
        d = getDouble(prompt);
        if (d < min) {
            System.out.println(
                    "Error! Number must be no less than " + format2places.format(min));
        } else if (d > max) {
            System.out.println(
                    "Error! Number must be no more than " + format2places.format(max));
        } else {
            break;
        }
    }
    return d;
	}
}