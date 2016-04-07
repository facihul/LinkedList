package SingleLinkedList;

public class LinkedList {
   private Node header;
   private Node lastnode;
   private int size;
   
   public LinkedList(){
	  header = new Node(null);
	  lastnode = header;
   }
   
   public void prepend(Integer data){
	   Node n = new Node(data);
	   if(size == 0) {
		   header.next = n;
		   lastnode = n;
		   size++;
	   }else {
		   
		Node temp = header.next;
		header.next = n ;
		n.next = temp;
		size++;
	   }
   }
   
   public void append(Integer data){
	   Node n = new Node(data);
	   if(size == 0) {
		   header.next = n;
		   lastnode = n;
		   size++;
	   }else {
		   lastnode.next = n;
		   lastnode = n;
		   size++;
	   }
   }
   
   public void removeFirstNode(){
	   if(size != 0){
	   header.next = header.next.next;
	   size--;
	   }
   }
   
   public void removeLastNode(){
	   if(size == 1){
	   header.next = null;
	   lastnode = header; 
	   size--;
	   } else if (size != 0) {
		  Node n = header.next;
		  int count = 1;
		  while(count != size-1){
			  n=n.next;
			  count++;
	      }
		  lastnode = n;
		  lastnode.next = null;
		  size--;
	   }
   }
   
   public void insertNode(int index, Integer data){
	   if(index <= 0 || index > size) return;
	   else if( index == 1 ) prepend(data);
	   else if( index == size) append(data);
	   else{
		   Node n = new Node(data);
		   Node newNode = header.next;
		   int count  = 1;
		   while(count != index-1){
			   newNode = newNode.next;
			   count ++;
		   }
		   Node temp = newNode.next;
		   newNode.next = n;
		   n.next = temp;
		   size++;
	   }
		   
  }
	   
   public int getSize(){
	   
	  return size; 
   }
	
   public String toString(){
	   Node n = header.next;
	   String temp = "";
	   while(n!=null){
		   temp = temp + n.data + "";
		   n= n.next;
	   }
	   return temp;
	   
   }

}
