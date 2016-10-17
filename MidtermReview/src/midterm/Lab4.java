package midterm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		
		int userInput;
		int age;
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("Enter the year you were born: ");
		
		
		while (true)
		{
			try{
				userInput=keyboard.nextInt();
				age=2016-userInput;
				System.out.println("Your approximate age is: " + age);
			}catch (InputMismatchException e){
				System.out.println("Enter Valid Number: ");
				keyboard.nextLine();
			}
		}
		
	
		

	}

}
