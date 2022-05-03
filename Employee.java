
public class Employee extends Person {

	/**
	 * The employee number or index.
	 */
	private int employeeNo;

	/**
	 * The account number.
	 */
	private int accountNo;

	/**
	 * The email address.
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

	/**
	 * Gets the employee no.
	 * 
	 * @return
	 */
	public int getEmployeeNo() {
		return employeeNo;
	}

	/**
	 * Sets the employee no.
	 * 
	 * @param employeeNo
	 */
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

	/**
	 * Gets the account no.
	 * 
	 * @return
	 */
	public int getAccountNo() {
		return accountNo;
	}

	/**
	 * Sets the account no.
	 * 
	 * @param accountNo
	 */
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * Gets the email address.
	 * 
	 * @return
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Set the email address.
	 * 
	 * @param emailAddress
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * Gets the initial capital.
	 * 
	 * @return
	 */
	public double getInitialCapital() {
		return initialCapital;
	}

	/**
	 * Sets the initial capital.
	 * 
	 * @param initialCapital
	 */
	public void setInitialCapital(double initialCapital) {
		this.initialCapital = initialCapital;
	}

	/**
	 * Gets the employer.
	 * 
	 * @return
	 */
	public String getEmployer() {
		return employer;
	}

	/**
	 * Sets the employer.
	 * 
	 * @param employer
	 */
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

	/**
	 * Gets the employee's initials of the first name and last name.
	 * 
	 * @return - The employee's initials.
	 */
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

	/**
	 * Compares the this instance of Employee against another.
	 * 
	 * @param that
	 *            - The instance of Employee to compare to.
	 * @return - True if the objects are the same, False if they are not.
	 */
	public boolean equals(Employee that) {
		return (this.employeeNo == that.employeeNo
				&& this.accountNo == that.accountNo
				&& this.getFirstName().equals(that.getFirstName())
				&& this.getLastName().equals(that.getLastName())
				&& this.emailAddress.equals(that.emailAddress));
	}

}
