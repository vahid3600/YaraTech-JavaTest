import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		runProgram();
	}

	private static void runProgram() {
		System.out.println("\n" +"1.Add user" + "\n" + "2.See users list");
		switch (reader.nextInt()) {
		case 1:
			addUser();
			break;

		case 2:
			System.out.println("1.Accountant list" + "\n" + "2.Mobile programmer list"+ "\n" + "3.Web programmer list");
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
			Accountant accountant = new Accountant();

			System.out.println("Enter User name");
			accountant.setName(reader.next());
			System.out.println("Enter User Mastercard number");
			
		// check if input is number or not
			while(!reader.hasNextInt()) {
				System.out.println("Error: Enter just number");
				reader.next();}
			accountant.setMasterNum(reader.nextInt());
			System.out.println("Enter User years employed");
			while(!reader.hasNextInt()) {
				System.out.println("Error: Enter just number");
				reader.next();}
			accountant.setYearEmploy(reader.nextInt());
			System.out.println("Enter User last degree");
			accountant.setLastDegree(reader.next());

			System.out.println("do you want to save this record" + "\n" + "1.yes" + "\n" + "2.no");
			if (reader.nextInt() == 1) {
				printData("Accountant", "\n"+"Name: " + accountant.getName() +"\n" 
						 +"Mastercard number: " + accountant.getMasterNum()+ "\n" 
						 +"YearsEmployed: " + accountant.getYearEmploy() + "\n" 
						 +"Last degree: "+ accountant.getLastDegree()+ "\n"		);
				runProgram();}

			break;

		// if input is "1" add a MobileProgrammer resume in MobileProgrammer.txt file
		case 2:
			MobileProgrammer mobileProgrammer = new MobileProgrammer();

			System.out.println("Enter User name");
			mobileProgrammer.setName(reader.next());
			System.out.println("Enter User Mastercard number");
			while(!reader.hasNextInt()) {
				System.out.println("Error: Enter just number");
				reader.next();}
			mobileProgrammer.setMasterNum(reader.nextInt());
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
			WebProgrammer webProgrammer = new WebProgrammer();
			
			System.out.println("Enter User name");
			webProgrammer.setName(reader.next());
			System.out.println("Enter User Mastercard number");
			while(!reader.hasNextInt()) {
				System.out.println("Error: Enter just number");
				reader.next();}
			webProgrammer.setMasterNum(reader.nextInt());
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
