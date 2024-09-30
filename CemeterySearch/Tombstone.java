package kim.dami.fishStreet;

public class Tombstone implements Comparable<Tombstone>{

	private String fullName;
	private Date burialDate;
	private int ageInDays; 
	private String address;
	
	//checks if a string is a number
	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}
	
	//converts string month to integer
	public static int monthConv(String str) {
		String[] months = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		int month = 0;
		for (int i = 0; i < 12; i++) {
			if (str.equals(months[i])) {
				month = i+1;
			}
		}
		return month;
	}
	
	//extracts tombstone info
	public Tombstone(String[] array) {
		
		for (int i = 0; i < array.length; i++) {
			if (isNumeric(array[i])) {
				
				//date
				int Day = Integer.parseInt(array[i]);
				int Month = monthConv(array[i+1]);
				int Year = Integer.parseInt(array[i+2]);
				burialDate = new Date(Month, Day, Year);
				
				//age
				String Age = array[i+3];
				int age = 0;
				if (Age.contains("d")) {
					String newAge = Age.replace("d", "");
					age = Integer.parseInt(newAge);
				}
				
				else if (Age.contains("w")) {
					String newAge = Age.replace("w", "");
					age = 7 * Integer.parseInt(newAge);
				}
				
				else if (Age.contains(".")) {
					String convYear = "0";
					String convMonth = "0";
					for (int l = 0; l < Age.indexOf("."); l++) {
						convYear += Age.charAt(l);
					}
					age = 365 * Integer.parseInt(convYear);
					for (int l = Age.indexOf(".")+1; l < Age.length(); l++) {
						convMonth += Age.charAt(l);
					}
					age += 30 * Integer.parseInt(convMonth);
				}
				
				else if (isNumeric(Age)) {
					age = 365 * Integer.parseInt(Age);
				}
				ageInDays = age;
				
				//street address
				String location = array[i+4] + " ";
				for (int k = i+5; k < array.length; k++) {
					location += array[k] + " ";
				}
				address = location;
				
				//full name
				String name = array[0] + " ";
				for (int j = 1; j < i; j++) {
					name += array[j] + " ";
				}
				fullName = name;
				break;
			}
		}

	}
	
	public String getName() {
		return this.fullName;
	}
	
	public Date getDate() {
		return this.burialDate;
	}
	
	public int getAge() {
		return this.ageInDays;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	//converts ageInDays into years, months, and days
	public String getYearsMonthsDays() {
		int ageInDays = getAge();
		int years = ageInDays / 365;
		int months = (ageInDays % 365) / 30;
		int days = (ageInDays % 365) - months * 30;
		String yearsMonthsDays = years + " years " + months + " months " + days + " days old";
		return yearsMonthsDays;
	}
	
	//compare tombs
	public int compareTo(Tombstone otherTomb) {
		if (otherTomb.fullName.compareTo(this.fullName) != 0 ) {
            return otherTomb.fullName.compareTo(this.fullName);
        } 
		else if (otherTomb.burialDate.compareTo(this.burialDate) != 0) {
            return otherTomb.burialDate.compareTo(this.burialDate);
        } 
		else if (otherTomb.ageInDays > this.ageInDays) {
            return -1;
        } 
		else if (otherTomb.ageInDays < this.ageInDays) {
            return 1;
        } 
		else if (otherTomb.address.compareTo(this.address) != 0){
            return otherTomb.address.compareTo(this.address);
        } 
		else {
        	return 0;
        }
	}
	
	//print tombstone info
	public void printTomb() {
		System.out.println(this.fullName + ", " + this.burialDate.toString() + ", " + this.getYearsMonthsDays() + ", " + this.address);
	}
	
	//checks if tombs are equal
	public boolean equals(Object obj) {
        return obj != null && obj instanceof Tombstone && this.compareTo((Tombstone) obj) == 0;
    }

}


