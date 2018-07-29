import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		//method to show menu and get input from user
		runProgram();
	}

	private static void runProgram() {
		
		System.out.println("\n" +"1.Add user" + "\n" + "2.See users list");
		while(!reader.hasNextInt()) {
			System.out.println("Error: Enter just number");
			reader.next();}
		switch (reader.nextInt()) {
		
		case 1:
			addUser();
			break;

		case 2:
			System.out.println("1.Accountant list" + "\n" + "2.Mobile programmer list"+ "\n" + "3.Web programmer list");			
			while(!reader.hasNextInt()) {
				System.out.println("Error: Enter just number");
				reader.next();}
			switch (reader.nextInt()) {
			
			case 1:
				seeList("Accountant");
				break;
				
			case 2:
				seeList("MobileProgrammer");
				break;
				
			case 3:
				seeList("WebProgrammer");
				break;

			default:
				System.out.println("Input is not valid");
				runProgram();
				break;
			}
			break;

		default:
			System.out.println("Input is not valid");
			runProgram();
		}
	}

	public static void addUser() {
		
		//show menu to user and get user choice to add resume in lists
		System.out.println("Please select one of job title below" + "\n" + 
				"1.Accountant" + "\n" + 
				"2.Mobile Programmer"+ "\n" + 
				"3.Web Programmer" + "\n" + 
				"4.cancel");
		
		while(!reader.hasNextInt()) {
			System.out.println("Error: Enter just number");
			reader.next();}
		switch (reader.nextInt()) {
		
		// if input is "1" add a Accountant resume in Accountant.txt file
		case 1:
			
			// Create instance of Accountant
			Accountant accountant;;
			String name1;
			int masterNum1;

			System.out.println("Enter User name");
			name1 = reader.next();
			
			System.out.println("Enter User Mastercard number");
			
		// check if input is number or not
			while(!reader.hasNextInt()) {
				System.out.println("Error: Enter just number");
				reader.next();}
			masterNum1 = reader.nextInt();
			
			accountant = new Accountant(name1, masterNum1);
			
			System.out.println("Enter User years employed");
			while(!reader.hasNextInt()) {
				System.out.println("Error: Enter just number");
				reader.next();}
			accountant.setYearEmploy(reader.nextInt());
			
			System.out.println("Enter User last degree");
			accountant.setLastDegree(reader.next());
			
			System.out.println("do you want to save this record" + "\n" + "1.yes" + "\n" + "2.no");
			while(!reader.hasNextInt()) {
				System.out.println("Error: Enter just number");
				reader.next();}
			if (reader.nextInt() == 1) {
				printData("Accountant", "\n"+"Name: " + accountant.getName() +"\n" 
						 +"Mastercard number: " + accountant.getMasterNum()+ "\n" 
						 +"YearsEmployed: " + accountant.getYearEmploy() + "\n" 
						 +"Last degree: "+ accountant.getLastDegree()+ "\n"		);
				runProgram();}

			break;

		// if input is "1" add a MobileProgrammer resume in MobileProgrammer.txt file
		case 2:
			
			// Create instance of MobileProgrammer
			MobileProgrammer mobileProgrammer;
			String name2;
			int masterNum2;


			System.out.println("Enter User name");
			name2 = reader.next();
			
			System.out.println("Enter User Mastercard number");
			while(!reader.hasNextInt()) {
				System.out.println("Error: Enter just number");
				reader.next();}
			masterNum2 = reader.nextInt();
			
			mobileProgrammer = new MobileProgrammer(name2, masterNum2);
			
			System.out.println("Enter User years employed");
			while(!reader.hasNextInt()) {
				System.out.println("Error: Enter just number");
				reader.next();}
			mobileProgrammer.setYearEmploy(reader.nextInt());
			
			System.out.println("Enter User last job");
			mobileProgrammer.setLastJob(reader.next());
			
			System.out.println("Enter User app released number");
			while(!reader.hasNextInt()) {
				System.out.println("Error: Enter just number");
				reader.next();}
			mobileProgrammer.setAppReleased(reader.nextInt());
			
			System.out.println("do you want to save this record" + "\n" + "1.yes" + "\n" + "2.no");
			while(!reader.hasNextInt()) {
				System.out.println("Error: Enter just number");
				reader.next();}
			if (reader.nextInt() == 1) {
				printData("MobileProgrammer", "\n"+"Name: " + mobileProgrammer.getName() + "\n"
						 +"Mastercard number: "+ mobileProgrammer.getMasterNum() + "\n" 
						 +"YearsEmployed: " + mobileProgrammer.getYearEmploy()+ "\n" 
						 +"Last job: " + mobileProgrammer.getLastJob() + "\n" 
						 +"App released: "+ mobileProgrammer.getAppReleased()+ "\n");
				runProgram();}
			break;

		// if input is "1" add a WebProgrammer resume in WebProgrammer.txt file
		case 3:
			
			// Create instance of WebProgrammer
			WebProgrammer webProgrammer;
			String name3;
			int masterNum3;
			
			System.out.println("Enter User name");			
			while(!reader.hasNextInt()) {
				System.out.println("Error: Enter just number");
				reader.next();}
			name3 = reader.next();
			
			System.out.println("Enter User Mastercard number");			
			while(!reader.hasNextInt()) {
				System.out.println("Error: Enter just number");
				reader.next();}
			masterNum3 = reader.nextInt();
			
			webProgrammer = new WebProgrammer(name3, masterNum3);
			
			System.out.println("Enter User years employed");
			while(!reader.hasNextInt()) {
				System.out.println("Error: Enter just number");
				reader.next();}
			webProgrammer.setYearEmploy(reader.nextInt());
		
			System.out.println("Enter User last job");
			webProgrammer.setLastJob(reader.next());
			
			System.out.println("Enter User program language");
			webProgrammer.setProgramLanguage(reader.next());
			
			System.out.println("do you want to save this record" + "\n" + "1.yes" + "\n" + "2.no");
			while(!reader.hasNextInt()) {
				System.out.println("Error: Enter just number");
				reader.next();}
			if (reader.nextInt() == 1) {
				printData("WebProgrammer","\n"+"Name: " + webProgrammer.getName() + "\n" 
						 +"Mastercard number: " + webProgrammer.getMasterNum() + "\n" 
						 +"YearsEmployed: " + webProgrammer.getYearEmploy() + "\n"
						 +"Last job: " + webProgrammer.getLastJob() + "\n" 
						 +"Program language: " + webProgrammer.getProgramLanguage()+ "\n");
				runProgram();}
			break;

		case 4:
			runProgram();

			
		default:

			System.out.println("Your input is not valid");
			addUser();
			break;
		}

	}

	private static void seeList(String fileName) {
		try {
			FileReader fileReader = new FileReader(".\\"+ fileName+".txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String string;
			while ((string = bufferedReader.readLine()) != null) {
				System.out.println(string);
			}
			runProgram();
			
		} catch (FileNotFoundException e) {
			
			//if file not created yet, show this error
			System.out.println("List is empty!");
			runProgram();

		} catch (IOException e) {
			System.out.println("Error!");
			runProgram();
		}

	}

	private static void printData(String fileName, String data) {
		try {
			File file = new File(".\\"+ fileName +".txt");
			FileWriter writer = new FileWriter(file, true);
			writer.write(data);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
