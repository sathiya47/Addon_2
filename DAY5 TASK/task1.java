package Day_5;

import java.util.Scanner;
public class task1<T> {
	private Node<T> head, tail;
	private static class Node<T>
	{
		T data;
		Node<T> next;
		Node(T data) { this.data = data; 
		}
	}
	public void add(T data)
	{
	Node<T> newNode = new Node<>(data);
	if (head ==null)
	{
	head = tail = newNode;
	newNode.next = head;
	} else 
	{
		tail.next = newNode;
		newNode.next = head;
		tail = newNode;
	}
	}
	public void display() 
	{
	if (head == null)
	{
		System.out.println("Empty"); 
		return; 
	}
	Node<T> current = head;
	do {

		System.out.print(current.data + " ");
		current = current.next;
	} 
	while (current != head);
		System.out.println();
	}
	public static void main(String[] args) 
	{
		task1<String> list = new task1<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter elements (type 'done' to finish):");
		String input;
	
	while (true) 
	{
	input = scanner.nextLine();
	if (input.equalsIgnoreCase("done")) 
	{
	break;
	}
		list.add(input);
	}	
	System.out.println("Circular Linked List:");
	list.display();
	scanner.close();
	}
	}

