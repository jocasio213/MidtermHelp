package midterm;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab1 {

	public static void main(String[] args) throws IOException{
		
		Scanner keyboard = new Scanner (System.in);
		File file = new File ("people.csv");
		 Scanner readFile = new Scanner(file);
		 
		 int max=Integer.MIN_VALUE;
		 double total=0;
		 double average=0;
		 String maxName="";
		 int count=0;
		 //StringTokenizer strTokenizer = new StringTokenizer();
		
		while (readFile.hasNext())
		{
			String line= readFile.nextLine();
			count++;
			StringTokenizer tokens = new StringTokenizer(line, ",");
			String name= tokens.nextToken();
			int val1= Integer.parseInt(tokens.nextToken());
			double val2= Double.parseDouble(tokens.nextToken());
			
			System.out.println(line);
			
			if (val1>max)
			{
				max=val1;
				maxName=name;
			}
			 
			total+=val2;
			
		}
		
		if(count >0)
		{
			average=total/count;
		}
		
		System.out.println(maxName+"\n"+average);

	}

}
