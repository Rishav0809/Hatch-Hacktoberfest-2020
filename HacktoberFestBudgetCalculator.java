package question1;

import java.util.Scanner;

public class HacktoberFestBudgetCalculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year fo Fest: ");
		int year = sc.nextInt();
		System.out.println("-------------------------------------------------------------");
		System.out.println("Welcome to Hacktober Fest "+ year);
		System.out.println("-------------------------------------------------------------");
		System.out.print("Enter the number of students with valid PRs: ");
		int numberOfStudents = sc.nextInt();
		int pricePerParticipant = 50;
		System.out.println("The total amount spent on participants: "+ numberOfStudents*pricePerParticipant + " $");
		sc.close();
	}

}
