package practice;

public class Traversal {
	
	

	    static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    static class SinglyLinkedList {
	        Node head;

	        public SinglyLinkedList() {
	            this.head = null;
	        }

	        public void insert(int data) {
	            Node newNode = new Node(data);

	            if (head == null) {
	                head = newNode;
	            } else {
	                Node current = head;
	                while (current.next != null) {
	                    current = current.next;
	                }
	                current.next = newNode;
	            }
	            System.out.println(data + " inserted into the list");
	        }

	        public void traverse() {
	            if (head == null) {
	                System.out.println("List is empty");
	                return;
	            }
	            System.out.println("Elements in the list:");
	            Node current = head;
	            while (current != null) {
	                System.out.print(current.data + " ");
	                current = current.next;
	            }
	            System.out.println();
	        }

	        public void delete(int key) {
	            Node current = head, prev = null;

	            if (current != null && current.data == key) {
	                head = current.next;
	                System.out.println(key + " found and deleted");
	                return;
	            }

	            while (current != null && current.data != key) {
	                prev = current;
	                current = current.next;
	            }

	            if (current == null) {
	                System.out.println(key + " not found");
	                return;
	            }

	            prev.next = current.next;
	            System.out.println(key + " found and deleted");
	        }

	        public boolean search(int key) {
	            Node current = head;
	            while (current != null) {
	                if (current.data == key)
	                    return true;
	                current = current.next;
	            }
	            return false;
	        }
	    }

	    public static void main(String[] args) {
	        SinglyLinkedList list = new SinglyLinkedList();

	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.insert(40);

	        list.traverse();

	        list.delete(20);

	        list.traverse();

	        if (list.search(30))
	            System.out.println("30 is found");
	        else
	            System.out.println("30 is not found");

	        if (list.search(20))
	            System.out.println("20 is found");
	        else
	            System.out.println("20 is not found");
	    }
	}

	
	


