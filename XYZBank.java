import java.util.Scanner;

public class XYZBank {
//This class is the main class, the main method. It will allow user to input loan records.
	public static void main(String[] args) {
		int records;
		String record_id;
		String customer_id;
		String type_loan;
		double int_rate;
		int amount_left;
		int years_left;
		//declaration of variables to store input from user
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Maximum number of Records: ");
		records = scanner.nextInt();//this line reads the max number of records(to create an array in the next line)
		Record[] arr = new Record[records];//create an array (with the number of records just read) to store the records. Each record is implemented as an instance of Record class.
		//Created a scanner object to read input from user
		
		for(int i=0; i<records; i++) {
			System.out.println("Enter the " + (i+1) + " user's Record ID (format:XXXXXX, where X is a digit): ");
            record_id = scanner.next();
            //a for loop to input records (as many times as the number of records). It also prompts the user to enter the record details

            while (!(record_id.length()==6 && record_id.substring(0,6).matches("\\d+"))) {
                System.out.println("Invalid Record ID format!Please enter again: ");//it will show continuosly this and prompt the user the enter the right format. It does with every attribute.
                record_id = scanner.next();
            }
            //error handling for recordID

            System.out.println("Enter the " + (i+1) + " user's Customer ID (format:AAAXXX, where A is a capital letter, and X a digit): ");
            customer_id = scanner.next();
            //asks user to input customerID. It does the same with every other attribute.

            
            while (!(customer_id.length() == 6 && customer_id.substring(0,3).matches("[A-Z]+")&& customer_id.substring(3,6).matches("\\d+"))) {
                System.out.println("Invalid Customer ID format!Please enter again: ");
                customer_id = scanner.next();
            }//error handling for customerID

            System.out.println("Enter the " + (i+1) + " user's Loan Type(Auto, Builder, Mortgage, Personal, Other): ");
            type_loan = scanner.next();

            
            while (!(type_loan.equalsIgnoreCase("Auto")||type_loan.equalsIgnoreCase("Builder")||type_loan.equalsIgnoreCase("Mortgage")||type_loan.equalsIgnoreCase("Personal")||type_loan.equalsIgnoreCase("Other"))) {
                System.out.println("Invalid Loan Type!Please enter again: ");
                type_loan = scanner.next();
            }//error handling for loantype

            System.out.println("Enter the " + (i+1) + " user's Interest Rate: ");

            
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input for Interest Rate!Please enter again: ");
                scanner.next();
            }//error handling for interestrate
            
            int_rate = scanner.nextDouble();

            System.out.println("Enter the " + (i+1) + " user's amount left to pay(in thousands pounds): ");

            
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input for amount left!Please enter again: ");
                scanner.next();
            }//error handling for amountleft
            
            amount_left = scanner.nextInt();

            System.out.println("Enter the " + (i+1) + " user's loan term left(in years): ");

            
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input for years left!Please enter again: ");
                scanner.next();
            }//error handling for yearsleft
            
            years_left = scanner.nextInt();

			
		Record thisRec = new Record();
		thisRec.setRecord_id(record_id);
		thisRec.setCustomer_id(customer_id);
		thisRec.setAmount_left(amount_left);
		thisRec.setInt_rate(int_rate);
		thisRec.setType_loan(type_loan);
		thisRec.setYears_left(years_left);
		arr[i] = thisRec;
		}
		//create a new record with the input from user and add it to the array
		
		System.out.print("Maximum number of Records: "+records+"\n");
		System.out.print("Registered records: " + Record.getCount()+"\n");
		System.out.print("RecordID \t CustomerID \t LoanType \t IntRate \t AmountLeft \t TimeLeft \n");
		//it outputs all the records in a tabular form(backslash t is a tab, and backslash n is a new line)
		
		for(Record rec : arr) {
			System.out.print(rec.getRecord_id()+"\t\t "+rec.getCustomer_id()+"\t\t "+rec.getType_loan()+"\t\t "+rec.getInt_rate()+"\t\t "+rec.getAmount_left()+"\t\t "+rec.getYears_left()+"\n ");
		}
		//it outputs details for each record in the array
		scanner.close();
		//closes the scanner
	}
}
