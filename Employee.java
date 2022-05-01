
public class Employee extends Person {

	/**
	 * The employee number or index
	 */
	private int employeeNo;

	/**
	 * the account number.
	 */
	private int accountNo;

	/**
	 * The email address
	 */
	private String emailAddress;

	/**
	 * The initial capital.
	 */
	private double initialCapital;

	/**
	 * The employer.
	 */
	public static String employer;

	public int getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public double getInitialCapital() {
		return initialCapital;
	}

	public void setInitialCapital(double initialCapital) {
		this.initialCapital = initialCapital;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		Employee.employer = employer;
	}

	public Employee() {
		// initialize fields.
		// this("(2) Invoke Employee’s overloaded constructor");
		this.employeeNo = 0;
		this.accountNo = 0;
		this.emailAddress = "";
		this.initialCapital = 0.0;
		// System.out.println("(3) Employee's no arg constructor is invoked");
	}

	public Employee(String s) {
		super();
		System.out.println(s);
	}

	public Employee(int employeeNumber, int accountNumber, String firstName,
			String lastName, String emailAddress) {
		this();
		this.employeeNo = employeeNumber;
		this.accountNo = accountNumber;
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.emailAddress = emailAddress;
	}

	public Employee(int employeeNumber, int accountNumber, String firstName,
			String lastName, String emailAddress, double initialCapital) {
		this();
		this.employeeNo = employeeNumber;
		this.accountNo = accountNumber;
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.emailAddress = emailAddress;
		this.initialCapital = initialCapital;
	}

	public String getInitials() {
		String result = "";
		if (!getFirstName().isEmpty()) {
			result += this.getFirstName().charAt(0) + ".";
		}
		if (!this.getLastName().isEmpty()) {
			result += this.getLastName().charAt(0) + ".";
		}
		return result;
	}

	public boolean equals(Employee that) {
		return (this.employeeNo == that.employeeNo
				&& this.accountNo == that.accountNo
				&& this.getFirstName().equals(that.getFirstName())
				&& this.getLastName().equals(that.getLastName())
				&& this.emailAddress.equals(that.emailAddress));
	}

}
