package FirstComeFirstServe;

/**class Customer 
 * @author Omar ahmad.
 * This is my Customer class is known superclass or parent-class
 */
public class Customer {
	/* Members
	 * Variable declaration.
	  */
	private String FirstNmae;
	private String LastName;
	
	public Customer() {
		super();
	}
	/** constructor just use two items.
	 * @param firstname
	 * @param lastname
	 */
	public Customer(String firstname, String lastname) {
		super();
		FirstNmae = firstname;
		LastName = lastname;
	}

	/*getters and setters*/
	public String getFirstNmae() {
		return FirstNmae;
	}

	public void setFirstNmae(String firstname) {
		FirstNmae = firstname;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastname) {
		LastName = lastname;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((LastName == null) ? 0 : LastName.hashCode());
		result = prime * result + ((FirstNmae == null) ? 0 : FirstNmae.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (LastName == null) {
			if (other.LastName != null)
				return false;
		} else if (!LastName.equals(other.LastName))
			return false;
		if (FirstNmae == null) {
			if (other.FirstNmae != null)
				return false;
		} else if (!FirstNmae.equals(other.FirstNmae))
			return false;
		return true;
	}
	@Override
	/*ToString method is used to display the contents of an object inside it*/
	public String toString() {
		return (FirstNmae + "  "+ LastName);
	}
	
	
	
}
