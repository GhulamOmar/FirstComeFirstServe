package FirstComeFirstServe;

/**
 * @author Omar Ahmad
 * This is a queue implemented by a Linked List
 */
public class queue {
	private LinkedList linkedlist = new LinkedList();
	/**
	 * create an empty constructor queue
	 */
	public queue() {
		
	}
	/**
	 * adds a new name to the queue by a Linked List
	 * @param name
	 */
	public void enqueue(Customer name) {
		linkedlist.insertFirst(name);
	}
	/** Method dequeue.
	 * Removes and returns an name to the queue by a Linked List.
	 * @return 
	 */
	public Customer dequeue() {
		Customer result;
		result = linkedlist.first.data;
		linkedlist.deleteFirst();
		System.out.println("Customer Sverd  : " + result);
		return result;
	}
	/**
	 * Returns a boolean and tests for an empty queue by a Linked List.
	 * @return
	 */
	public boolean isEmpty() {
		return linkedlist.isEmpty();
	}
	
	/**
	 * Returns the int size of the queue by a Linked List.
	 * @return
	 */
	public int size() {
		return linkedlist.size();
	}
	
	/**
	 * prints the queue from front to rear by a Linked List.
	 */
	public void print() {
		System.out.println("Customer waiting : ");
		Link curr = linkedlist.first;
		while(curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
		System.out.println(" ");
	}
	
	/**
	 * prints the front element by a Linked List.
	 */
	public void peek() {
		System.out.println(linkedlist.first.data);
		
	}
	public void Customer(int nextInt) {
		// TODO Auto-generated method stub
		
	}
}
