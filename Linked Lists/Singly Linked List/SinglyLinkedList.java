public class SinglyLinkedList
  {
    public Node head;
    public Node tail;
    public int size;

    // Creation : O(1)
    public Node createSinglyLinkedList(int nodeValue)
    {
      head = new Node();
      Node node = new Node();
      node.next = null;
      node.value = nodeValue;
      head = node;
      tail = node;
      size = 1;
      return head;
    }

// Insertion (handles all 3 insertion cases) : O(N)

    public void insertInLinkedList(int nodeValue, int location)
    {
      Node node = new Node();
      node.value = nodeValue;

      if (head == null)
      {
        createSinglyLinkedList(nodeValue);
        return;
      }

      else if (location == 0) // at head
      {
        node.next = head;
        head = node;
        
      }
      else if (location >= size) // at end
      {
        node.next = null;
        tail.next = node;
        tail = node;
      }

      else // at any given location
      {
        Node tempNode = head;
        int index = 0;
        while (index < location-1)
          {
            tempNode = tempNode.next;
            index++;
          }
        Node nextNode = tempNode.next;
        tempNode.next = node;
        node.next = nextNode;
      }
      size++;
    }


    // Traversal : O(N)
    public void traverseSinglyLinkedList()
    {
      if (head == null)
      {
        System.out.println("Linked list doesn't exist.");
      }

      else
      {
        Node tempNode = head;
        for (int i = 0;i<size;i++)
          {
            System.out.print(tempNode.value + " ");
            tempNode = tempNode.next;
          }
        System.out.println();
      }
    }

    // Search : O(N)
    boolean searchNode(int nodeValue)
    {
      if (head != null)
      {
        Node tempNode = head;
        for (int i = 0;i<size;i++)
          {
            if (tempNode.value == nodeValue)
            {
              System.out.println("Found value "+ nodeValue + "at location "+i);
              return true;
            }
            tempNode = tempNode.next;
            
          }
      }
      System.out.println("Node not found.");
        return false;
    }

    
    
  // Deletion (all 3 cases) : O(N)
    public void deletionOfNode(int location)
    {
      if (head == null)
      {
        System.out.println("Linked List doesn't exist.");
        return;
      }
      else if (location == 0) // first node
      {
        // if multiple element in linked list
        head = head.next;
        size--;
        // if 1 element in linked list
        if (size == 0)
        {
        head = null;
        tail = null;
        }
      }

      // delete from end
      else if (location >= size)
      {
        Node tempNode = head;
        for (int i = 0;i<size-1;i++)
          {
            tempNode = tempNode.next;
          }
        // if only one element
        if (tempNode == head)
        {
          head = null;
          tail = null;
          size--;
          return;
        }
        // if multiple elements
        else
        {
          tempNode.next = null;
          tail = tempNode;
          size--;
        }
      }

        // any given location
      else
      {
        Node tempNode = head;
        for (int i = 0;i<location-1;i++)
          {
            tempNode = tempNode.next;
          }
        tempNode.next = tempNode.next.next;
        size--;
      }
    }

    // Delete Entire Linked List : O(1)
    public void deleteSLL()
    {
      head = null;
      tail = null;
      System.out.println("Linked list successfully deleted.");
    }
    









    
  }

