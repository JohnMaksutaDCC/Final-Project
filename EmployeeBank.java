/**
 * 
 * @author John Maksuta
 * @course CPS231-610
 * @Instructor Dr. Tankeh
 * @since 05/01/2022
 * @purpose - This is the new Employee Bank class that inherits (extends)
 *          Employee and has a BankAccount field which holds the bank account
 *          and the methods to deposit and withdraw call the methods in the
 *          field.
 *
 */
public class EmployeeBank extends Employee {

	/**
	 * This is the employeeBank's bank account.
	 */
	private BankAccount bankAccount;

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public double getBalance() {
		return this.bankAccount.getBalance();
	}

	public EmployeeBank() {
		super();
	}

	public EmployeeBank(int employeeNumber, int accountNumber, String firstName,
			String lastName, String emailAddress, double initialCapital) {
		super(employeeNumber, accountNumber, firstName, lastName, emailAddress,
				initialCapital);
		this.bankAccount = new BankAccount(initialCapital);
	}

	public EmployeeBank(int employeeNumber, int accountNumber, String firstName,
			String lastName, String emailAddress) {
		super(employeeNumber, accountNumber, firstName, lastName, emailAddress);
		this.bankAccount = new BankAccount(this.getInitialCapital());
	}

	public EmployeeBank(String s) {
		super(s);
		this.bankAccount = new BankAccount(this.getInitialCapital());
	}

	/**
	 * This method deposits money from the employeeBank's BankAccount.
	 * 
	 * @param amount
	 *            - The amount to withdraw.
	 */
	public void deposit(double amount) {
		System.out.println(String.format("Depositing $%.2f to Act# %d\n",
				amount, this.getAccountNo()));
		this.bankAccount.deposit(amount);
	}

	/**
	 * This method deposits money from the employeeBank's BankAccount.
	 * 
	 * @param amount
	 *            - The amount to withdraw.
	 */
	public void deposit(String amount) {
		System.out.println(String.format("Depositing $%.2f to Act# %d\n",
				amount, this.getAccountNo()));
		this.bankAccount.deposit(amount);
	}

	/**
	 * This method withdraws money from the employeeBank's BankAccount.
	 * 
	 * @param amount
	 *            - The amount to withdraw.
	 */
	public void withdraw(double amount) {
		System.out.println(String.format("Withdrawing $%.2f from Act# %d\n",
				amount, this.getAccountNo()));
		this.bankAccount.withdraw(amount);
	}

	/**
	 * This method withdraws money from the employeeBank's BankAccount.
	 * 
	 * @param amount
	 *            - The amount to withdraw.
	 */
	public void withdraw(String amount) {
		System.out.println(String.format("Withdrawing $%.2f from Act# %d\n",
				amount, this.getAccountNo()));
		this.bankAccount.withdraw(amount);
	}

	@Override
	public String toString() {
		return String.format(
				"Employee#: %d, Account#: %d, Name: %s %s, Email: %s, Balance: $%.2f",
				this.getEmployeeNo(), this.getAccountNo(), this.getFirstName(),
				this.getLastName(), this.getEmailAddress(),
				this.bankAccount.getBalance()) + "\n";
	}
}
