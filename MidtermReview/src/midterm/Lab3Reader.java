package midterm;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Lab3Reader {

	public static void main(String[] args) throws IOException {

		Scanner keyboard = new Scanner(System.in);

		int userNum = 0;

		System.out.print("Enter the Right keys to decode the Message:");
		userNum = keyboard.nextInt();

		DataInputStream input = new DataInputStream(new FileInputStream("secret.msg"));
		//System.out.println(input.readUTF());
		

		StringBuilder strb = new StringBuilder();
		
		while (input.available()>0) {
			String Line = input.readUTF();
			System.out.println(Line);
			
			for (int i=0; i<Line.length(); i++){
				char c=Line.charAt(i);
				strb.append((char)(c - userNum));
			}
		}
		
		System.out.println(strb);
		
		input.close();

	}

}
