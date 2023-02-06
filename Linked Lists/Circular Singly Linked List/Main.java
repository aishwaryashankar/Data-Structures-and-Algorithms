public class Main {
  public static void main(String[] args)
  {
    CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
    csll.createCircularSinglyLinkedList(1);
    csll.insertNode(2,10);
    csll.insertNode(3,10);
    csll.insertNode(4,10);
    csll.insertNode(5,10);
    csll.traverseCircularSinglyLinkedList();
    System.out.println("Size: "+csll.getSize());
    csll.searchNode(4);
    csll.deleteNode(0);
    csll.traverseCircularSinglyLinkedList();
    System.out.println("Size: "+csll.getSize());
    csll.deleteNode(10);
    csll.traverseCircularSinglyLinkedList();
    System.out.println("Size: "+csll.getSize());
    csll.deleteNode(1);
    csll.traverseCircularSinglyLinkedList();
    System.out.println("Size: "+csll.getSize());
    
    // verifying that pointers are correct
    System.out.println(csll.head.value + " " + csll.tail.value + " " + csll.tail.next.value);

    csll.deleteCSLL();
    System.out.println("Size: "+csll.getSize());
    
    
    
  }
}