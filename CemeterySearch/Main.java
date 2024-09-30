package kim.dami.fishStreet;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
* @author Dami Kim
* @date 02/23/2022
* 
* This program takes user input to output information about people buried at Fish Street cemetery.
*/

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		Cemetery cemetery = cemetery();
		
		//take user input
		Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter a date (mm/dd/yyyy): ");
	    String input1 = sc.nextLine(); 
	    Cemetery.inputDate(processInputDate(input1));
	    
	    System.out.println("\n" + "Enter a date range and location (date1, date2, street address): ");
	    String input2 = sc.nextLine();
	    String[] splitinput = input2.split(", ");
	    Date date1 = processInputDate(splitinput[0]);
	    Date date2 = processInputDate(splitinput[1]);
	    String address = splitinput[2];
	    Cemetery.inputDateRangeLocation(date1, date2, address);
	    
	    System.out.println("\n" + "Enter a date range (date1, date2): ");
	    String input3 = sc.nextLine();
	    String[] splitinput2 = input3.split(", ");
	    Date Date1 = processInputDate(splitinput2[0]);
	    Date Date2 = processInputDate(splitinput2[1]);
	    Cemetery.inputDateRange(Date1, Date2);
	    
		System.out.println("\n" + "Would you like to display the total number of burials? (yes/no):");
		String input4 = sc.nextLine();
		if (input4.equals("yes")) {
	    System.out.println("A total of " + Cemetery.totalNumBurials() + " people are in fish street cemetery.");
		}
		
		System.out.println("\n" + "Would you like to display all burials? (yes/no): ");
		String input5 = sc.nextLine();
		if (input5.equals("yes")) {
		Cemetery.allBurials(input5);
		}
		
		sc.close();
	}

	private static Cemetery cemetery() throws FileNotFoundException {
		Scanner input = new Scanner(new File("cemetery.txt"));
		ArrayList<String> textInput = new ArrayList<String>();
		while(input.hasNext()) {
			textInput.add(input.nextLine());
		}
		Cemetery cemetery = new Cemetery(textInput);
		return cemetery;
	}
	
	public static Date processInputDate(String input) {
		String[] datesplit = input.split("/");
		int month = Integer.parseInt(datesplit[0]);
		int day = Integer.parseInt(datesplit[1]);
		int year = Integer.parseInt(datesplit[2]);
		Date d = new Date(month, day, year);
		return d;
	}

}


	

