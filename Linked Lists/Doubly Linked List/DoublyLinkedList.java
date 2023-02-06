public class DoublyLinkedList
  {
    public Node head;
    public Node tail;
    public int size;

    public Node createDoublyLinkedList(int nodeValue)
    {
      Node newNode = new Node();
      newNode.value = nodeValue;
      newNode.next = null;
      newNode.prev = null;
      head = newNode;
      tail = newNode;
      size = 1;
      return head;
      
    }


    public void insert(int nodeValue, int location)
    {
      // case 1: linked list doesn't exist
      if (head == null)
      {
        createDoublyLinkedList(nodeValue);
        return;
      }

      // case 2: location is 0 - insert at beginning
      else if (location == 0)
      {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = head;
        head.prev = newNode;
        newNode.prev = null;
        head = newNode;
      }

      // case 2: location is greater than or equal to size of linked list
      else if (location >= size)
      {
        Node newNode = new Node();
        newNode.value = nodeValue;
        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = null;
        tail = newNode;
      }

      // case 3: location is any other value 
      else
      {
        Node temp = head;
        for (int i = 0;i<location-1;i++)
          {
            temp = temp.next;
          }
        Node nextNode = temp.next;
        Node newNode = new Node();
        newNode.value = nodeValue;
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = nextNode;
        nextNode.prev = newNode;
      }
      size++;
    }


    public void traverseDLL()
    {
      if (head == null)
      {
        System.out.println("Doubly Linked List does not exist.");
        return;
      }
      Node temp = head;
      for (int i = 0;i<size;i++)
        {
          System.out.print(temp.value + " ");
          temp = temp.next;
        }
      System.out.println();
    }

    public boolean searchNode(int nodeValue)
    {
      if (head == null)
      {
        System.out.println("Doubly Linked List does not exist.");
        return false;
      }
      Node temp = head;
      for (int i = 0;i<size;i++)
        {
          if (temp.value == nodeValue)
          {
            System.out.println(nodeValue +" found at location "+i);
            return true;
          }
        }
      System.out.println(nodeValue + " not found in the doubly linked list.");
      return false;
    }


    public void delete(int location)
    {
      if (head == null)
      {
        System.out.println("The linked list does not exist.");
      }
      else if (location == 0)
      {
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
          head.prev = null;
          size--;
        }
      }
      else if (location >= size)
      {
        if (size == 1)
        {
          head = null;
          tail = null;
          size--;
          return;
        }
        else
        {
          Node newTail = tail.prev;
          tail.prev = null;
          newTail.next = null;
          tail = newTail;
          size--;
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
      }
    }

    public void deleteDLL()
    {
      Node tempNode = head;
      for (int i =0; i< size; i++) {
        tempNode.prev = null;
        tempNode = tempNode.next;
    }
      head = null;
      tail = null;
      System.out.println("The DLL has been deleted!");

    }
    
    
  }