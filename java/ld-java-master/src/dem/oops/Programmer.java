//INSTANT PRACTICE.
/// USER STORY : JESSEL WANTS TO CREATE A WEB PAGE TO DISPLAY PRODUCTS. [BLUE TOOTH SPEAKER,BOOK ]
// AIP : CREATE 5 PROGRAMMERS, OPTION TO SEARCH PROGRAMMERS WITH DB AND NODB KNOWLEDGE.
package dem.oops;

public class Programmer {
//	ATTRIBUTES/FIELDS/VARIABLES/PROPERTIES
//	DATA TYPE : int
//	VARIABLE NAME : programmerId
	int programmerId;
//	DATA TYPE : String
//	VARIABLE NAME : name
	String programmerName;
	boolean DbKnowledge;

// METHOD/FUNCTION/BEHAVIOUR
	void displayDetails() {
		System.out.println(programmerId);
		System.out.println(programmerName);
		System.out.println(DbKnowledge);
	}

	public static void main(String[] args) {
//		creating the first programmer
		Programmer programmerObject = new Programmer();
// assign the details for the programmer
		programmerObject.programmerId = 1;
		programmerObject.programmerName = "Sam Sung";
		programmerObject.DbKnowledge = true;
//		print the programmer details
		programmerObject.displayDetails();		
		
//		creating the second programmer
		Programmer peter = new Programmer();
// assign the details for the programmer
		peter.programmerId = 2;
		peter.programmerName = "Peter John";
		peter.DbKnowledge = false;
		

//		print the programmer details
		peter.displayDetails();
	}
}
