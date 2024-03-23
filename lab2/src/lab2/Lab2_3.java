package lab2;

import java.util.Scanner;

public class Lab2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("How many mark you want to insert : ");
		int n = reader.nextInt();
		
		double totalmarks = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Please enter mark no "+ (i+1));
			double marks = reader.nextDouble();
			
			System.out.println("Mark :" + marks + " has been inserted");
			totalmarks += marks;
		}
			System.out.println("\nTotal mark is :"+ totalmarks);

	}

}

