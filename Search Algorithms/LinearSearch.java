public class LinearSearch {

  // Time Complexity: O(N)
  // Space Complexity: O(1) - since no extra memory is needed to search the array
  public static int linearSearch(int[] arr, int value)
  {
    for (int i = 0;i<arr.length;i++)
      {
        if (arr[i] == value)
        {
          System.out.println("Value " + value +" found at location "+i);
          return i;
        }
      }
    System.out.println("Value "+value+" was not found in the array.");
    return -1;
  }
  public static void main(String[] args)
  {
    int[] arr = {1,2,3,4,5};
    int foundStatus1 = linearSearch(arr, 4);
    int foundStatus2 = linearSearch(arr, 10);
  }
}