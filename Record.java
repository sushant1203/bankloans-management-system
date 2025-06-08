public class Record {
//I did class declaration here:every program consists of at least one class that you define. Class name or identifier is "Record".
	
	private String record_id;
	private String customer_id;
	private String type_loan;
	private double int_rate;
	private int amount_left;
	private int years_left;
	private static int counter;
/**class' private properties for information on the loan record
	*Every private property has its unique Identifier according to the characteristics requested.
	The last line is to track the total number of records created
	*/
	
	
	public static int getCount() {
		return counter;
	}
	//returns the total number of records created
	
	public Record() {
		record_id="XXXXXX";
		customer_id="AAAXXX";
		type_loan="None";
		int_rate=0;
		amount_left=0;
		years_left=0;
	}
	/**
	 Setting of default values:
	 A constructor that creates a new loan record with default values for each attribute
	 */
	
	public Record(String record_id, String customer_id, String type_loan, double int_rate, int amount_left, int years_left) {
		setRecord_id(record_id);
		setCustomer_id(customer_id);
		setType_loan(type_loan);
		setInt_rate(int_rate);
		setAmount_left(amount_left);
		setYears_left(years_left);
		++counter;
	}
	//sets every attribute with validation(if they meet the criteria) and at the end it increments the total count of records
	
	public String getRecord_id() {
		return record_id;
	}
	//it retrieves and returns the record ID. Does the same with every other attribute.

	public void setRecord_id(String record_id) {
		if(record_id.length()==6 && record_id.substring(0,6).matches("\\d+")) {
			this.record_id = record_id;
		}
	//sets the record ID if it meets the specific criteria. Does the same with every other attribute.
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		if(customer_id.length() == 6 && customer_id.substring(0,3).matches("[A-Z]+")&& customer_id.substring(3,6).matches("\\d+")){
			this.customer_id = customer_id;
		}
		
	}

	public String getType_loan() {
		return type_loan;
	}

	public void setType_loan(String type_loan) {
		if(type_loan.equalsIgnoreCase("Auto")||type_loan.equalsIgnoreCase("Builder")||type_loan.equalsIgnoreCase("Mortgage")||type_loan.equalsIgnoreCase("Personal")||type_loan.equalsIgnoreCase("Other")) {
			this.type_loan = type_loan;
		}
			
		
	}

	public double getInt_rate() {
		return int_rate;
	}

	public void setInt_rate(double int_rate) {
		if(int_rate>=0){
			this.int_rate = int_rate;
		}
		
	}

	public int getAmount_left() {
		return amount_left;
	}

	public void setAmount_left(int amount_left) {
		if(amount_left>=0) {
			this.amount_left = amount_left;
		}
	
	}

	public int getYears_left() {
		return years_left;
	}

	public void setYears_left(int years_left) {
		if(years_left>=0) {
			this.years_left = years_left;
		}
	}
}

//this part of the code is to set and get record attributes (input from user) with validation.
//for the last 3 attributes(int_rate, amount_left,years_left) it just checks if its the correct data type and non negative because these data types (doubles and integers) have simpler validation requirements