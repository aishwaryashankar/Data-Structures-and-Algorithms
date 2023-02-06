public class CircularDoublyLinkedList
  {
    public Node head;
    public Node tail;
    public int size;

    public Node createCircularDoublyLinkedList(int nodeValue)
    {
      Node newNode = new Node();
      newNode.value = nodeValue;
      newNode.next = null;
      newNode.prev = null;
      head = newNode;
      tail = newNode;
      tail.next = head;
      size = 1;
      return head;
    }

    public void insert(int nodeValue, int location)
    {
      if(head == null)
      {
        createCircularDoublyLinkedList(nodeValue);
        return;
      }
      if (location == 0)
      {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        tail.next = head;
        head.prev = tail;
        size++;
        return;
      }
      else if (location >= size)
      {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
        head.prev = tail;
        size++;
        return;
      }
      else
      {
        Node newNode = new Node();
        newNode.value = nodeValue;
        Node temp = head;
        for (int i = 0;i<location-1;i++)
          {
            temp = temp.next;
          }
        Node nextNode = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = nextNode;
        nextNode.prev = temp;
        size++;
        return;
      }
    }

    public void traverseCDLL()
    {
      if (head == null)
      {
        System.out.println("Circular Doubly Linked List does not exist.");
        return;
      }
      Node cur = head;
      for (int i=0;i<size;i++)
        {
          System.out.print(cur.value + " ");
          cur = cur.next;
        }
      System.out.println();
    }

    public boolean searchNode(int nodeValue)
    {
      if (head == null)
      {
        System.out.println("Circular Doubly Linked List does not exist.");
        return false;
      }
      Node cur = head;
      for (int i= 0;i<size;i++)
        {
          if (cur.value == nodeValue)
          {
            System.out.println(nodeValue + " was found at location "+i);
            return true;
          }
        }
      System.out.println(nodeValue + " was not found in the circular doubly linked list.");
      return false;
    }

    public void delete(int location)
    {
      if (head == null)
      {
        System.out.println("The Circular Doubly Linked List does not exist.");
        return;
      }
      else if (location == 0)
      {
        if (size == 1)
        {
          head = null;
          tail = null;
          size = 0;
          return;
        }
        else
        {
          head = head.next;
          head.prev = tail;
          tail.next = head;
          size--;
          return;
        }
      }
      else if (location >= size)
      {
        if (size == 1)
        {
          head = null;
          tail = null;
          size = 0;
          return;
        }
        else
        {
          tail = tail.prev;
          tail.next = head;
          head.prev = tail;
          size--;
          return;
        }
      }
      else
      {
        Node temp = head;
        for (int i = 0;i<location-1;i++)
          {
            temp = temp.next;
          }
        Node nextNode = temp.next.next;
        temp.next = nextNode;
        nextNode.prev = temp;
        size--;
        return;
      }
    }

    public int getSize()
    {
      return size;
    }











    
  }
