public class CircularSinglyLinkedList {
  public Node head;
  public Node tail;
  public int size;

  // O(1)
  public Node createCircularSinglyLinkedList(int nodeValue)
  {
    Node newNode = new Node();
    newNode.value = nodeValue;
    newNode.next = null;
    head = newNode;
    tail = newNode;
    tail.next = head;
    size = 1;
    return head;
  }

  // O(N)
  public void insertNode(int nodeValue, int location)
  {
    if (location == 0) // at beginning
    {
      if (head == null)
      {
        createCircularSinglyLinkedList(nodeValue);
        return;
      }
      else
      {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = head;
        head = newNode;
        tail.next = head;
        size++;
        return;
      }
    }
    else if (location >= size) // at end
    {
      if (head == null)
      {
        createCircularSinglyLinkedList(nodeValue);
        return;
      }
      else
      {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = head;
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
        size++;
      }
    }
    else // any location
    {
      if (head == null)
      {
        createCircularSinglyLinkedList(nodeValue);
        return;
      }
      else
      {
        Node cur = head;
        for (int i = 0;i<location-1;i++)
          {
            cur = cur.next;
          }
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = cur.next;
        cur.next = newNode;
        size++;
      }
    }
  }



  // O(N)
  public void traverseCircularSinglyLinkedList()
  {
    if (head == null)
    {
      System.out.println("Circular Singly Linked List is empty.");
      return;
    }
    else
    {
      Node temp = head;
      System.out.print(temp.value + " ");
      temp = temp.next;
      while (temp != head)
        {
          System.out.print(temp.value + " ");
          temp = temp.next;
        }
      System.out.println();
    }
  }

  // O(N)
  public boolean searchNode(int search)
  {
    if (head == null)
    {
      System.out.println("Circular Singly Linked List is empty.");
      return false;
    }
    else
    {
      Node temp = head;
      int index = 0;
      while (index < size)
        {
          if (temp.value == search)
          {
            System.out.println("Value "+search+" was found at position "+index);
            return true;
          }
          index++;
          temp = temp.next;
        }
      System.out.println("Node with value "+search+" was not found.");
      return false;
    }
  }

  // O(N)
  public void deleteNode(int location)
  {
    if (head == null)
    {
      System.out.println("Circular Singly Linked List does not exist.");
      return;
    }
    else if (location == 0) // at beginning
    {
      // if only one element in the linked list
      if (size == 1)
      {
        head = null;
        tail = null;
        size--;
        return;
      }
      else
      {
        head = head.next;
        tail.next = head;
        size--;
      }
      
    }
    else if (location >= size) // at end
    {
      if (size == 1)
      {
        head = null;
        tail = null;
        size--;
        return;
      }
      Node temp = head;
      while (temp.next != tail)
        {
          temp = temp.next;
        }
      temp.next = head;
      tail = temp;
      size--;
    }
      
    else // any location
    {
      Node temp = head;
      for (int i = 0;i<location-1;i++)
        {
          temp = temp.next;
        }
      temp.next = temp.next.next;
      size--;
      
    }
  }

  public int getSize()
  {
    return size;
  }

  // O(1)
  public void deleteCSLL()
  {
    head = null;
    tail = null;
    size = 0;
    System.out.println("Circular Singly Linked List has been deleted.");
  }


  
}