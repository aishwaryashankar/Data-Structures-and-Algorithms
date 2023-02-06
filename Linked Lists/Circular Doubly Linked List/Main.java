public class Main
  {
    public static void main(String[] args)
    {
      CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
      cdll.createCircularDoublyLinkedList(1);
      cdll.insert(2,0);
      cdll.insert(3,10);
      cdll.insert(4,1);
      cdll.insert(5,4);
      cdll.insert(6,10);
      System.out.println("Size: " + cdll.getSize());
      cdll.traverseCDLL();
      cdll.delete(0);
      cdll.delete(10);
      cdll.traverseCDLL();
      System.out.println("Size: "+cdll.getSize());
    }
  }