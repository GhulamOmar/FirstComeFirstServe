package FirstComeFirstServe;

/**************************************************************
* Name        : Final project
* Author      : Omar Ahmad
* Created     : 12/12/2019
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 8.1
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This program overall description here
*               Input: String  Object of the class
*               Output: prints the customers wait for serves
*               and customers were served.
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/


/**
 * @author Omar Ahmad
 * this is my main class of a queue implemented by a Linked List
 */
public class AppDriver {
	public static void main (String [] args) {
		/* Creates object of Queue*/
		queue Queue = new queue();
	/* Creates object of customer class*/
		Customer customer1 = new Customer ("James", "Robert");
		Customer customer2 = new Customer ("David", "Matthew");
		Customer customer3 = new Customer ("Maria", "Johnson");
		Customer customer4 = new Customer ("Frank", "Scott");
		Customer customer5 = new Customer ("Dennis", "Adam");
		/* Adds customers*/
		Queue.enqueue(customer1);
		/*Deletes Customer*/
		Queue.dequeue();
		Queue.enqueue(customer2);
		/*Deletes Customer*/
		Queue.dequeue();
		Queue.enqueue(customer3);
		Queue.enqueue(customer4);
		Queue.enqueue(customer5);
		Queue.print();

	}
}