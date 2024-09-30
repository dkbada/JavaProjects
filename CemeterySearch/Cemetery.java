package kim.dami.fishStreet;
import java.util.*;
import kim.dami.fishStreet.Date;

public class Cemetery {
	public static TreeMap<Date, TreeSet<Tombstone>> cemetery = new TreeMap<Date, TreeSet<Tombstone>>();
	private static int count = 0;
	
	public Cemetery(ArrayList<String> input) { 
		while(input.size() > 0) {
			String line = input.get(0);
			input.remove(0);
			String[] array = line.split("\\s+");
		
			Tombstone tombstone = new Tombstone(array);
		
			if (!cemetery.containsKey(tombstone.getDate())) {
				cemetery.put(tombstone.getDate(), new TreeSet<Tombstone> ());
			} 
		
			TreeSet<Tombstone> tombstoneSet = cemetery.get(tombstone.getDate());
			if (!tombstoneSet.contains(tombstone)) {
				tombstoneSet.add(tombstone);
			count++;			
			}
		}
	}	
	
	//just date
	public static void inputDate(Date date) {
		if (cemetery.containsKey(date)) {
			for (Tombstone tombstone : cemetery.get(date)) {
            	tombstone.printTomb();
            }
		}
		else {
			System.out.println("No one was burried on this date.");
		}
		
	}
	
	//date range
	public static void inputDateRange(Date date1, Date date2) {
		inputDateRangeLocation(date1, date2, null);
	}
		
	//date range & location
	public static void inputDateRangeLocation(Date date1, Date date2, String location) {
		int numPpl = 0;
		int totalAge = 0;
		SortedMap<Date, TreeSet<Tombstone>> withinRange = cemetery.subMap(date1, date2);
		
		
		if (withinRange == null) {
			System.out.println("No one was burried within these dates.");
		}
		else {
			for (Date date : withinRange.keySet()) {
				for (Tombstone tombstone : withinRange.get(date)) {
					if (location == null || tombstone.getAddress().contains(location)) {
						numPpl += 1;
						totalAge += tombstone.getAge();
						tombstone.printTomb();
					}
				}
			}
			
			System.out.println("\n" + "Number of people: " + numPpl);
			int avgAge = totalAge/numPpl;
				int years = avgAge / 365;
				int months = (avgAge % 365) / 30;
				int days = (avgAge % 365) - months * 30;
				System.out.println ("Average age: " + years + " years " + months + " months " + days + " days old");
			}
			
		}
		
	
	public static int totalNumBurials() {
		return count;
	}
	
	public static void allBurials(String input) {
		for (TreeSet<Tombstone> tombstoneSet : cemetery.values()){
			for (Tombstone tombstone : tombstoneSet){
				tombstone.printTomb();         
			}
		}
	}
}
