package linkedlist;
import java.util.*;

public class Stack{
		
		 class Node{
			 int data;
			 Node next;
			 Node(int d){
				 data = d;
			 }
		 }
		 
		 Node top = null;
		 
		 public boolean isEmpty() {
			 if(top == null)   return true;
			 
			 else   return false;
		 }
		 
		 public void push (int data) {
			 Node nn = new Node(data);
			 if(isEmpty()) {
				 top = nn;
			 }
			else {
				nn.next = top;
				top = nn;
			}
			 
		 }
		 
		 public int pop() {
			 int val = 0;
			 if(isEmpty()) {
				 System.out.println("Stack is empty ..");
			 }
			 else {
				 val = top.data;
				 top=top.next;
			 }
			 return val;
		 }
		 
		 public void peek() {
			 if(isEmpty()){
				 System.out.println("Stack is empty ..");
			 }
			 else {
				 System.out.println("Peek element is "+top.data);
			 }
		 }
		 
		 public void display() {
			 if(isEmpty()) {
				 System.out.println("Stack is empty ..");
			 }
			 else {
				 Node temp = top;
				 while(temp != null) {
					 System.out.print(temp.data+" ");
					 temp = temp.next;
				 }
				 System.out.println();
			 }
		 }
		 
		 public static void main(String [] args) {
			 Stack n = new Stack();
			 try(Scanner sc = new Scanner(System.in)){
				 boolean flag = true;
			     int a;
			     while(flag) {
			        	System.out.println("********************************************************************************");
                        System.out.println("1.IsEmpty\n2.Push\n3.Pop\n4.Peek\n5.Display\n6.Exit");
                        System.out.print("Enter your choice : ");
        	        	int choice = sc.nextInt();
        	        	switch(choice) {
        	        	case 1:
        	        		if(n.isEmpty()) {
        	        			System.out.println("The stack is Empty..");
        	        		}
        	        		else {
        	        			System.out.println("The stack is not Empty..");
        	        		}
        	        		break;
        	        		
        	        	case 2:
        	        		
        	        		System.out.print("Enter a value to push : ");
        	        		a = sc.nextInt();
        	        		n.push(a);
        	        		System.out.println(a+" is pushed into the stack");
        	        		break;
        	        		
        	        	case 3:
        	        		
        	        		System.out.println(n.pop()+" is pop out from the stack");
        	        		break;
        	        		
        	        	case 4:
        	        		
        	        		n.peek();
        	        		break;
        	        		
        	        	case 5:
        	        		
        	        		n.display();
        	        		System.out.println("All elements are displayed..");
        	        		break;
        	        		
        	        	case 6:
        	        		
        	        		System.out.println("Program is exiting..");
        	        		flag = false;
        	        		break;
        	        		
        	        	default:
        	        		System.out.println("Invalid choice..");
        	        		break;
        	        	}
			     }
			     
			 }
			 
		 }

}

