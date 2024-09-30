**Name:** Dami Kim

**Project:** Cemetery Search

**Project description:** Coded by Java, this program allows the user to find the people buried on a specific date, within a range of dates, and at a specific location within two dates. 
The user can also tell the program to output the total number of burials at the cemetery and the full list of people buried. 

To run the program, run Main.java.

## 1.
Once the program prompts for a date, make sure to write it in a mm/dd/yyyy format.

**Sample input)**
03/17/1844

**Sample output)**
John William ALLARDYCE , 3/17/1844, 2 years 9 months 0 days old, Little Knight Ryder Street 


## 2.
Then, the program will prompt for a date range and a location. Make sure that the dates are still in the mm/dd/yyyy format and the dates and location are separated by commas. 
The location should be strictly formatted the way it is on the text file (Upper cases and lower cases). The program will output the people buried within that date range, the number of people,
and their average age. 

**Sample input)**
03/15/1843, 08/01/1845, Little Knight Ryder Street


**Sample output)**
Thomas Ebenezer OGILVY , 3/19/1843, 2 years 5 months 0 days old, Little Knight Ryder Street 

John William ALLARDYCE , 3/17/1844, 2 years 9 months 0 days old, Little Knight Ryder Street 

Frederic Alex. ALLARDYCE , 4/21/1844, 1 years 4 months 25 days old, Little Knight Ryder Street 

Number of people: 3
Average age: 2 years 2 months 6 days old


## 3.
Next, the program will prompt for only a date range. Make sure the dates are formatted in mm/dd/yyyy. The program will output the people buried withint that date range, the number of people,
and their average age.

**Sample input)**
12/12/1825, 02/13/1826

**Sample output)**
Charles Neal CUMMINGS , 12/12/1825, 18 years 0 months 0 days old, Great Carter Lane 

James GARDNER , 1/5/1826, 1 years 3 months 25 days old, Taylor's Court, Lambeth Hill 

John HART , 1/22/1826, 51 years 0 months 0 days old, Old Change 

William HURN , 2/6/1826, 0 years 2 months 0 days old, Lambeth Hill 

Number of people: 4
Average age: 17 years 7 months 16 days old

## 4.
Then, the program will ask whether to print the total number of burials or not. If inputted "yes", it will print the total number of burials and if "no", it will move on to the next question.

**Sample input)**
yes

**Sample output)**
A total of 610 people are in fish street cemetery.

## 5.
Lastly, the program will ask whether to display all burials. If inputted "yes", it will print everyone buried and their information in ascending order and if "no", 
it will not print anything.

**Sample input)**
yes

**Sample output)**
Robert Joseph DYSON , 1/5/1813, 1 years 6 months 0 days old, Old Change 

James HINES , 1/17/1813, 40 years 0 months 0 days old, Lambeth Hill 

William STEDMAN , 2/17/1813, 0 years 7 months 0 days old, Crane Court 

Mary LANGDON , 3/15/1813, 36 years 0 months 0 days old, Blackheath Hill Kent 

Richard Ann SMITH , 4/1/1813, 0 years 3 months 0 days old, Lambeth Hill 

Isabella CLARK , 4/8/1813, 0 years 0 months 7 days old, Little Knight Ryder Street 

Samuel WILLWARD , 4/25/1813, 63 years 0 months 0 days old, Lambeth Hill 

Catherine LINCH , 5/27/1813, 0 years 2 months 0 days old, Green Arbour Court, Lambeth Hill 

Esther GALLERY , 6/1/1813, 62 years 0 months 0 days old, Taylor's Court, Lambeth Hill 

Mary BURGOYNE , 6/20/1813, 33 years 0 months 0 days old, Lambeth Hill 

George EDWARDS , 7/11/1813, 49 years 0 months 0 days old, Taylors Court Lambeth Hill 

Richard Jebb MADELEY , 7/18/1813, 1 years 4 months 0 days old, Green Arbour Court, Lambeth Hill 

Robert THOMSON , 8/4/1813, 25 years 0 months 0 days old, Fleet Market 

George SAYER , 8/21/1813, 3 years 3 months 0 days old, Old Change 

Thomas DYSON , 9/18/1813, 0 years 10 months 0 days old, Old Change 

Henry HARTRUP , 10/24/1813, 1 years 7 months 0 days old, Green Arbour Court, Lambeth Hill 

Henry BEAUMONT , 11/21/1813, 1 years 9 months 0 days old, Old Change 

. . .
