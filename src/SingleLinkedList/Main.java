package SingleLinkedList;
/*
 * @author: MD. Facihul Azam
 * Main class for Single Linked List in object oriented technique  
 * */



public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.prepend( 1 );
		list.prepend( 2 );
		list.prepend( 3 );
		list.prepend( 4 );
		System.out.println(list);
		System.out.print(list.getSize());
		

	}

}