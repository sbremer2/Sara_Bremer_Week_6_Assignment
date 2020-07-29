//Sara Bremer

import java.util.Scanner;
import java.util.Random;


public class Sara_Bremer_Week6Assignment 
{
	public static void main(String[] args) 
	{
	//FOR LOOP
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Part 1: for loop -- Average of randomly generated integers");
		System.out.println("---------------------------------------------------------------------");
		
		int min;
		int max;
		int range;
		int randomNumber;
		int sum = 0;
		
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
		
		System.out.print("Enter the minimum number of the range: ");
		
		min = input.nextInt();
		
		System.out.print("Enter the maxiumum number of the range: ");
		max = input.nextInt();
		
		System.out.print("Enter how many numbers to generate: " );
		range = input.nextInt();
		
		System.out.print("Randomly Generated Numbers: ");	
		for (int i = 1; i<= range; i++)
		{
			randomNumber = (int)((rand.nextInt((max - min) + 1) + min));
			sum = sum + randomNumber;
			System.out.print(randomNumber + " ");
		}
		System.out.println("\nAverage of the generated numbers: " + (sum/range));
		System.out.println("---------------------------------------------------------------------");
		
		
		
	//WHILE LOOP
		System.out.println("Part 2: while loop -- Average of user-entered integers using While loop");
		System.out.println("---------------------------------------------------------------------");
		
		int myNumber=0;
		int sum2 = 0;
		int counter = 0;
		
		System.out.println("Enter integers to average. Enter -1 when you're finished. ");
		
		while (myNumber!= -1)
		{
			System.out.print("Entry " + (counter+1) + ": ");
			myNumber = input.nextInt();
			sum2 = sum2 + myNumber; 
			counter++;
		}
		System.out.print("Number of entries: " + (counter-1));
		System.out.print("\nAverage of user-entered numbers: " + (sum2/(counter-1)));
		System.out.println("\n---------------------------------------------------------------------");

		
		
	//DO-WHILE LOOP
		System.out.println("Part 3: do-while loop -- Display menu until user chooses to exit");
		System.out.print("---------------------------------------------------------------------");
		System.out.println("\n==============================");
		int noomber;
		
		do
		{
			System.out.print("MENU\n");
			System.out.println("==============================");
			System.out.println("1: Choice 1");
			System.out.println("2: Choice 2");
			System.out.println("3: Choice 3");
			System.out.println("4: Exit");
			System.out.println("==============================");
			System.out.print("Enter 1, 2, 3 or 4 to exit: ");;
			noomber = input.nextInt();
		}	
			while (noomber!=4);
			System.out.print("Bye!");
	}
}
