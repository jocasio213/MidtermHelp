package midterm;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) throws IOException{
		Scanner keyboard = new Scanner (System.in);
		String userInput;
		int userNum;
		
		
		System.out.println("Enter a String message: ");
		userInput=keyboard.nextLine();
		
		System.out.println("Enter the number of keys to encode message: ");
		userNum=keyboard.nextInt();
		
		StringBuilder strb = new StringBuilder();
		
		for (int i=0; i<userInput.length(); i++)
		{
			char c=userInput.charAt(i);
			strb.append((char)(c + userNum));
			
		}
		
		System.out.println(strb);
		
		DataOutputStream output = new DataOutputStream(new FileOutputStream("secret.msg"));
		output.writeUTF(strb.toString());
		output.close();
		
	}

}
