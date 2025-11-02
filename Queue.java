package linkedlist;

import java.util.*;

public class Queue {
		
		class Node{
			 int data;
			 Node next;
			 Node(int d){
				 data = d;
			 }
		 }
		
		Node front,rear = null;
		
		public boolean isEmpty() {
			 if(front == null)   return true;
			 
			 else   return false;
		 }
		
		public void enqueue (int data) {
			 Node nn = new Node(data);
			 if(isEmpty()) {
				 front  = nn;
				 rear = nn;
			 }
			else {
				rear.next = nn;
				rear = nn;
			}
			 
		 }
		
		public int dequeue() {
			 int val = 0;
			 if(isEmpty()) {
				 System.out.println("Queue is empty ..");
			 }
			 else {
				 val = front.data;
				 front = front.next;
			 }
			 return val;
		 }
		
		public void display() {
			Node temp = front;
			while(temp.next!= null) {
				System.out.print(temp.data+" -> ");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
		
		public static void main(String [] args) {
			Queue n = new Queue();
			try(Scanner sc = new Scanner(System.in)){
			boolean flag = true;
			while(flag) {
	        	System.out.println("********************************************************************************");
                System.out.println("1.Enqueue\n2.Dequeue\n3.Front and rear value\n4.Display\n5.Exit");
                System.out.print("Enter your choice : ");
                int choice = sc.nextInt();
                switch(choice) {
                
                case 1:
                	
                	System.out.print("Enter value to insert: ");
                	int a = sc.nextInt();
                	n.enqueue(a);
                	System.out.println(a+" is inserted into the queue..");
                	break;
                	
                case 2:
                	
                	n.dequeue();
                	System.out.println("First element is deleted..");
                	break;
                	
                case 3:
                	if(n.isEmpty()) {
                		System.out.println("Queue is empty..");
                	}
                	else {
                	System.out.println("Front value : "+ n.front.data +"\nRear value : "+ n.rear.data);
                	break;
                	}
                	
                case 4:
                	
                	n.display();
                	System.out.println("All data's are displayed..");
                	break;
                	
                case 5:
                	
                	System.out.println("Program is exinting..");
                	flag = false;
                	break;
                	
                default:
                	System.out.println("Invalid choice...");
                	break;
                }
                
			}
		}
		}
		
		

}


