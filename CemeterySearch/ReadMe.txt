**Name:** Dami Kim
**Project:** Fish Street Cemetery
**Project description:** Coded by Java, this program allows the user to find the people buried on a specific date, within a range of dates, and at a specific location within two dates. 
The user can also tell the program to output the total number of burials at the cemetery and the full list of people buried. 

To run the program, run Main.java.

#1.
Once the program prompts for a date, make sure to write it in a mm/dd/yyyy format.

Sample input) 
03/17/1844

Sample output)
John William ALLARDYCE , 3/17/1844, 2 years 9 months 0 days old, Little Knight Ryder Street 


#2.
Then, the program will prompt for a date range and a location. Make sure that the dates are still in the mm/dd/yyyy format and the dates and location are separated by commas. 
The location should be strictly formatted the way it is on the text file (Upper cases and lower cases). The program will output the people buried within that date range, the number of people,
and their average age. 

Sample input)
03/15/1843, 08/01/1845, Little Knight Ryder Street


Sample output)
Thomas Ebenezer OGILVY , 3/19/1843, 2 years 5 months 0 days old, Little Knight Ryder Street 
John William ALLARDYCE , 3/17/1844, 2 years 9 months 0 days old, Little Knight Ryder Street 
Frederic Alex. ALLARDYCE , 4/21/1844, 1 years 4 months 25 days old, Little Knight Ryder Street 

Number of people: 3
Average age: 2 years 2 months 6 days old


#3.
Next, the program will prompt for only a date range. Make sure the dates are formatted in mm/dd/yyyy. The program will output the people buried withint that date range, the number of people,
and their average age.

Sample input)
12/12/1825, 02/13/1826

Sample output)
Charles Neal CUMMINGS , 12/12/1825, 18 years 0 months 0 days old, Great Carter Lane 
James GARDNER , 1/5/1826, 1 years 3 months 25 days old, Taylor's Court, Lambeth Hill 
John HART , 1/22/1826, 51 years 0 months 0 days old, Old Change 
William HURN , 2/6/1826, 0 years 2 months 0 days old, Lambeth Hill 

Number of people: 4
Average age: 17 years 7 months 16 days old

#4.
Then, the program will ask whether to print the total number of burials or not. If inputted "yes", it will print the total number of burials and if "no", it will move on to the next question.

Sample input)
yes

Sample output)
A total of 610 people are in fish street cemetery.

#5.
Lastly, the program will ask whether to display all burials. If inputted "yes", it will print everyone buried and their information in ascending order and if "no", 
it will not print anything.

Sample input)
yes

Sample output)
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
Mary Ann SMITH , 11/26/1813, 2 years 0 months 0 days old, Workhouse 
John Francis WATTS , 12/8/1813, 3 years 0 months 0 days old, Old Change 
Martha GILES , 12/12/1813, 25 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Mary Ann BEAUMONT , 12/15/1813, 27 years 0 months 0 days old, Old Change 
Job MORTON , 12/17/1813, 45 years 0 months 0 days old, St Bartholomews Hospital 
Ann Elizabeth BENYON , 1/4/1814, 26 years 0 months 0 days old, Crane Court Lambeth Hill 
Elizabeth HULCUP , 1/9/1814, 2 years 6 months 0 days old, Old Change 
Mary TAYLOR , 1/23/1814, 22 years 0 months 0 days old, Knight Rider Court 
Robert HENRY , 1/30/1814, 66 years 0 months 0 days old, Lambeth Hill 
John GROVER , 2/1/1814, 5 years 0 months 0 days old, Taylor's Court, Lambeth Hill 
Jane SEATORN , 2/8/1814, 1 years 11 months 0 days old, Lambeth Hill 
Charles GREENWOOD , 2/18/1814, 33 years 0 months 0 days old, Old Fish Street 
Ann WHITEHOUSE , 2/18/1814, 42 years 0 months 0 days old, Lambeth Hill 
Henry SEATORN , 2/22/1814, 4 years 9 months 0 days old, Lambeth Hill 
Priscilla Mary Ann CAVE , 3/8/1814, 1 years 2 months 0 days old, Lambeth Hill 
John LINCK , 5/22/1814, 0 years 7 months 0 days old, Taylor's Court, Lambeth Hill 
John LESTER , 5/22/1814, 61 years 0 months 0 days old, St Mary, Lambeth 
Henry MORE , 6/6/1814, 1 years 1 months 25 days old, Lambeth Hill 
George POCOCK , 6/9/1814, 35 years 0 months 0 days old, St Bartholomew's Hospital 
Margaret RYDER , 7/3/1814, 64 years 0 months 0 days old, Knight Rider Court 
Mary Ann JACKSON , 7/31/1814, 1 years 3 months 0 days old, Knowles Court 
Thomas SNOWDEN , 8/5/1814, 43 years 0 months 0 days old, Knowles Court 
Mary Ann MARSHALL , 8/25/1814, 5 years 0 months 0 days old, St Mildreds Crt Bread Street 
Thomas Robert PERKINS , 9/4/1814, 6 years 7 months 0 days old, Green Arbour Court, Lambeth Hill 
Mary PERKINS , 9/21/1814, 1 years 3 months 0 days old, Green Arbour Court, Lambeth Hill 
William EVANS , 11/13/1814, 1 years 2 months 0 days old, Green Arbour Court, Lambeth Hill 
John BURGOYNE , 11/20/1814, 3 years 9 months 0 days old, Friars Streets Blackfriars 
Amelia DYSON , 12/6/1814, 0 years 6 months 0 days old, Old Change 
John GREEN , 12/9/1814, 4 years 6 months 0 days old, Little Carter Lane 
William HENLEY , 12/11/1814, 43 years 0 months 0 days old, Bottle Hay Yard 
Elizabeth GREEN , 12/28/1814, 2 years 9 months 0 days old, Carter Lane 
James MURRAY , 1/15/1815, 27 years 0 months 0 days old, Taylor's Court, Lambeth Hill 
James DAY , 1/22/1815, 1 years 0 months 25 days old, Sermon Lane 
Sophia SMITH , 2/5/1815, 18 years 0 months 0 days old, Little Knight Ryder Street 
Ann BOX , 2/8/1815, 1 years 2 months 25 days old, Crane Court Lambeth Hill 
Martha WARD , 3/12/1815, 36 years 0 months 0 days old, St Peter's Hill 
Eliza GLEESON , 3/12/1815, 1 years 5 months 25 days old, Knight Rider Court 
Samuel HARTRUP , 3/19/1815, 0 years 2 months 0 days old, Green Arbour Court, Lambeth Hill 
Jane EXTON , 3/26/1815, 54 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Thomas MORRIS , 4/7/1815, 71 years 0 months 0 days old, Carter Lane, Old Change 
Mary Ann READ , 4/30/1815, 0 years 9 months 0 days old, Little Knight Ryder Street 
Johanna GOODWIN , 5/12/1815, 86 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Elizabeth JONES , 7/12/1815, 1 years 8 months 25 days old, Lambeth Hill 
Maria Ann TUCKER , 8/30/1815, 0 years 8 months 0 days old, Green Arbour Court, Lambeth Hill 
Mary SARTINE , 9/1/1815, 64 years 0 months 0 days old, Taylor's Court, Lambeth Hill 
John TINDALL , 10/19/1815, 0 years 7 months 0 days old, Green Arbour Court, Lambeth Hill 
Joseph KELLY , 12/31/1815, 27 years 0 months 0 days old, Little Knight Ryder Street 
Oliver AUSTIN , 2/19/1816, 0 years 5 months 0 days old, Mile End 
John Sadler MAIL , 3/7/1816, 3 years 0 months 0 days old, Sermon Lane 
Thomas BURGUIN , 3/17/1816, 62 years 0 months 0 days old, Knight Rider Court 
Mary SPRINGH , 3/24/1816, 0 years 0 months 4 days old, St Peter's Hill 
George FOON , 5/28/1816, 1 years 6 months 25 days old, Green Arbour Court, Lambeth Hill 
William Andrew PINK , 6/2/1816, 1 years 9 months 0 days old, Lambeth Hill 
John FOON , 6/9/1816, 4 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Martha RUSS , 6/20/1816, 66 years 0 months 0 days old, Green Arbour Court 
Hannah PAYNE , 7/2/1816, 40 years 0 months 0 days old, New Street, Shoe Lane 
Sarah BRINDLE , 8/11/1816, 74 years 0 months 0 days old, Taylor's Court 
Elizabeth PERKINS , 10/25/1816, 1 years 3 months 25 days old, Green Arbour Court, Lambeth Hill 
Sarah DUNN , 10/27/1816, 55 years 0 months 0 days old, Christ Church SRY 
Jane WILSON , 11/1/1816, 46 years 0 months 0 days old, Little Knight Ryder Street 
Charles WISE , 12/22/1816, 49 years 0 months 0 days old, Lambeth Hill 
Frances BOTLEY , 12/24/1816, 8 years 0 months 0 days old, Lambeth Hill 
Jane REDHALL , 12/28/1816, 59 years 0 months 0 days old, Sermon Lane 
Robert WILLSON , 1/4/1817, 19 years 0 months 0 days old, Crane Court Lambeth Hill 
Jane DERBYSHIRE , 1/19/1817, 2 years 0 months 0 days old, Old Change 
Sarah BERRY , 1/26/1817, 1 years 8 months 25 days old, Little Knight, Ryder Street 
George JOHNSON , 2/5/1817, 64 years 0 months 0 days old, Taylor's Court, Lambeth Hill 
Martin LINCK , 3/5/1817, 0 years 7 months 0 days old, Taylor's Court, Lambeth Hill 
John Speechley COOK , 3/9/1817, 2 years 0 months 0 days old, Great Carter Lane 
Caroline Lydia WALKER , 3/17/1817, 0 years 1 months 0 days old, Little Knight Ryder Street 
John THEOBALD , 3/23/1817, 45 years 0 months 0 days old, Lambeth Hill 
Elizabeth STEVENS , 3/23/1817, 66 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Jane Elizabeth ORAM , 4/6/1817, 1 years 9 months 25 days old, Lambeth Hill 
Ann BUCKMASTER , 4/6/1817, 3 years 10 months 0 days old, Lambeth Hill 
John GODFREY , 4/24/1817, 2 years 0 months 0 days old, Crane Court Lambeth Hill 
Susannah ORAM , 4/27/1817, 60 years 0 months 0 days old, Crane Court Lambeth Hill 
Samuel John WINDSOR , 4/30/1817, 0 years 2 months 0 days old, Lambeth Hill 
Susannah PETTIT , 5/14/1817, 69 years 0 months 0 days old, Blackheath Kent 
Sarah BUNKER , 7/1/1817, 47 years 0 months 0 days old, Little Knight Ryder Street 
Ann MOORES , 7/2/1817, 43 years 0 months 0 days old, Fleet Market 
Richard SMITH , 8/4/1817, 35 years 0 months 0 days old, Crane Court Lambeth Hill 
John WILD , 8/17/1817, 64 years 0 months 0 days old, St George's Court, St Bennets Hil 
John BOWLES , 8/17/1817, 22 years 0 months 0 days old, Green Arbour Court 
John Butler WHITTAKER , 8/20/1817, 0 years 3 months 15 days old, Lambeth Hill 
Eleanor HAWKINS , 9/14/1817, 1 years 0 months 25 days old, Canterbury Court, St Andrews Hil 
Henry PRESCOTT , 9/17/1817, 0 years 11 months 0 days old, Lambeth Hill 
Mary WALKER , 11/27/1817, 30 years 0 months 0 days old, Little Knight Ryder Street 
Sarah Jane HAWKINS , 11/30/1817, 3 years 0 months 0 days old, Canterbury Court, St Andrews Hill 
William RICHARDS , 1/9/1818, 43 years 0 months 0 days old, John Street, St George MDX 
Elizabeth MILLINGTON , 1/23/1818, 1 years 0 months 25 days old, Lambeth Hill 
William SHURRY , 1/25/1818, 0 years 1 months 0 days old, Little Carter Lane 
Ann WILLOUGHBY , 2/4/1818, 67 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Agnes TINDALL , 3/15/1818, 1 years 6 months 25 days old, Kings Head Crt Little Carter Lane 
William NOTTLEY , 4/30/1818, 0 years 11 months 0 days old, Printing Ho Yard Water Lane 
Elizabeth Webb NORTWYCK , 5/6/1818, 37 years 0 months 0 days old, Little Knight Ryder Street 
Charles CROOT , 6/9/1818, 2 years 0 months 0 days old, Windsor Crt Little Knight Rider Court 
Philadelphia NEWBLE , 6/12/1818, 25 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Elizabeth GODFREY , 7/9/1818, 2 years 0 months 0 days old, Taylor's Court, Lambeth Hill 
Janes HOLLOWAY , 7/15/1818, 0 years 10 months 0 days old, Lambeth Hill 
Mary Ann WALLINGER , 8/2/1818, 1 years 6 months 0 days old, Taylor's Court, Lambeth Hill 
William EADES , 8/19/1818, 5 years 0 months 0 days old, Taylors Court Lambeth Hill 
Elizabeth CLARK , 8/23/1818, 64 years 0 months 0 days old, Lambeth Hill 
Richard RUSS , 9/13/1818, 68 years 0 months 0 days old, Little Fish Street Hill 
Jacob WRAGG , 9/23/1818, 62 years 0 months 0 days old, Little Knight Ryder Street 
Elizabeth MANNING , 10/7/1818, 0 years 10 months 0 days old, Little Carter Lane 
Joseph WARHAM , 11/22/1818, 1 years 5 months 25 days old, Green Arbour Court, Lambeth Hill 
Thomas HAWKINS , 12/13/1818, 55 years 0 months 0 days old, Sermon Lane 
Frederick KOPP , 12/20/1818, 45 years 0 months 0 days old, Kings Head Crt, Little Carter Lane 
Joseph HARTRUP , 12/23/1818, 2 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Elizabeth ORTSON , 1/3/1819, 46 years 0 months 0 days old, Crane Court Lambeth Hill 
Ann MORRIS , 1/10/1819, 76 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Margaret CROFT , 1/20/1819, 0 years 2 months 0 days old, Little Knight Ryder Street 
Elizabeth NOTLEY , 1/28/1819, 5 years 0 months 0 days old, Upper Thames Street 
William James AYLIFF , 1/31/1819, 0 years 2 months 0 days old, Crane Court Lambeth Hill 
Mary RICHARDS , 2/7/1819, 3 years 0 months 0 days old, Stepney MDX 
Joseph VERE , 2/11/1819, 65 years 0 months 0 days old, Cloth Fair, Smithfield 
Benjamin Day YATES , 2/16/1819, 1 years 8 months 0 days old, Sermon Lane 
Sarah ORAM , 2/21/1819, 37 years 0 months 0 days old, Lambeth Hill 
Hannah AUSTIN , 2/23/1819, 41 years 0 months 0 days old, Box MDX 
Elizabeth Ann PETTIT , 3/23/1819, 38 years 0 months 0 days old, Little Knight Ryder Street 
Hannah DYSON , 3/24/1819, 60 years 0 months 0 days old, High Street. Marylebone MDX 
Richard DAY , 4/29/1819, 36 years 0 months 0 days old, Sermon Lane 
Thomas RICHARDS , 5/6/1819, 44 years 0 months 0 days old, Taylor's Court, Lambeth Hill 
James ENTWISLE , 5/22/1819, 40 years 0 months 0 days old, Little Knight Ryder Street 
John JONES , 5/27/1819, 60 years 0 months 0 days old, Windsor Crt, Little Knight Rider 
John EVANS , 8/26/1819, 11 years 0 months 0 days old, Lambeth Hill 
Harriot CROFT , 10/8/1819, 31 years 0 months 0 days old, Portpool Street St Andrews Holbon 
Simmons JACKSON , 10/24/1819, 4 years 0 months 0 days old, Friday Street 
Mary RICHARDS , 10/26/1819, 82 years 0 months 0 days old, Lambeth SRY 
Mary HOTINE , 10/27/1819, 49 years 0 months 0 days old, Lambeth Hill 
Margaret WRAGG , 10/30/1819, 73 years 0 months 0 days old, Stangate Lambeth 
John DAY , 11/17/1819, 1 years 0 months 0 days old, Sermon Lane 
Sarah JACKSON , 12/5/1819, 68 years 0 months 0 days old, Labour in Vain Crt, Little Fish 
John Gardner BATTEN , 12/8/1819, 1 years 5 months 25 days old, Westham ESS 
Elizabeth FARROW , 12/20/1819, 65 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Harriet RODGERS , 1/6/1820, 61 years 0 months 0 days old, Pratt Street, Lambeth 
Mary WISE , 1/25/1820, 44 years 0 months 0 days old, Lambeth Hill 
William LANGLEY , 2/27/1820, 42 years 0 months 0 days old, Old Change 
James Fredrk. WHITTAKER , 3/5/1820, 1 years 3 months 25 days old, Little Fish Street Hill 
Ann THOMSON , 3/26/1820, 63 years 0 months 0 days old, Red Lion Street, Holborn 
Philemon BETTS , 4/11/1820, 35 years 0 months 0 days old, Upper Thames Street 
Caroline MARECHAL , 4/23/1820, 22 years 0 months 0 days old, Little Knight Ryder Street 
George WARD , 7/30/1820, 0 years 0 months 21 days old, Lambeth Hill 
Hiram PRICE , 8/1/1820, 60 years 0 months 0 days old, Lambeth Hill 
Wilhelmina Lydia LOVE , 8/22/1820, 0 years 10 months 0 days old, Lambeth Hill 
George THORNTON , 9/3/1820, 60 years 0 months 0 days old, Lambeth Hill 
Maria STEVENS , 11/16/1820, 1 years 9 months 0 days old, Bell Court, Doctor's Commons 
Ann MURRAY , 3/13/1821, 62 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Sarah GREEN , 3/25/1821, 53 years 0 months 0 days old, Little Carter Lane 
Nicholas SANDELL , 4/8/1821, 50 years 0 months 0 days old, Old Change 
Edward MOULL , 4/25/1821, 0 years 1 months 12 days old, Green Arbour Court, Lambeth Hill 
John SPEECHLEY , 5/3/1821, 68 years 0 months 0 days old, Sidney Street, Islington MDX 
Thomas BODKIN , 5/13/1821, 23 years 0 months 0 days old, Crane Court Lambeth Hill 
Henry Robert GOYMER , 5/20/1821, 1 years 11 months 0 days old, Old Fish Street 
Eliza WALLINGER , 5/20/1821, 0 years 10 months 0 days old, Taylor's Court, Lambeth Hill 
Louisa GODFREY , 5/29/1821, 0 years 4 months 0 days old, Taylor's Court, Lambeth Hill 
Caroline GODFREY , 5/29/1821, 0 years 4 months 0 days old, Taylor's Court, Lambeth Hill 
Jane BLACKLEDGE , 6/3/1821, 32 years 0 months 0 days old, Green Arbour Court 
John HOLLOWAY , 6/5/1821, 6 years 0 months 0 days old, Lambeth Hill 
Robert PERKINS , 6/29/1821, 3 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Mary HAWKINS , 7/1/1821, 53 years 0 months 0 days old, Knight Rider Court 
Sarah SEDGWICK , 7/31/1821, 49 years 0 months 0 days old, St Peter's Hill 
Mary Ann ESCOTT , 8/26/1821, 0 years 3 months 0 days old, Crane Court Lambeth Hill 
Jane Charlotte HAWARD , 9/22/1821, 0 years 0 months 14 days old, Little Carter Lane 
Caroline JONES , 10/31/1821, 1 years 2 months 25 days old, St Peters Hill 
Augusta Sophia GAUGIN , 11/4/1821, 16 years 0 months 0 days old, Knowles Court 
Hannah KENDRICK , 12/6/1821, 0 years 11 months 0 days old, Old Change 
George CLARK , 12/9/1821, 68 years 0 months 0 days old, Lambeth Hill 
Eliza Sarah JOHNSON , 1/6/1822, 2 years 6 months 0 days old, Lambeth Hill 
Elizabeth JONES , 1/20/1822, 61 years 0 months 0 days old, Little Carter Lane 
Jonathan WINSON , 2/17/1822, 34 years 0 months 0 days old, Taylor's Court, Lambeth Hill 
Ann SHIRMER , 2/17/1822, 26 years 0 months 0 days old, St Peter's Hill 
William BROOKES , 2/24/1822, 1 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Eliza STEVENS , 3/6/1822, 0 years 11 months 0 days old, Bells Court, Docotr's Commons 
Thomas Joel James KENSEY , 3/27/1822, 4 years 0 months 0 days old, Lambeth Hill 
James JACKSON , 5/19/1822, 0 years 10 months 0 days old, Friday Street 
Mary FACHE , 6/9/1822, 1 years 5 months 25 days old, Crane Court Lambeth Hill 
George Henry MANN , 6/16/1822, 1 years 0 months 25 days old, Lambeth Hill 
Mary MILNER , 7/14/1822, 56 years 0 months 0 days old, Old Change 
George Trinity SMITH , 8/18/1822, 29 years 0 months 0 days old, Lambeth Hill 
James SHORT , 9/22/1822, 22 years 0 months 0 days old, Little Knight Ryder Street 
Charles ROWLEY , 11/3/1822, 79 years 0 months 0 days old, Old Change 
William MARCHUM , 12/15/1822, 22 years 0 months 0 days old, Taylor's Court, Lambeth Hill 
William TYRRELL , 12/25/1822, 0 years 2 months 0 days old, Lambeth Hill 
Mary MEADOWS , 2/7/1823, 74 years 0 months 0 days old, Taylor's Court, Lambeth Hill 
Peter WARBURTON , 3/13/1823, 47 years 0 months 0 days old, Old Change 
Christianus MEADOWS , 4/3/1823, 67 years 0 months 0 days old, Bell Court 
Ann BURGOYNE , 8/28/1823, 5 years 0 months 0 days old, White Cross St, Cripplegate 
Henry Samuel WATT , 10/1/1823, 0 years 10 months 0 days old, St Peter's Hill 
Thomas SMITH , 10/20/1823, 28 years 0 months 0 days old, Old Change 
Eliza Erinder COGGER , 11/4/1823, 0 years 10 months 0 days old, Peters Hill 
Henry KERR , 12/5/1823, 3 years 0 months 0 days old, Little Knight Ryder Street 
Abraham GOYMER , 12/11/1823, 0 years 0 months 5 days old, Old Fish Street 
Lewis FACHE , 12/28/1823, 0 years 10 months 0 days old, Crane Court Lambeth Hill 
Charles MORGAN , 2/22/1824, 1 years 1 months 25 days old, Crane Court Lambeth Hill 
Thomas LOOKER , 5/9/1824, 2 years 10 months 0 days old, Lambeth Hill 
Francis MARTIMORE , 6/27/1824, 64 years 0 months 0 days old, Lambeth Hill 
Thomas CLOSE , 6/29/1824, 55 years 0 months 0 days old, Little Knight Ryder Street 
William DOLBY , 7/20/1824, 5 years 6 months 0 days old, Green Arbour Court, Lambeth Hill 
Robert HOOPER , 9/16/1824, 0 years 9 months 0 days old, Green Arbour Court, Lambeth Hill 
George RADFORD , 9/23/1824, 18 years 0 months 0 days old, St Peters Hill 
Mary JARRAL , 10/4/1824, 69 years 0 months 0 days old, Lambeth Hill 
Hannah ROGERS , 11/10/1824, 5 years 0 months 0 days old, Knight Rider's Court 
Robert HENDRY , 11/28/1824, 43 years 0 months 0 days old, Labour in Vain Yard 
Ann WHIFFEN , 12/15/1824, 42 years 0 months 0 days old, St Peter's Hill 
Elizabeth PRICE , 1/30/1825, 53 years 0 months 0 days old, Noble Street, St Lukes MDX 
William EDMUNDS , 2/3/1825, 60 years 0 months 0 days old, Lambeth Hill 
Hannah MELLOR , 2/20/1825, 60 years 0 months 0 days old, Bell Court, Great Carter Lane 
Martha HOPKINS , 3/18/1825, 84 years 0 months 0 days old, Taylor's Court, Lambeth Hill 
Thomas JARVIS , 4/23/1825, 39 years 0 months 0 days old, Little Knight Ryder Street 
Edward MARTIN , 8/9/1825, 49 years 0 months 0 days old, Lambeth Hill 
Elizabeth COOKE , 8/27/1825, 39 years 0 months 0 days old, Crew Lane 
Daniel KENSEY , 11/4/1825, 0 years 0 months 3 days old, Knight Rider Court 
William FROSTICK , 11/6/1825, 1 years 8 months 0 days old, Lambeth Hill 
Abraham Frederic GOYMER , 11/6/1825, 0 years 11 months 0 days old, Old Fish Street 
Mary COWLING , 11/13/1825, 0 years 10 months 0 days old, Lambeth Hill 
Emma MASDON , 11/13/1825, 0 years 10 months 0 days old, Lambeth Hill 
James LOOKER , 12/1/1825, 2 years 6 months 0 days old, Lambeth Hill 
Charles Neal CUMMINGS , 12/12/1825, 18 years 0 months 0 days old, Great Carter Lane 
James GARDNER , 1/5/1826, 1 years 3 months 25 days old, Taylor's Court, Lambeth Hill 
John HART , 1/22/1826, 51 years 0 months 0 days old, Old Change 
William HURN , 2/6/1826, 0 years 2 months 0 days old, Lambeth Hill 
William RADFORD , 2/13/1826, 57 years 0 months 0 days old, St Peters Hill 
Elizabeth PARRY , 3/12/1826, 41 years 0 months 0 days old, Old Change 
Charles CLARK , 3/26/1826, 2 years 3 months 0 days old, Brew Street Hill 
Henry EDMONDS , 4/9/1826, 38 years 0 months 0 days old, Old Change 
John WILLSON , 4/16/1826, 25 years 0 months 0 days old, Little Carter Lane 
Eliza COLES , 4/16/1826, 10 years 0 months 0 days old, Crane Court Lambeth Hill 
Emma COOKSON , 7/16/1826, 0 years 3 months 0 days old, Old Change 
Edward WATERLANE , 9/14/1826, 32 years 0 months 0 days old, Bread Street Hill 
Elizabeth COSTER , 9/24/1826, 42 years 0 months 0 days old, Crane Court Lambeth Hill 
Richard MASON , 10/12/1826, 49 years 0 months 0 days old, Lambeth Hill 
Henry SHIPMAN , 11/2/1826, 39 years 0 months 0 days old, Little Carter Lane 
Susan OXFORD , 11/8/1826, 1 years 2 months 25 days old, Crane Court Lambeth Hill 
John Paul STEVENS , 1/17/1827, 66 years 0 months 0 days old, Crane Arbour Court 
Sarah JOHNSON , 1/28/1827, 41 years 0 months 0 days old, Lambeth Hill 
William CHAMBERS , 3/13/1827, 75 years 0 months 0 days old, Lambeth Hill 
Richard JOHNS , 3/13/1827, 28 years 0 months 0 days old, Knight Rider Court 
George JONES , 3/18/1827, 1 years 0 months 25 days old, Bell Inn Yard, Friday Street 
Frances Ann JORDAN , 5/14/1827, 3 years 4 months 0 days old, Knight Ryder Court 
Emma PERKINS , 7/11/1827, 0 years 3 months 8 days old, Lambeth Hill 
William GRIFFIN , 8/12/1827, 0 years 10 months 0 days old, Lambeth Hill 
Susan PHILLIPS , 1/6/1828, 61 years 0 months 0 days old, Lambeth Hill 
Sarah BECKWITH , 1/21/1828, 2 years 6 months 0 days old, Crane Court Lambeth Hill 
William PRICE , 3/16/1828, 30 years 0 months 0 days old, Knight Rider Court 
Charles LEE , 3/16/1828, 1 years 0 months 25 days old, Sermon Lane 
William KNIGHT , 3/30/1828, 35 years 0 months 0 days old, Knight Rider Court 
Mary MORRIS , 3/30/1828, 96 years 0 months 0 days old, Lambeth Hill 
Joshua WELCH , 4/21/1828, 25 years 0 months 0 days old, Little Knight Rider Street 
Robert MULLIS , 6/29/1828, 38 years 0 months 0 days old, Sermon Lane 
Mary Ann BECKWITH , 6/29/1828, 0 years 10 months 0 days old, Crane Court Lambeth Hill 
Maria ROSE , 6/29/1828, 8 years 0 months 0 days old, Taylor's Court, Lambeth Hill 
James Frederick TRAYLEN , 7/10/1828, 0 years 4 months 0 days old, Little Carter Lane 
Sarah Ann ANTHONY , 8/6/1828, 47 years 0 months 0 days old, Lambeth Hill 
Thomas William NEALE , 9/3/1828, 1 years 0 months 0 days old, Lambeth Hill 
John Amos JONES , 11/2/1828, 0 years 9 months 0 days old, Bell Inn Yard, Friday Street 
John Edward SPEECHLEY , 11/9/1828, 4 years 0 months 0 days old, Sermon Lane 
George Frederick VIGOR , 11/23/1828, 2 years 0 months 0 days old, Little Knight Ryder Street 
Sarah LINSELL , 12/24/1828, 62 years 0 months 0 days old, Taylor's Court, Lambeth Hill 
William SARGENT , 2/15/1829, 0 years 5 months 0 days old, Lambeth Hill 
Benjamin HOTINE , 2/15/1829, 53 years 0 months 0 days old, Little Knight Rider Street 
Mary FIELD , 2/20/1829, 0 years 3 months 0 days old, Lambeth Hill 
William PHILLIPS , 2/22/1829, 66 years 0 months 0 days old, Crane Court Lambeth Hill 
Thomas ELLIS , 3/15/1829, 0 years 10 months 0 days old, Knight Rider Court 
James STEWART , 4/5/1829, 0 years 0 months 28 days old, Sermon Lane 
James CROLL , 4/19/1829, 43 years 0 months 0 days old, Lambeth Hill 
Sarah ANSELL , 5/31/1829, 29 years 0 months 0 days old, High Timber St, Upper Thames St 
Joseph CARPENTER , 6/18/1829, 13 years 0 months 0 days old, Peckham SRY 
John Henry WALKER , 7/8/1829, 0 years 5 months 0 days old, Knight Rider Court 
Elizabeth BIRCH , 8/9/1829, 58 years 0 months 0 days old, Lambeth Hill 
Jane PUZEY , 8/27/1829, 1 years 0 months 25 days old, Crane Court Lambeth Hill 
Hannah HUGHES , 9/11/1829, 25 years 0 months 0 days old, Lambeth Hill 
Edwin HUGHES , 9/11/1829, 0 years 0 months 5 days old, Lambeth Hill 
Hannah LUCAS , 12/27/1829, 67 years 0 months 0 days old, Taylor's Court, Lambeth Hill 
Janet SKEENE , 12/31/1829, 63 years 0 months 0 days old, Little Knight Rider Street 
Elizabeth BLACKMORE , 1/24/1830, 52 years 0 months 0 days old, Lambeth Hill 
Christian SCHINDLER , 1/27/1830, 58 years 0 months 0 days old, Knowles Court Little Carter Lane 
Jane CAREY , 1/31/1830, 0 years 3 months 0 days old, Taylor's Court, Lambeth Hill 
Richard LLOYD , 2/3/1830, 40 years 0 months 0 days old, Lambeth Hill 
William GREEN , 2/7/1830, 61 years 0 months 0 days old, Old Change 
Hannah WOOD , 3/3/1830, 0 years 1 months 19 days old, Knight Rider Court 
Thomas Henry SPEECHLEY , 3/7/1830, 3 years 6 months 0 days old, Sermon Lane 
James MILNER , 4/5/1830, 61 years 0 months 0 days old, Crown Court Old Change 
George Edwin LEE , 4/22/1830, 5 years 0 months 0 days old, Little Carter Lane 
Georgina POWELL , 7/24/1830, 43 years 0 months 0 days old, Little Carter Lane 
Susanna BAXTER , 9/5/1830, 40 years 0 months 0 days old, Crane Court Lambeth Hill 
Mary CHAMBERS , 11/21/1830, 70 years 0 months 0 days old, Lambeth Hill 
Frances LEAVER , 11/25/1830, 28 years 0 months 0 days old, Little Knight Ryder Street 
John Yates ELLIS , 11/29/1830, 0 years 0 months 5 days old, Little Knight Rider Street 
Amelia GOYMER , 3/1/1831, 0 years 10 months 0 days old, Old Fish Street 
Joseph COLLIER , 4/3/1831, 58 years 0 months 0 days old, Lambeth Hill 
John Edward LOOKER , 7/20/1831, 1 years 7 months 25 days old, Lambeth Hill 
Charles BLACKLEDGE , 8/7/1831, 1 years 5 months 25 days old, Green Arbour Court 
Sarah VINCE , 8/14/1831, 1 years 0 months 0 days old, Lambeth Hill 
Harriet LLOYD , 8/17/1831, 1 years 9 months 0 days old, Lambeth Hill 
Jane RICHARDS , 8/21/1831, 0 years 1 months 19 days old, Green Arbour Court, Lambeth Hill 
George BLACKLEDGE , 8/30/1831, 6 years 0 months 0 days old, Green Arbour Court 
John LOOKER , 9/11/1831, 45 years 0 months 0 days old, Lambeth Hill 
Sarah GARDNER , 11/24/1831, 50 years 0 months 0 days old, Crane Court Lambeth Hill 
Hannah KENDRICK , 11/27/1831, 71 years 0 months 0 days old, Crane Court Lambeth Hill 
Sarah STEWART , 12/11/1831, 1 years 9 months 0 days old, St Johns Street, Smithfield 
Thomas LINSELL , 1/15/1832, 63 years 0 months 0 days old, At Andrews Hill 
Emily Esther STEVENS , 4/22/1832, 1 years 7 months 0 days old, Bell Court, Doctors Commons 
Ann CUMMINS , 6/16/1832, 66 years 0 months 0 days old, Great Carter Lane 
Jane COLES , 7/5/1832, 5 years 0 months 0 days old, Great Carter Lane 
Elizabeth Ann BIRCH , 7/7/1832, 0 years 0 months 14 days old, Lambeth Hill 
Mary Ann PRICE , 7/18/1832, 9 years 0 months 0 days old, Lambeth Hill 
Hannah AYLIFF , 7/18/1832, 11 years 0 months 0 days old, Lambeth Hill 
Elizabeth FLINTAN , 7/20/1832, 39 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
John SMALE , 7/22/1832, 51 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Sarah BIRCH , 8/12/1832, 32 years 0 months 0 days old, Green Dragon Crt, St Andrews Hill 
James John JONES , 8/12/1832, 37 years 0 months 0 days old, Knight Rider Court 
John CRAGG , 8/19/1832, 34 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Moot VALENTINE , 9/14/1832, 43 years 0 months 0 days old, Crane Court Lambeth Hill 
Jane FLUDE , 11/1/1832, 58 years 0 months 0 days old, Little Knight Ryder Street 
Anne JORDAN , 11/25/1832, 36 years 0 months 0 days old, Knight Ryder Court 
Jane LEGG , 2/10/1833, 26 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Rosina AUSTIN , 3/7/1833, 20 years 0 months 0 days old, Mile End MDX 
Thomas PERKINS , 3/31/1833, 50 years 0 months 0 days old, Lambeth Hill 
Thomas LYONS , 4/3/1833, 2 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Margaret JONES , 4/14/1833, 58 years 0 months 0 days old, Crane Court Lambeth Hill 
Elizabeth HOBART , 4/19/1833, 36 years 0 months 0 days old, Little Knight Ryder Street 
William Penn CLARK , 4/21/1833, 40 years 0 months 0 days old, Bell Square, Bishopsgate 
John DRAKE , 4/21/1833, 50 years 0 months 0 days old, Lambeth Hill 
William COLES , 4/28/1833, 3 years 10 months 0 days old, Great Carter Lane 
Jane WISHER , 4/28/1833, 0 years 11 months 0 days old, Lambeth Hill 
Edward FELLOWES , 4/28/1833, 2 years 0 months 0 days old, Taylor's Court, Lambeth Hill 
Mary PERKINS , 5/2/1833, 45 years 0 months 0 days old, Lambeth Hill 
Sarah READ , 5/5/1833, 65 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
William FLANDERS , 5/19/1833, 2 years 6 months 0 days old, St Peters Hill 
Thomas BEAUMONT , 6/8/1833, 0 years 4 months 0 days old, Knowles Court 
William PHILP , 7/7/1833, 16 years 0 months 0 days old, St Peters Hill 
Joseph NEWHALL , 7/8/1833, 61 years 0 months 0 days old, Little Knight Ryder Street 
Emma SALIS , 7/23/1833, 0 years 0 months 14 days old, Knight Rider Court 
James HIBBLE , 7/24/1833, 75 years 0 months 0 days old, Lambeth Hill 
William James MORGAN , 7/26/1833, 1 years 2 months 25 days old, Crane Court Lambeth Hill 
Thomas William COLLEY , 8/8/1833, 0 years 0 months 4 days old, Lambeth Hill 
Mary Ann COX , 8/8/1833, 0 years 0 months 4 days old, St Peters Hill 
Mary WESTCOTT , 8/17/1833, 26 years 0 months 0 days old, Knight Rider Court 
George READ , 8/20/1833, 66 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
William PLUMRIDGE , 8/25/1833, 75 years 0 months 0 days old, Taylor's Court, Lambeth Hill 
William DAWES , 8/25/1833, 65 years 0 months 0 days old, Taylor's Court, Lambeth Hill 
Elizxabeth FOON , 8/25/1833, 14 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Ann HIBBLE , 8/28/1833, 53 years 0 months 0 days old, Lambeth Hill 
Ann BURGOYNE , 9/2/1833, 55 years 0 months 0 days old, Little Knight Ryder Street 
William JOPP , 9/10/1833, 24 years 0 months 0 days old, Great Trinity Lane 
Sarah Jane GRIFFITHS , 10/13/1833, 2 years 8 months 0 days old, Sermon Lane 
John NEWHALE , 11/4/1833, 58 years 0 months 0 days old, Woolwich Kent 
George GALE , 11/17/1833, 6 years 0 months 0 days old, Crane Court Lambeth Hill 
Sarah Augusta GOYMER , 11/21/1833, 0 years 8 months 0 days old, Old Fish Street 
Rebecca JONES , 12/1/1833, 86 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Margaret TALBOTT , 12/1/1833, 31 years 0 months 0 days old, Little Carter Lane 
Charles COLES , 12/1/1833, 2 years 0 months 0 days old, Great Carter Lane 
Edwin EARDLEY , 12/8/1833, 25 years 0 months 0 days old, Little Knight Rider Street 
Jane BRADSHAW , 12/9/1833, 0 years 3 months 0 days old, Crane Court Lambeth Hill 
John BURGOYNE , 1/5/1834, 53 years 0 months 0 days old, Little Knight Ryder Street 
Caroline NICHOLAS , 2/6/1834, 6 years 0 months 0 days old, Little Carter Lane 
Sarah Lucy BIRCH , 2/26/1834, 30 years 0 months 0 days old, Lambeth Hill 
James Robert COLLINS , 3/25/1834, 1 years 6 months 0 days old, Lambeth Hill 
Daniel LYONS , 4/27/1834, 1 years 6 months 0 days old, Green Arbour Court, Lambeth Hill 
Elizabeth GABRIEL , 4/30/1834, 18 years 0 months 0 days old, Lambeth Hill 
William JOPP , 5/1/1834, 0 years 8 months 0 days old, Oxford Street 
Frederick DILLAY , 5/4/1834, 2 years 0 months 0 days old, Little Carter Lane 
John WILLIAMS , 5/18/1834, 40 years 0 months 0 days old, Old Change 
John CROCKFORD , 7/16/1834, 67 years 0 months 0 days old, Crane Court Lambeth Hill 
Samuel LEE , 7/26/1834, 5 years 9 months 0 days old, Sermon Lane 
Alice CRAGG , 8/11/1834, 2 years 0 months 0 days old, Taylor's Court, Lambeth Hill 
Elizabeth Lydia STRATTON , 8/17/1834, 25 years 0 months 0 days old, Sermon Lane 
John REDDALL , 8/22/1834, 72 years 0 months 0 days old, Sermon Lane 
Mary BEARNARD , 10/19/1834, 21 years 0 months 0 days old, Little Knight Ryder Street 
Sarah PHILLIPS , 10/26/1834, 59 years 0 months 0 days old, Lambeth Hill 
Thomas MILWARD , 11/2/1834, 84 years 0 months 0 days old, Lambeth Hill 
Hannah AYLIFF , 12/10/1834, 44 years 0 months 0 days old, Crane Court Lambeth Hill 
William DEVEY , 12/21/1834, 0 years 3 months 0 days old, Green Arbour Court, Lambeth Hill 
Lucy BURGESS , 12/21/1834, 45 years 0 months 0 days old, Little Knight Ryder Street 
Charles BLACKLEDGE , 1/7/1835, 2 years 0 months 0 days old, Green Arbour Court 
Sarah WISHER , 1/27/1835, 1 years 0 months 0 days old, Lambeth Hill 
Hubert Paul RIVOUS , 4/7/1835, 15 years 0 months 0 days old, Little Knight Rider Street 
William Henry HOLMAN , 4/26/1835, 14 years 0 months 0 days old, Little Carter Lane 
Joseph WILSON , 6/6/1835, 2 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Joseph STRICKFIELD , 7/19/1835, 0 years 4 months 0 days old, Lambeth Hill 
John ROCKELL , 8/9/1835, 69 years 0 months 0 days old, Taylor's Court, Lambeth Hill 
George BAXTER , 9/8/1835, 30 years 0 months 0 days old, Knight Rider Court 
Thomas STRICKLAND , 9/11/1835, 73 years 0 months 0 days old, Little Knight Ryder Street 
John BLACKLEDGE , 9/27/1835, 44 years 0 months 0 days old, Green Arbour Court 
William JONES , 11/8/1835, 40 years 0 months 0 days old, St Bartholomew's Hospital 
Mary STRAITON , 11/8/1835, 2 years 10 months 0 days old, Little Knight Ryder Street 
Elizabeth HOLMAN , 11/8/1835, 1 years 5 months 0 days old, Little Carter Lane 
Mary Ann SARGENT , 12/14/1835, 0 years 10 months 0 days old, Taylor's Court, Lambeth Hill 
Elizabeth WILD , 12/22/1835, 23 years 0 months 0 days old, Lambeth Hill 
Eliza Ellen SPEECHLEY , 2/28/1836, 3 years 0 months 0 days old, Prujean Square Old Bailey 
Sophie McGOWAN , 3/6/1836, 55 years 0 months 0 days old, St Peters Hill 
Elizabeth GARDENER , 3/13/1836, 30 years 0 months 0 days old, Knight Riders Court 
Wm. Geo. Perkins BENNETT , 3/27/1836, 0 years 5 months 0 days old, Lambeth Hill 
Thomas HEATH , 5/22/1836, 72 years 0 months 0 days old, Lambeth Hill 
Henry DIAL , 6/7/1836, 0 years 0 months 14 days old, Crane Court Lambeth Hill 
Sarah ANGELL , 10/9/1836, 42 years 0 months 0 days old, Lambeth Hill 
John COLES , 10/9/1836, 17 years 0 months 0 days old, Great Carter Lane, Doctors Commos 
Rosetta HARRIS , 1/22/1837, 74 years 0 months 0 days old, Lambeth Hill 
Richard DILLEY , 1/26/1837, 46 years 0 months 0 days old, Little Carter Lane 
David THOMSON , 1/29/1837, 5 years 0 months 0 days old, Old Change 
Francis NORIS , 2/5/1837, 45 years 0 months 0 days old, Lambeth Hill 
George BENSTEAD , 4/2/1837, 0 years 7 months 0 days old, Lambeth Hill 
Ann MARECHAL , 5/7/1837, 73 years 0 months 0 days old, Little Knight Ryder Street 
Mary Harris HUTCHINSON , 5/14/1837, 2 years 0 months 0 days old, Little Carter Lane 
Elizabeth DOWNES , 6/4/1837, 48 years 0 months 0 days old, Taylor's Court, Lambeth Hill 
William Henry FELLOWS , 6/28/1837, 1 years 0 months 25 days old, Lambeth Hill 
John HARRIS , 7/2/1837, 62 years 0 months 0 days old, Lambeth Hill 
William BENNETT , 7/5/1837, 0 years 6 months 0 days old, Lambeth Hill 
James PHILP , 8/3/1837, 0 years 4 months 0 days old, Knight Rider Court 
George FLANDERS , 8/16/1837, 0 years 3 months 0 days old, St Peters Hill 
Charles TRIMMING , 8/17/1837, 15 years 0 months 0 days old, Taylor's Court, Lambeth Hill 
Ann SKATES , 10/8/1837, 50 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Robert POWELL , 10/13/1837, 1 years 0 months 0 days old, Knight Rider Court 
George MASON , 10/26/1837, 0 years 5 months 0 days old, Knight Rider Court 
Henry BURGMAN , 1/21/1838, 76 years 0 months 0 days old, Little Knight Ryder Street 
Stephen PERKINS , 3/25/1838, 19 years 0 months 0 days old, Old Fish Street 
George WESTCOTT , 4/4/1838, 40 years 0 months 0 days old, Crane Court Lambeth Hill 
Mary BOWLES , 5/9/1838, 33 years 0 months 0 days old, Green Arbour Court 
Mary Jane CLARK , 5/12/1838, 20 years 0 months 0 days old, Old Change 
James CARPENTER , 6/5/1838, 67 years 0 months 0 days old, Peckham SRY 
William John SARJANT , 6/8/1838, 0 years 1 months 5 days old, Taylor's Court, Lambeth Hill 
Elizabeth Sarah HAWKINS , 11/26/1838, 4 years 2 months 0 days old, Green Arbour Court, Lambeth Hill 
Chas Nathaniel LAWRENCE , 12/2/1838, 10 years 0 months 0 days old, Old Change 
Clara Emmeline SPEECHLEY , 12/16/1838, 3 years 5 months 0 days old, Christ Church Surrey 
Philip John PRUDORN , 12/19/1838, 40 years 0 months 0 days old, Sermon Lane 
Mary PHILP , 12/23/1838, 46 years 0 months 0 days old, Knight Rider Court 
George BAKER , 1/8/1839, 46 years 0 months 0 days old, Knight Ryder Court 
Mary DOUGLAS , 1/26/1839, 1 years 1 months 25 days old, Knight Rider Street 
John Stephen BENSTEAD , 3/29/1839, 0 years 8 months 0 days old, Lambeth Hill 
Amy PAYNE , 3/29/1839, 42 years 0 months 0 days old, Little Carter Lane 
Jane BIRCHILL , 3/31/1839, 18 years 0 months 0 days old, New Street, St Bride's 
William George GREEN , 5/22/1839, 35 years 0 months 0 days old, Little Carter Lane 
Elizabeth ROBERTS , 5/28/1839, 1 years 11 months 0 days old, Green Arbour Court, Lambeth Hill 
Sarah MASON , 6/2/1839, 3 years 10 months 0 days old, Crane Court Lambeth Hill 
James MASON , 6/12/1839, 0 years 3 months 0 days old, Crane Court Lambeth Hill 
Mary Ann BUFFHAM , 6/25/1839, 3 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Louisa FLANDERS , 6/25/1839, 9 years 3 months 0 days old, St Peters Hill 
Jane GIBBS , 7/10/1839, 0 years 11 months 0 days old, Green Arbour Court, Lambeth Hill 
Frederick MARSHALL , 8/5/1839, 4 years 0 months 0 days old, Little Knight Ryder Street 
Anthony Romney MARSHALL , 8/5/1839, 1 years 6 months 25 days old, Little Knight Ryder Street 
Ann DALBY , 8/11/1839, 60 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Abraham GOYMER , 9/2/1839, 48 years 0 months 0 days old, Globe Road, Mile End 
William BRAINTRUMP , 9/15/1839, 5 years 0 months 0 days old, Lambeth Hill 
Sarah COLLINSON , 9/15/1839, 0 years 2 months 0 days old, Knight Rider Court 
Henry Eli CASTLEMAN , 9/24/1839, 30 years 0 months 0 days old, Old Change 
William HOOPER , 9/25/1839, 19 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
James HILLUM , 9/26/1839, 39 years 0 months 0 days old, Knight Rider Court 
William THOMPSON , 10/10/1839, 75 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Elizabeth BROWN , 10/13/1839, 33 years 0 months 0 days old, High Holborn 
Geroge Henry ROBERTS , 10/20/1839, 0 years 3 months 0 days old, Green Arbour Court, Lambeth Hill 
Amelia GYDE , 11/10/1839, 0 years 1 months 0 days old, Lambeth Hill 
Frederick BARTLETT , 11/29/1839, 0 years 11 months 0 days old, Crane Court 
Mary Louise MARSHALL , 12/20/1839, 5 years 0 months 0 days old, Little Knight Ryder Street 
Sarah WELCH , 2/23/1840, 20 years 0 months 0 days old, Old Fish Street 
Bella SCOTT , 6/4/1840, 11 years 0 months 0 days old, Lambeth Hill 
Caroline MOLE , 11/15/1840, 63 years 0 months 0 days old, Holiday Yard 
Jacob George BUCKLEY , 11/22/1840, 0 years 3 months 0 days old, Lambeth Hill 
Maria STAINES , 11/28/1840, 0 years 3 months 0 days old, Lambeth Hill 
Mary Ann ISLIP , 12/20/1840, 4 years 0 months 0 days old, Lambeth Hill 
John FOON , 1/10/1841, 60 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Nathaniel McGOWEN , 1/20/1841, 76 years 0 months 0 days old, Lambeth Hill 
Richard KEMSHEAD , 2/21/1841, 35 years 0 months 0 days old, Lambeth Hill 
Simon MARYON , 3/3/1841, 41 years 0 months 0 days old, Crane Court Lambeth Hill 
Martha HEALD , 3/3/1841, 48 years 0 months 0 days old, Lambeth Hill 
Charles James BERRY , 3/3/1841, 34 years 0 months 0 days old, Sermon Lane 
Thomas DALBY , 4/18/1841, 25 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Henry ROSS , 8/22/1841, 37 years 0 months 0 days old, Little Carter Lane 
Hannah BENNETT , 9/26/1841, 0 years 10 months 0 days old, Lambeth Hill 
Sarah MILLWARD , 10/29/1841, 84 years 0 months 0 days old, Little Carter Lane 
Joseph TEMPEST , 12/26/1841, 73 years 0 months 0 days old, Taylor's Court, Lambeth Hill 
James JOHNS , 1/13/1842, 51 years 0 months 0 days old, Lambeth Hill 
John Francis HARRIS , 1/16/1842, 1 years 7 months 25 days old, Peter's Hill 
Mary MARYON , 2/6/1842, 38 years 0 months 0 days old, Boss Court Upper Thames Street 
Henry THEED , 3/17/1842, 37 years 0 months 0 days old, Sermon Lane 
Elizabeth CARTER , 5/17/1842, 74 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Alfred RENWELL , 5/22/1842, 1 years 5 months 25 days old, Crane Court Lambeth Hill 
William DALBY , 5/29/1842, 65 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Ann CARDWELL , 7/24/1842, 48 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Ann BARRY , 9/21/1842, 64 years 0 months 0 days old, Bucks Head Court 
Susannah WILLIAMS , 11/13/1842, 56 years 0 months 0 days old, Green Arbour Court 
Maria PARTRIDGE , 11/20/1842, 60 years 0 months 0 days old, Great Trinity Lane 
Edward ANGEL , 11/20/1842, 22 years 0 months 0 days old, Crane Court Lambeth Hill 
Elizabeth PEASTON , 12/11/1842, 0 years 11 months 0 days old, Taylor's Court, Lambeth Hill 
Alfred RYDER , 1/15/1843, 2 years 6 months 0 days old, Sermon Lane 
Mary FARMFIELD , 3/5/1843, 64 years 0 months 0 days old, Lambeth Hill 
Thomas Ebenezer OGILVY , 3/19/1843, 2 years 5 months 0 days old, Little Knight Ryder Street 
Clara KEMSHEAD , 5/21/1843, 3 years 6 months 0 days old, 25, Lambeth Hill 
Lucy Ann COLEBACK , 7/23/1843, 0 years 0 months 28 days old, Lambeth Hill 
Joseph NEWMAN , 9/24/1843, 1 years 0 months 0 days old, Old Change 
Richard COLLETT , 10/1/1843, 39 years 0 months 0 days old, Old Change 
James GOODHALL , 10/8/1843, 49 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Mary Ann DEACH , 10/29/1843, 1 years 9 months 25 days old, Lambeth Hill 
William WRIGHT , 1/24/1844, 74 years 0 months 0 days old, Greeham, East Kent 
Lydia FELLOWS , 1/28/1844, 33 years 0 months 0 days old, Lambeth Hill 
Penfold WAKEFIELD , 2/18/1844, 4 years 8 months 0 days old, Knight Rider Court 
John William ALLARDYCE , 3/17/1844, 2 years 9 months 0 days old, Little Knight Ryder Street 
Mary THOMPSON , 3/21/1844, 82 years 0 months 0 days old, Sermon Lane 
Hannah LEE , 4/21/1844, 53 years 0 months 0 days old, Sermon Lane 
Frederic Alex. ALLARDYCE , 4/21/1844, 1 years 4 months 25 days old, Little Knight Ryder Street 
Sarah THOMPSON , 5/7/1844, 78 years 0 months 0 days old, Lambeth Hill 
Harriet Sarah ELLARD , 6/16/1844, 0 years 11 months 0 days old, Lambeth Hill 
Levina FRANCIS , 8/11/1844, 6 years 0 months 0 days old, Bennetts Hill 
John HOOD , 12/15/1844, 51 years 0 months 0 days old, Carter Lane 
Mary LINSELL , 12/22/1844, 43 years 0 months 0 days old, Crane Court Lambeth Hill 
Mary NETTLETON , 1/2/1845, 69 years 0 months 0 days old, Knight Rider Court 
Ann SMITH , 1/26/1845, 31 years 0 months 0 days old, Sermon Lane 
William WHITEKER , 2/2/1845, 43 years 0 months 0 days old, Peter's Hill 
Thomas HALL , 3/2/1845, 64 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
Eliza GOODALL , 4/6/1845, 28 years 0 months 0 days old, Little Carter Lane 
John BROWN , 5/11/1845, 26 years 0 months 0 days old, Parr's Head Corner Peters Hill 
George YOUNG , 5/11/1845, 73 years 0 months 0 days old, Peter's Hill 
Richard Harris BARHAM , 6/21/1845, 57 years 0 months 0 days old, Residentary Ho. Amen Corner 
William DAVIS , 6/28/1845, 71 years 0 months 0 days old, Ludgate Street 
Thomas ANDERSON , 7/6/1845, 27 years 0 months 0 days old, 2, Bennet's Hill 
Jane ROCKLE , 8/3/1845, 74 years 0 months 0 days old, 6, Lambeth Hill 
Henry TAPP , 8/17/1845, 57 years 0 months 0 days old, Crane Court Lambeth Hill 
Clara HANDLEY , 11/19/1845, 1 years 0 months 0 days old, Lambeth Hill 
Alice Elizabeth PERKINS , 11/30/1845, 68 years 0 months 0 days old, Bell Court, Temple Bar 
William Perkins BENNETT , 12/28/1845, 3 years 0 months 0 days old, Lambeth Hill 
Samuel WOOLFE , 3/5/1846, 76 years 0 months 0 days old, 4, Lambeth Hill 
Elizabeth TINKLER , 3/22/1846, 66 years 0 months 0 days old, Little Carter Lane 
George Jacob BECK , 4/19/1846, 0 years 7 months 0 days old, Sermon Lane 
William SPEED , 6/7/1846, 0 years 3 months 0 days old, 24, Peters Hill 
Thomas CUNNINGHAM , 6/7/1846, 17 years 0 months 0 days old, 21, Lambeth Hill 
John MASON , 6/23/1846, 18 years 0 months 0 days old, Crane Court Lambeth Hill 
William Nick STEVENS , 2/7/1847, 21 years 0 months 0 days old, Bell Court 
Henry HORNER , 4/6/1847, 45 years 0 months 0 days old, Knowles Court 
James HEALD , 4/13/1847, 56 years 0 months 0 days old, 24, Old Change 
William BURCH , 5/2/1847, 71 years 0 months 0 days old, 4, Lambeth Hill 
William FOONE , 5/16/1847, 24 years 0 months 0 days old, 3, Green Arbour Court, Lambeth Hill 
Henry Charles BENNET , 8/1/1847, 1 years 2 months 25 days old, 6, Lambeth Hill 
Elizabeth DUDLEY , 10/3/1847, 73 years 0 months 0 days old, 1,Taylor's Court, Lambeth Hill 
Ann Harriett SMITH , 10/16/1847, 3 years 0 months 0 days old, 25, Lambeth Hill 
Mary BATEMAN , 10/31/1847, 67 years 0 months 0 days old, 24, Lambeth Hill 
William FLANDERS , 11/28/1847, 50 years 0 months 0 days old, 15 Labour in Vain Yard Lambeth Hill 
Eliza NEGUS , 12/12/1847, 43 years 0 months 0 days old, 5, Lambeth Hill 
Ellen COCHRAM , 6/11/1848, 42 years 0 months 0 days old, 27, Addle Hill 
Philip AMIS , 8/3/1848, 1 years 0 months 0 days old, 18 1/2 Knight Rider Street 
Elizabeth GALLANT , 8/27/1848, 11 years 0 months 0 days old, 10, Crane Court 
Alfred BLACKLEDGE , 9/26/1848, 21 years 0 months 0 days old, 6,Green Arbour Court, Lambeth Hill 
Charles DORSETT , 10/1/1848, 0 years 6 months 0 days old, 4, Lambeth Hill 
Sarah Ann LAVIS , 10/15/1848, 2 years 0 months 0 days old, 7, Lambeth Hill 
Henry Richard LAVIS , 10/24/1848, 0 years 5 months 0 days old, 7, Lambeth Hill 
William Isaac WALSHAM , 1/21/1849, 0 years 9 months 0 days old, 2, Lambeth Hill 
Sarah GROVER , 2/4/1849, 30 years 0 months 0 days old, 4, Taylor's Court, Lambeth Hill 
John HUGGINS , 5/9/1849, 47 years 0 months 0 days old, 6, Lambeth Hill 
Sarah ARLETT , 5/27/1849, 2 years 0 months 0 days old, 5, Little Knight Rider Street 
William TRACEY , 5/31/1849, 2 years 0 months 0 days old, 8, Green Arbour Court 
Charles ANTHONY , 7/22/1849, 6 years 0 months 0 days old, 3,Taylor's Court, Lambeth Hill 
Mary Ann JONES , 9/27/1849, 8 years 0 months 0 days old, 20,Lambeth Hill 
Mary Ann NORRIS , 10/3/1849, 18 years 0 months 0 days old, 7, Little Knight Ryder Street 
William Earl PITT , 10/7/1849, 3 years 0 months 0 days old, 2,Lambeth Hill 
James PITT , 10/7/1849, 3 years 0 months 0 days old, 2,Lambeth Hill 
Emma CLARK , 10/14/1849, 4 years 0 months 0 days old, 15, Old Change 
Charles PLUMRIDGE , 11/21/1849, 1 years 1 months 25 days old, 4, Green Arbour Court 
Maria WARD , 12/11/1849, 43 years 0 months 0 days old, 2, Lambeth Hill 
John COCKERING , 12/19/1849, 7 years 0 months 0 days old, 18, Old Change 
Mary WEEKS , 12/23/1849, 57 years 0 months 0 days old, 11, Little Carter Lane 
Richard MALLON , 2/17/1850, 0 years 2 months 0 days old, 23, Lambeth Hill 
Susan JEWELL , 3/17/1850, 0 years 5 months 0 days old, 10, Little Carter Lane 
Mary Wicks BENNETT , 4/14/1850, 38 years 0 months 0 days old, 6, Lambeth Hill 
Martha SHIPMAN , 4/28/1850, 69 years 0 months 0 days old, 9, Crane Court Lambeth Hill 
Sarah MARCHANT , 5/20/1850, 87 years 0 months 0 days old, 12, Sermon Lane 
Martha JONES , 6/9/1850, 7 years 0 months 0 days old, 9, Little Carter Lane 
Elizabeth COCKHEAD , 6/9/1850, 21 years 0 months 0 days old, New Street, Blackfriars 
William HEALD , 7/21/1850, 14 years 0 months 0 days old, Old Change 
Henry GOODYEAR , 7/28/1850, 14 years 9 months 0 days old, 12, Little Carter Lane 
Mary LEWIN , 8/18/1850, 63 years 0 months 0 days old, 7,Little Knight Ryder Street 
Mary DAWSON , 10/20/1850, 62 years 0 months 0 days old, 14, Sermon Lane 
Ann BIRCH , 10/30/1850, 75 years 0 months 0 days old, 1,Taylor's Court, Lambeth Hill 
Eleanor BECKLEY , 11/17/1850, 1 years 0 months 0 days old, 4, Lambeth Hill 
Alice HAY , 11/17/1850, 57 years 0 months 0 days old, 6, Green Arbour Court, Lambeth Hill 
Alfred PRYCE , 11/17/1850, 1 years 0 months 0 days old, 1, Sermon Lane 
Mary BOWLES , 12/1/1850, 78 years 0 months 0 days old, Green Arbour Court, Lambeth Hill 
William LYALL , 1/5/1851, 63 years 0 months 0 days old, 23 Peter's Hill 
Angelina BUCKLEY , 1/28/1851, 38 years 0 months 0 days old, 3, Morris Yard, Old Fish Street 
Samuel LITTLE , 2/23/1851, 2 years 0 months 0 days old, 3, Taylor's Court, Lambeth Hill 
Mary Ann FERRIDAY , 3/16/1851, 69 years 0 months 0 days old, 2, Fish Street 
James JARRETT , 5/11/1851, 39 years 0 months 0 days old, 12,Crane Court Lambeth Hill 
Caroline BARHAM , 7/11/1851, 56 years 0 months 0 days old, 6, Pelham Place, Brompton 
Stephen C WAKEFIELD , 8/12/1851, 53 years 0 months 0 days old, 1, Knight Rider Court 
Charlotte WALKER , 8/17/1851, 0 years 7 months 0 days old, 20, Lambeth Hill 
Ann Charlotte CARPENTER , 11/21/1851, 76 years 0 months 0 days old, 14, Park Place Peckham 
Peter WHITE , 11/30/1851, 70 years 0 months 0 days old, 5, Knight Rider Street 
Jane WISHER , 12/19/1851, 50 years 0 months 0 days old, 4, Lambeth Hill 
Harriett FINCH , 2/1/1852, 0 years 9 months 0 days old, Green Arbour Court, Lambeth Hill 
Ann SAUNDERS , 5/21/1852, 90 years 0 months 0 days old, 1, Taylor's Court, Lambeth Hill 
Hannah LEE , 5/30/1852, 22 years 0 months 0 days old, 17,Sermon Lane 
William Matthew HASSALL , 11/28/1852, 0 years 3 months 0 days old, 2, Old Fish Street 
William STRANGE , 4/3/1853, 44 years 0 months 0 days old, 19, Little Knight Ryder Street 
Elizabeth MACKEY , 4/10/1853, 77 years 0 months 0 days old, 193, Upper Thames Street 
Thos Henry David GILHAM , 4/17/1853, 37 years 0 months 0 days old, 12,Little Knight Ryder Street 

