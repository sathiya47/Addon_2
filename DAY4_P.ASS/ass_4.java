package post_assignment;
import java.util.Scanner;
public class ass_4 {	
	    static class Node {
	        int data;
	        Node prev, next;

	        Node(int data) {
	            this.data = data;
	            this.prev = null;
	            this.next = null;
	        }
	    }
	    static class DLL {
	        Node head, tail;
	        
	        void insertAtBeginning(int data) {
	            Node newNode = new Node(data);
	            if (head == null) {
	                head = tail = newNode;
	                return;
	            }
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        }	    
	        void insertAtEnd(int data) {
	            Node newNode = new Node(data);
	            if (head == null) {
	                head = tail = newNode;
	                return;
	            }
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	        }	       
	        void display() {
	            Node temp = head;
	            while (temp != null) {
	                System.out.print(temp.data + " <-> ");
	                temp = temp.next;
	            }
	            System.out.println("null");
	        }
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        DLL list = new DLL();
	        int choice;
	        do {
	            System.out.println("\n1. Insert at Beginning\n2. Insert at End\n3. Display\n4. Exit");
	            choice = scanner.nextInt();

	            if (choice == 1) {
	                System.out.print("Enter value: ");
	                list.insertAtBeginning(scanner.nextInt());
	            } else if (choice == 2) {
	                System.out.print("Enter value: ");
	                list.insertAtEnd(scanner.nextInt());
	            } else if (choice == 3) {
	                list.display();
	            }
	        } while (choice != 4);

	        scanner.close();
	    }
	}



