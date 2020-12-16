package FirstComeFirstServe;

/**
 * @author Omar Ahmad
 * this is my LinkedList class
 */
public class LinkedList {
	public Link first;
	public Link last;
	private int size;
	
	/**
	 * create an empty constructor LinkedList
	 */
	public LinkedList() {
		first = null;
	}
	
	/** Method Empty.
	 * true if list is empty
	 * @return null
	 */
	public boolean isEmpty() {
		return (first == null);
	}
	
	/**Method insertFirst.
	 * insert at start of list
	 * @param 
	 */
	public void insertFirst(Customer item) {
		Link newLink = new Link(item);
		newLink.next = first;
		first = newLink;
		size++;
	}
	
	/**Method find.
	 * find a list
	 * @return null if not, return current: found it
	 */
	public Link find() {
		Link curr = first;
		while(curr != null) {
			if(curr.next == null)
				return null;
			else
				curr = curr.next;
		}
		return curr;
	}
	
	/**Method delete.
	 * delete first item
	 * @return deleted link
	 */
	public Link deleteFirst() {
		if (isEmpty()) {
			System.out.println("Error!!first cannot be deleted, the list is empty!");

		} else {
			Link temp = first; 
			first = first.next; 

			return temp; 
		}
		return null;
	}
	/**Method display.
	 * display list
	 */
	public void displayList() {
		System.out.print("List: ");
		Link curr = first;
		while(curr != null) {
			curr.displayLink();
			curr = curr.next;
		}
		System.out.println(" ");
	}
	/**Method size
	 * return the int size of the linked list
	 * @return size
	 */
	public int size() {
		int size = 0;
		Link curr = first;
		while (curr.next != null) {
			curr = curr.next;
			size++;
		}
		return size;
	}
}
