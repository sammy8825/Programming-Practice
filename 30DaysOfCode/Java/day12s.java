import java.util.*;

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

    Student(String first, String last, int id, int[] testScores){
        super(first, last, id);
        this.testScores = testScores;
    }
    
    char calculate(){
        double sum = 0;
        
        for(int i = 0; i < testScores.length ; i++){
            sum += testScores[i];
        }
        
        double a = sum / size;
    
        char grade;
    
        if(a>= 90 && a <= 100){
            grade = 'O';
        }else if(a < 90 && a >= 80){
            grade = 'E';
        }else if(a >= 70 && a < 80){
            grade = 'A';
        }else if(a < 70 && a >= 55){
            grade = 'P';
        }else if( a < 55 && a >= 40){
            grade = 'D';
        }else{
            grade = 'T';
        }
    
    
        return grade;
    }
    
}

class Solution {
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
		System.out.println("Grade: " + s.calculate());
	}
}