John Maksuta
Dr. Tankeh
CPS231-610 
1 May 2022
Final Project

This is the URL for the source code in GitHub:
(https://github.com/JohnMaksutaDCC/Final-Project.git)
I created the EmployeeBank class which inherits from the Employee class and contains a field instance of BankAccount. It has methods to deposit and withdraw money from the account. I included a Main class in Main.java which has the test code for the EmployeeBank.

Git Clone Repository Instructions:
(To Clone the repository, you must have Git installed.)
1.	Open Git bash in a root directory where you want to create the project directory
2.	Clone the repository using the following command:
git clone https://github.com/JohnMaksutaDCC/Final-Project.git
3.	Git will create a folder “Final-Project” in the directory where you are in git bash that con-tains the files in the project and a .git folder that holds the repository
In Eclipse:
To use in Eclipse, simply create a new java project and use the above steps from a git bash in the “src” directory of the new java project.

Project Summary and Usage:
The project is a contains several class files and the .java files that contain examples which were performed in Week 9 and Week 13. They are as follows:
Main Project files:
Main.java
Person.java
Employee.java
EmployeeBank.java
BankAccount.java
Week 9 Files:
	Person.java
	Employee.java
	Faculty.java
	ExampleEmployees.java
ExampleEmployees2.java
ExampleEmployees3.java
ExampleEmployees4.java
ExampleEmployees5.java
ExampleEmployees6.java
ExampleEmployees7.java
ExampleEmployees8.java
Week 13 Files:
	BankAccount.java
	CheckingAccount.java
	SavingsAccount.java
Description:
The Main.java file contains the Main class which has the main method that runs the demo program which demonstrates the EmployeeBank class.
The EmployeeBank class inherits from Employee which inherits from Person. Employee Bank class contains a field of the Reference Type BankAccount which it uses to perform the withdrawals and deposits and checking the balance. EmployeeBank inherits all other fields from Employee class.
 
Class EmployeeBank
Inheritance:
	Object
Person
			Employee
				EmployeeBank
Field Summary
Fields
Modifier and Type	Field and Description
private BankAccount	bankAccount
A BankAccount that holds a balance and per-forms deposits and withdrawals against the balance.

	
Constructor Summary
Constructor and Description
EmployeeBank()
The default constructor.
EmployeeBank(int employeeNumber, int accountNumber, String firstName, String lastName, String emailAddress, double initialCapital)
Creates a new instance of EmployeeBank with the provided fields.
EmployeeBank(int employeeNumber, int accountNumber, String firstName, String lastName, String emailAddress)
Creates a new instance of EmployeeBank with the provided fields.
EmployeeBank(String s)
Creates a new instance of EmployeeBank with zero balance. The String parameter s was used in one of the examples from Week9 and Week13 but is not functional. Use the default constructor instead.

Method Summary
Modifier and Type	Method and Description
public BankAccount	getBankAccount()
Gets the instance of the BankAccount.
public void	setBankAccount(BankAccount bankAccount)
Sets the instance of the BankAccount.
public void	deposit(double amount)
This method deposits money from the employ-eeBank's BankAccount.
public void	deposit(String amount)
This method deposits money from the employ-eeBank's BankAccount.
public void	withdraw(double amount)
This method withdraws money from the em-ployeeBank's BankAccount.
public void	withdraw(String amount)
This method withdraws money from the em-ployeeBank's BankAccount.
public String	toString()
Returns a String representation of the object.


Methods inherited from class java.lang.Object
clone, finalize, getClass, notify, notifyAll, wait, wait, wait

 
Class Employee
Inheritance:
	Object
Person
			Employee
Field Summary
Fields
Modifier and Type	Field and Description
private int	employeeNo
The employee number or index
private int	accountNo
The account number.
private String	emailAddress
The email address.
private double	initialCapital
The initial capital.
private static String	employer
The employer.

	
Constructor Summary
Constructor and Description
Employee()
The default constructor.
Employee (int employeeNumber, int accountNumber, String firstName, String lastName, String emailAddress, double initialCapital)
Creates a new instance of EmployeeBank with the provided fields.
Employee (int employeeNumber, int accountNumber, String firstName, String lastName, String emailAddress)
Creates a new instance of EmployeeBank with the provided fields.
Employee (String s)
Creates a new instance of EmployeeBank with zero balance. The String parameter s was used in one of the examples from Week9 and Week13 but is not functional. Use the default constructor instead.

Method Summary
Modifier and Type	Method and Description
public int	getEmployeeNo()
Gets the employee no.
public void	setEmployeeNo(int employeeNo)
Sets the employee no.
public int	getAccountNo()
Gets the account no.
public void	setAccountNo(int accountNo)
Sets the account no.
public String	getEmailAddress()
Gets the email address.
public void	setEmailAddress(String emailAddress)
Set the email address.
public double	getInitialCapital()
Gets the initial capital
public void	setInitialCapital(double initialCapital)
Sets the initial capital
public String	getEmployer()
Gets the employer.
public void	setEmployer(String employer)
Sets the employer.
public String	getInitials()
Gets the employee's initials of the first name and last name.
public boolean	equals(Employee that)
Compares the this instance of Employee against another.


Methods inherited from class java.lang.Object
clone, finalize, getClass, notify, notifyAll, wait, wait, wait

 
Class Person
Inheritance:
	Object

Field Summary
Fields
Modifier and Type	Field and Description
private String	firstName
This is the first name of the person.
private String	lastName
This is the last name of the person.

	
Constructor Summary
Constructor and Description
Person()
The default constructor.

Method Summary
Modifier and Type	Method and Description
public String	getFirstName()
Gets the first name.
public void	setFirstName(String firstName)
Sets the first name.
public String	getLastName()
Gets the last name.
public void	setLastName(String lastName)
Sets the last name.


Methods inherited from class java.lang.Object
clone, finalize, getClass, notify, notifyAll, wait, wait, wait


