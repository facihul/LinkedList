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
		System.out.println(list.getSize());
		
		list.append(6);
		list.append(7);
    	list.append(8);

    	System.out.println(list);
		System.out.println(list.getSize());
		
		
		list.removeFirstNode();
		list.removeFirstNode();
		
		System.out.println(list);
		System.out.println(list.getSize());
		
		list.removeLastNode();
		list.removeLastNode();
		
		System.out.println(list);
		System.out.println(list.getSize());
		
		list.insertNode(1, 40);
		list.insertNode(3, 10);
		list.insertNode(5, 80);
		
		System.out.println(list);
		System.out.println(list.getSize());
		
		list.removeNode(1, 40);
		list.removeNode(4, 7);
		
		System.out.println(list);
		System.out.println(list.getSize());
		

	}

}
