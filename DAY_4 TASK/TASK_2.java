package Day_4;
import java.util.Scanner;


public class TASK_2 {



    static class Node {

        int data;

        Node next, prev;

        Node(int data) {

            this.data = data;

        }

    }



    private Node head, tail;

    private int size = 0;



    public void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) head = tail = newNode;

        else {

            tail.next = newNode;

            newNode.prev = tail;

            tail = newNode;

        }

        size++;

    }



    public void insertAtMiddle(int data) {

        Node newNode = new Node(data);

        if (head == null) {

            head = tail = newNode;

        } else {

            int mid = size / 2;

            Node curr = head;

            for (int i = 0; i < mid; i++) curr = curr.next;



            newNode.next = curr;

            newNode.prev = curr.prev;



            if (curr.prev != null)

                curr.prev.next = newNode;

            else

                head = newNode;



            curr.prev = newNode;

        }

        size++;

    }



    public void traverse() {

        Node curr = head;

        while (curr != null) {

            System.out.print(curr.data + " ");

            curr = curr.next;

        }

        System.out.println();

    }



    public static void main(String[] args) {

    	 TASK_2 list = new  TASK_2();

        Scanner sc = new Scanner(System.in);



        System.out.print("Number of elements: ");

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            list.insert(sc.nextInt());

        }



        System.out.print("Insert value at middle: ");

        list.insertAtMiddle(sc.nextInt());



        System.out.print("List after insertion: ");

        list.traverse();



        sc.close();

    }

}



