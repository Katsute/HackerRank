import java.util.*;

// keeping classes outside of the file class is POOR CODING PRACTICE
class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName
			+ 	"\nID: " + idNumber);
	}

}

class Student extends Person{
	private int[] testScores;

    /*
    *   Class Constructor
    *
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */

    public Student(final String firstName, final String lastName, final int identification, final int[] testScores){
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    /*
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    String calculate(){
        int total = 0;
        for(final int testScore : testScores)
            total += testScore;
        final double avg = total / (double) testScores.length;
        if(avg >= 90 && avg <= 100)
            return "O";
        else if(avg >= 80 && avg < 90)
            return "E";
        else if(avg >= 70 && avg < 80)
            return "A";
        else if(avg >= 55 && avg < 70)
            return "P";
        else if(avg >= 40 && avg < 55)
            return "D";
        else if(avg < 40)
            return "T";
        return null;
    }
}

public class Day_12_Inheritance {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}

}
