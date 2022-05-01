import java.util.ArrayList;

/**
 * 
 * @author John Maksuta
 * @course CPS231-610
 * @Instructor Dr. Tankeh
 * @since 05/01/2022
 * @purpose - This is the main class to demonstrate the EmployeeBank class.
 *
 */
public class Main {

	// This is the data that we are using for employees.
	// Index Account_no First_Name Last_Name Email Address
	// 1 10000 Peter Esposito peter.esposito@sunydutchess.edu
	// 2 10001 Akram Gafur akram.gafur@sunydutchess.edu
	// 3 10010 Caleb Herrera caleb.herrera@sunydutchess.edu
	// 4 10011 John Maksuta john.maksuta@sunydutchess.edu
	// 5 10100 Viridiana Marin Herrera viridiana.herrera@sunydutchess.edu
	// 6 10101 Brandon Mohammed brandon.mohammed@sunydutchess.edu
	// 7 10111 Christopher Shenton christopher.shenton@sunydutchess.edu
	// 8 11000 Lucas Stoffel lucas.stoffel@sunydutchess.edu
	// 9 11001 Appolo Tankeh appolo.tankeh@sunydutchess.edu

	public static void main(String[] args) {

		String msgTitle = "\n\nExample%d\n";
		/* Example 1 */
		System.out.println(String.format(msgTitle, 1));
		example1();
		/* Example 2 */
		System.out.println(String.format(msgTitle, 2));
		example2();
		/* Example 3 */
		System.out.println(String.format(msgTitle, 3));
		example3();
		/* Example 4 */
		System.out.println(String.format(msgTitle, 4));
		example4();
		/* Example 5 */
		System.out.println(String.format(msgTitle, 5));
		example5();
		/* Example 6 */
		System.out.println(String.format(msgTitle, 6));
		example6();
		/* Example 7 */
		System.out.println(String.format(msgTitle, 7));
		example7();
		/* Example 8 */
		System.out.println(String.format(msgTitle, 8));
		example8();

		/* Example 9 */
		System.out.println(String.format(msgTitle, 9));
		example9();

	}

	private static void example1() {
		/* Example 1 */
		/* Creating a new Employee Bank */
		EmployeeBank emp = new EmployeeBank();
		emp.setEmployeeNo(4);
		emp.setAccountNo(10011);
		emp.setFirstName("John");
		emp.setLastName("Maksuta");
		emp.setEmailAddress("john.maksuta@sunydutchess.edu");

		System.out.println(String.format(
				"Employee#: %d, Account#: %d, Name: %s %s, Email: %s",
				emp.getEmployeeNo(), emp.getAccountNo(), emp.getFirstName(),
				emp.getLastName(), emp.getEmailAddress()));
	}

	private static void example2() {
		/* Example 2 */
		EmployeeBank emp = new EmployeeBank(4, 10011, "John", "Maksuta",
				"john.maksuta@sunydutchess.edu");

		System.out.println(String.format(
				"Employee#: %d, Account#: %d, Name: %s %s, Email: %s",
				emp.getEmployeeNo(), emp.getAccountNo(), emp.getFirstName(),
				emp.getLastName(), emp.getEmailAddress()));

	}

	private static void example3() {
		/* Example 3 */
		EmployeeBank emp1, emp2;

		emp1 = new EmployeeBank(4, 10011, "John", "Maksuta",
				"john.maksuta@sunydutchess.edu");
		System.out.println(String.format(
				"Employee#: %d, Account#: %d, Name: %s %s, Email: %s",
				emp1.getEmployeeNo(), emp1.getAccountNo(), emp1.getFirstName(),
				emp1.getLastName(), emp1.getEmailAddress()));

		emp2 = new EmployeeBank(2, 10001, "Akram", "Gafur",
				"akram.gafur@sunydutchess.edu");

		System.out.println(String.format(
				"Employee#: %d, Account#: %d, Name: %s %s, Email: %s",
				emp2.getEmployeeNo(), emp2.getAccountNo(), emp2.getFirstName(),
				emp2.getLastName(), emp2.getEmailAddress()));

	}

	private static void example4() {
		/* Example 4 */
		EmployeeBank emp1;

		emp1 = new EmployeeBank(4, 10011, "John", "Maksuta",
				"john.maksuta@sunydutchess.edu");
		System.out.println("Initials: " + emp1.getInitials());

	}

	private static void example5() {
		/* Example 5 */
		EmployeeBank[] e = new EmployeeBank[3];
		e[0] = new EmployeeBank(4, 10011, "John", "Maksuta",
				"john.maksuta@sunydutchess.edu");
		e[1] = new EmployeeBank(2, 10001, "Akram", "Gafur",
				"akram.gafur@sunydutchess.edu");
		e[2] = new EmployeeBank(3, 10010, "Caleb", "Herrera",
				"caleb.herrera@sunydutchess.edu");

		for (int n = 0; n < e.length; n++) {
			System.out.println("Initials: " + e[n].getInitials());
		}

	}

	private static void example6() {
		/* Example 6 */
		EmployeeBank e1, e2;
		e1 = new EmployeeBank(4, 10011, "John", "Maksuta",
				"john.maksuta@sunydutchess.edu");
		e2 = new EmployeeBank(1, 10000, "Peter", "Esposito",
				"peter.esposito@sunydutchess.edu");

		if (e1 == e2) {
			System.out.println("The two employees are the same.");
		} else {
			System.out.println("The two employees are different.");
		}

	}

	private static void example7() {
		/* Example 7 */
		EmployeeBank e1, e2;
		e1 = new EmployeeBank(4, 10011, "John", "Maksuta",
				"john.maksuta@sunydutchess.edu");
		e2 = new EmployeeBank(1, 10000, "Peter", "Esposito",
				"peter.esposito@sunydutchess.edu");

		if (e1.equals(e2)) {
			System.out.println("The two employees are the same.");
		} else {
			System.out.println("The two employees are different.");
		}

	}

	private static void example8() {
		/* Example 8 */
		EmployeeBank e1, e2;
		e1 = new EmployeeBank(4, 10011, "John", "Maksuta",
				"john.maksuta@sunydutchess.edu");
		e2 = new EmployeeBank(2, 10001, "Akram", "Gafur",
				"akram.gafur@sunydutchess.edu");
		e1.setEmployer("Dutchess Community College");

		System.out.println("The Employer of " + e1.getFirstName() + " "
				+ e1.getLastName() + " is " + e1.getEmployer());
		System.out.println("The Employer of " + e2.getFirstName() + " "
				+ e2.getLastName() + " is " + e2.getEmployer());
	}

	private static void example9() {
		// Testing array of EmployeBank class
		ArrayList<EmployeeBank> employees = new ArrayList<EmployeeBank>();
		// This is the data that we are using for employees.
		// Index Account_no First_Name Last_Name Email Address
		employees.add(new EmployeeBank(employees.size() + 1, 10000, "Peter",
				"Esposito", "peter.esposito@sunydutchess.edu", 200.25));
		employees.add(new EmployeeBank(employees.size() + 1, 10001, "Akram",
				"Gafur", "akram.gafur@sunydutchess.edu", 300.23));
		employees.add(new EmployeeBank(employees.size() + 1, 10010, "Caleb",
				"Herrera", "caleb.herrera@sunydutchess.edu", 1000.3));
		employees.add(new EmployeeBank(employees.size() + 1, 10100, "Viridiana",
				"Marin Herrera", "viridiana.herrera@sunydutchess.edu", 1200.4));
		employees.add(new EmployeeBank(employees.size() + 1, 10101, "Brandon",
				"Mohammed", "brandon.mohammed@sunydutchess.edu", 674.32));
		employees.add(new EmployeeBank(employees.size() + 1, 10111,
				"Christopher", "Shenton",
				"christopher.shenton@sunydutchess.edu", 934.2));
		employees.add(new EmployeeBank(employees.size() + 1, 11000, "Lucas",
				"Stoffel", "lucas.stoffel@sunydutchess.edu", 154.32));
		employees.add(new EmployeeBank(employees.size() + 1, 11001, "Appolo",
				"Tankeh", "appolo.tankeh@sunydutchess.edu", 500.32));

		// print the list of employees
		System.out.println("Employee List:\n" + employees);

		// create a new employee.
		EmployeeBank newEmployee = new EmployeeBank(employees.size() + 1, 10011,
				"John", "Maksuta", "john.maksuta@sunydutchess.edu", 100);
		employees.add(newEmployee);
		System.out.println("New Employee:\n" + newEmployee);

		// print the list of employees, the highest and second highest balances.
		System.out.println("Employee List:\n" + employees);
		System.out.println("Highest Balance:\n"
				+ employees.get(getHighestBalanceIndex(employees)));
		System.out.println("Second Highest Balance:\n"
				+ employees.get(getSecondHighestBalanceIndex(employees)));

		// deposit $500 to the account at index 1.
		employees.get(1).deposit(500.0);

		// print the list of employees, the highest and second highest balances.
		System.out.println("Employee List:\n" + employees);
		System.out.println("Highest Balance:\n"
				+ employees.get(getHighestBalanceIndex(employees)));
		System.out.println("Second Highest Balance:\n"
				+ employees.get(getSecondHighestBalanceIndex(employees)));

		employees.get(3).withdraw(300.0);

		// print the list of employees, the highest and second highest balances.
		System.out.println("Employee List:\n" + employees);
		System.out.println("Highest Balance:\n"
				+ employees.get(getHighestBalanceIndex(employees)));
		System.out.println("Second Highest Balance:\n"
				+ employees.get(getSecondHighestBalanceIndex(employees)));
	}

	/**
	 * This searches the input array for the highest value, then returns the
	 * index of the value in the array.
	 * 
	 * @param balances
	 *            - The array of balances to search.
	 * @return - the index of the value in the array.
	 */
	private static int getHighestBalanceIndex(EmployeeBank[] balances) {
		double bal = 0;
		int index = -1;
		for (int n = 0; n < balances.length; n++) {
			if (balances[n].getBalance() > bal) {
				bal = balances[n].getBalance();
				index = n;
			}
		}
		return index;
	}

	/**
	 * This searches the input array for the second highest value, then returns
	 * the index of the value in the array.
	 * 
	 * @param balances
	 *            - The array of balances to search.
	 * @return - the index of the value in the array.
	 */
	private static int getSecondHighestBalanceIndex(EmployeeBank[] balances) {
		int highestBalance = getHighestBalanceIndex(balances);
		double bal = 0;
		int index = -1;
		for (int n = 0; n < balances.length; n++) {
			if (balances[n].getBalance() > bal && n != highestBalance) {
				bal = balances[n].getBalance();
				index = n;
			}
		}
		return index;
	}

	/**
	 * This searches the input ArrayList for the highest value, then returns the
	 * index of the value in the ArrayList.
	 * 
	 * @param balances
	 *            - The ArrayList of balances to search.
	 * @return - the index of the value in the ArrayList.
	 */
	private static int getHighestBalanceIndex(
			ArrayList<EmployeeBank> balances) {
		double bal = 0;
		int index = -1;
		for (int n = 0; n < balances.size(); n++) {
			if (balances.get(n).getBalance() > bal) {
				bal = balances.get(n).getBalance();
				index = n;
			}
		}
		return index;
	}

	/**
	 * This searches the input ArrayList for the second highest value, then
	 * returns the index of the value in the ArrayList.
	 * 
	 * @param balances
	 *            - The ArrayList of balances to search.
	 * @return - the index of the value in the ArrayList.
	 */
	private static int getSecondHighestBalanceIndex(
			ArrayList<EmployeeBank> balances) {
		int highestBalance = getHighestBalanceIndex(balances);
		double bal = 0;
		int index = -1;
		for (int n = 0; n < balances.size(); n++) {
			if (balances.get(n).getBalance() > bal && n != highestBalance) {
				bal = balances.get(n).getBalance();
				index = n;
			}
		}
		return index;
	}

}
