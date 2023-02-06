import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL 
{
  public BinaryNode root;


  // preorder traversal
  public void preorder(BinaryNode node)
  {
    if (node == null)
    {
      return;
    }
    System.out.print(node.value + " ");
    preorder(node.left);
    preorder(node.right);
  }

  // postorder traversal
  public void postorder(BinaryNode node)
  {
    if (node == null)
    {
      return;
    }
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.value + " ");
  }

  // inorder traversal
  public void inorder(BinaryNode node)
  {
    if (node == null)
    {
      return;
    }
    inorder(node.left);
    System.out.print(node.value);
    inorder(node.right);
  }

  // BFS aka level order traversal
  public void levelorder()
  {
    Queue<BinaryNode>  queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while (!queue.isEmpty())
      {
        BinaryNode presentNode = queue.remove();
        System.out.print(presentNode.value + " ");
        if (presentNode.left != null)
        {
          queue.add(presentNode.left);
        }
        if (presentNode.right != null)
        {
          queue.add(presentNode.right);
        }
      }
    System.out.println();
  }

  // search for a value in the tree - uses BFS
  public void search(String value)
  {
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while (!queue.isEmpty())
    {
      BinaryNode presentNode = queue.remove();
      if (presentNode.value == value)
      {
        System.out.println("Value "+value+" was found in the tree");
        return;
      }
      if (presentNode.left != null)
      {
        queue.add(presentNode.left);
      }
      if (presentNode.right != null)
      {
        queue.add(presentNode.right);
      }
    }
    System.out.println("Value "+value+" was not found in the tree.");
  }

  // insert a node into the binary tree - uses BFS
  public void insert(String value)
  {
    BinaryNode newNode = new BinaryNode();
    newNode.value = value;
    if (root == null)
    {
      root = newNode;
      System.out.println("Inserted new node at the root.");
      return;
    }
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while (!queue.isEmpty())
      {
        BinaryNode presentNode = queue.remove();
        if (presentNode.left == null)
        {
          presentNode.left = newNode;
          System.out.println("Successfully inserted the node.");
          break;
        }
        else if (presentNode.right == null)
        {
          presentNode.right = newNode;
          System.out.println("Successfully inserted the node.");
          break;
        }
        else
        {
          queue.add(presentNode.left);
          queue.add(presentNode.right);
        }
      }
  }

  // get the deepest node in the tree - uses BFS
  public BinaryNode getDeepestNode()
  {
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    BinaryNode presentNode = null;
    while (!queue.isEmpty())
      {
        presentNode = queue.remove();
        if (presentNode.left != null)
        {
          queue.add(presentNode.left);
        }
        if (presentNode.right != null)
        {
          queue.add(presentNode.right);
        }
      }
    return presentNode;
  }


  // delete the deepest node in the tree - uses BFS
  public void deleteDeepestNode()
  {
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    BinaryNode previousNode, presentNode = null;
    while (!queue.isEmpty())
      {
        previousNode = presentNode;
        presentNode = queue.remove();
        if (presentNode.left == null)
        {
          previousNode.right = null;
          return;
        }
        else if (presentNode.right == null)
        {
          presentNode.left = null;
          return;
        }
        queue.add(presentNode.left);
        queue.add(presentNode.right);
      }
  }

  // delete given node - uses BFS
  public void deleteNode(String value)
  {
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while (!queue.isEmpty())
      {
        BinaryNode presentNode = queue.remove();
        if (presentNode.value == value)
        {
          String deepest = getDeepestNode().value;
          presentNode.value = deepest;
          deleteDeepestNode();
          System.out.println("The node with value "+value+ " has been deleted.");
          return;
        }
        if (presentNode.left != null)
        {
          queue.add(presentNode.left);
        }
        if (presentNode.right != null)
        {
          queue.add(presentNode.right);
        }
      }
    System.out.println("The node with value "+value+" was not found in the tree.");
  }

  // delete the entire tree
  public void deleteTree()
  {
    root = null;
    System.out.println("The tree has been deleted.");
    
  }
  














  
}