/**
 * 
 * @author John Maksuta
 *
 */
public class Person {

	/**
	 * This is the first name of the person.
	 */
	private String firstName;
	/**
	 * This is the last name of the person.
	 */
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * This is the default constructor for the Person class.
	 */
	public Person() {
		super();
		this.firstName = "";
		this.lastName = "";
		// System.out.println("(1) Person's no arg constructor is invoked");
	}

}
