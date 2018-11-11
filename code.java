import java.util.InputMismatchException;
import java.util.Scanner;

public class FinancialAwareness {

	public static Scanner kb = new Scanner(System.in);
			
			
	public static double promptUser(String prompt) {
		System.out.println(prompt);
		
		boolean state = false;
		double input = 0.0;
		while (state==false) {
			String inputStr = kb.nextLine();
			
			try {
				try {
					int index =inputStr.indexOf("$");
					inputStr=inputStr.substring(index+1);
				}
				catch(NumberFormatException e) {
					
				}
				
				input = input + Double.parseDouble(inputStr.substring(0));
				state = true;
			}
			catch(InputMismatchException e) {
				System.out.println("You did not enter a vaild input");
			}
		}
		return input;
		
		
		
	}


	public static void main(String[] args) {
		String[] categories = {"housing","transportation","food","debt payments","personal & discretory costs","savings","utilites","clothing","medical costs"};
		double[] percent = {35,17.5,15,10,7.5,7.5,5,4,3};
		System.out.println("Welcome to Financial Awareness.");
		System.out.println("Please give us some info to start");
		double salary = promptUser("What is your annual net income? ");
		double[] spending = new double[categories.length];
		for(int i = 0; i < categories.length; i++) {
			spending[i] = promptUser("How much money do you spend on "+categories[i]+" each year?");
		}
		System.out.println("Here is your financial report:");
		double recomendation = 0.0;
		for(int i = 0; i < categories.length; i++) {
			recomendation = salary * (percent[i]/100);
			System.out.println("You plan on spending $"+spending[i]+" on "+categories[i]+" each year. /tWe recommend that you spend around $"+recomendation+" on "+categories[i]+" each year.");
		} 
	}

}

