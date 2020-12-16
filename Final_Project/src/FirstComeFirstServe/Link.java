package FirstComeFirstServe;

/**class Link 
 * @author Omar Ahmad
 * the data part of the Link class
 */
public class Link {
	public Customer data;
	public Link next;
	
	/**
	 * constructor
	 * @param data
	 */
	public Link(Customer data) {
		this.data = data;
	}
	/**
	 * Display the items in the link
	 */
	public void displayLink() {
		System.out.println(" ");
	}
		
}
