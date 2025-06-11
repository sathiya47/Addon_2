package Day_4;

public class mainpro4 {
	    static class Node {
	        int data;
	        Node prev, next;

	        Node(int data) {
	            this.data = data;
	            prev = null;
	            next = null;
	        }
	    }

	    static class DoublyLinkedList {
	        Node head;
	        Node tail;

	       
	        void insert(int data) {
	            Node newNode = new Node(data);
	            if (head == null) {
	                head = tail = newNode;
	                return;
	            }
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	        }

	    
	        void traverseFromFront() {
	            Node temp = head;
	            System.out.print("Traversal from front: ");
	            while (temp != null) {
	                System.out.print(temp.data + " ");
	                temp = temp.next;
	            }
	            System.out.println();
	        }

	        
	        void traverseFromBack() {
	            Node temp = tail;
	            System.out.print("Traversal from back: ");
	            while (temp != null) {
	                System.out.print(temp.data + " ");
	                temp = temp.prev;
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        DoublyLinkedList dll = new DoublyLinkedList();
	        dll.insert(5);
	        dll.insert(10);
	        dll.insert(15);
	        dll.insert(20);

	        dll.traverseFromFront(); 
	        dll.traverseFromBack();  
	    }
	}


