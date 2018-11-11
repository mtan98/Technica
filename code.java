package techinca;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinancialWhatIfs {
	public static Scanner kb = new Scanner(System.in);
	public static double promptUser(String prompt, int type) {
		//type=1 for inputs that are currency
		//type=2 for choices being one or two
		System.out.println(prompt);
		if(type==1) {
			boolean state = false;
			while (state==false) {
				String inputStr = kb.nextLine();
				try {
					int index = inputStr.indexOf("$");
					double input = Double.parseDouble(inputStr.substring(index+1));
					state=true;
					return input;
				}
				catch(InputMismatchException e) {
					System.out.println("You did not enter a vaild input");
					
				}
			}
		}
		else if(type ==2) {
			boolean state = false;
			while (state==false) {
				String inputStr = kb.nextLine();
				try {
					double input = Double.parseDouble(inputStr);
					if(input==1.0||input==2.0) {
						state=true;
						return input;
					}
					
				}
				catch(InputMismatchException e) {
					System.out.println("You did not enter a vaild input. You can enter either 1 or 2");
					
				}
			}
			
		}
		return-1.0;
		
	}
	
	public static ArrayList getCategories() {
		String [] categories= new String[] {"housing","children","pets","healthcare","taxes","other","savings"};
		System.out.println("Here are the categories that we will use in the simulation: ");
		ArrayList<String> subjects = new ArrayList<String>();
		for(int i= 0; i<categories.length; i++) {
			subjects.add(categories[i]);
			System.out.println(categories[i]);
		}
		int choice =(int) promptUser("Would you like to add a category? /n Press 1 if you would like to and 2 if you do not want to",2);
		if(choice==1)
			boolean done = false;
			do {
				System.out.println("Enter the category you want to add. Type DONE when you are done adding categories");
				String addCat=kb.nextLine();
				if(addCat.equals("DONE")==false) {
					subjects.add(addCat);
				}
				else {
					done=true;
				}
			}while(done!=true);
		return subjects;		
				
	}
	public static void simulation(ArrayList categories, ArrayList costs, ) {
		
	}
	public static ArrayList getRecommended(ArrayList categories) {
		S
		ArrayList<Double> recommended = new ArrayList<Double>();
		
		recommmended.add()
		
	}
	public static ArrayList getCosts(ArrayList categories,ArrayList recommended) {
		ArrayList<Double>costs=new ArrayList();
		double income= promptUser("Please enter your income: ",1);
		double advised = Double.parseDouble(recommended.get(i))*income;
		for (int i=0;i<=categories.length;i++) {
			double amount = promptUser("How much do you plan on spending on "+ categories.get(i),1);
			System.out.println("The average person with your income spends $"+ advised +" annually on "+category.get(i));
			if(amount<advised) {
				double difference = advised-amount;
				System.out.println("You spent $"+ "difference less that what is recommended /n Make sure that you budget enough of your ");
				
			}
			else if()
			
			
		}
		return costs;
	}

					
				


	public static void main(String[] args) {
		System.out.println("Welcome to Financial Whatifs /nPlease give us some info to start");
		ArrayList categories =getCategories();
		ArrayList recommended = getRecommended();
		
		
		
	}

}
/*for(int i = 0; i < categories.length; i++) {
			System.out.println("Percent of your salary spent on "+categories[i]+":");
			percent = (int)((spending[i]/salary)*100);
			System.out.println(percent);
		}*/
