public class Main 
{
  public static void main(String[] args)
  {
    BinaryTreeLL bt = new BinaryTreeLL();
    bt.insert("A");
    bt.insert("B");
    bt.insert("C");
    bt.insert("D");
    bt.insert("E");
    bt.insert("F");
    bt.insert("G");
    bt.insert("H");
    bt.levelorder();
    bt.search("F");
    bt.search("Z");
    bt.preorder(bt.root);
    System.out.println();
    bt.inorder(bt.root);
    System.out.println();
    bt.postorder(bt.root);
    System.out.println();
    bt.deleteNode("F");
    bt.levelorder();
  }
}