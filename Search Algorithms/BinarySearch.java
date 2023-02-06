public class BinarySearch
  {
    public static int binarySearch(int[] arr, int value)
    {
      int left = 0;
      int right = arr.length-1;
      int middle = (left + right)/2;
      if (arr[middle] == value)
      {
        System.out.println("Value "+value+" was found at location "+middle);
        return middle;
      }
      while (arr[middle] != value && left<=right)
        {
          if (value < arr[middle])
          {
            right = middle-1;
          }
          else
          {
            left = middle+1;
          }

          middle = (left + right)/2;
        }

      if (arr[middle] == value)
      {
        System.out.println("Value "+value+" was found at location "+middle);
        return middle;
      }
      else
      {
        System.out.println("Value "+value+" was not found in the array.");
        return -1;
      }
    }

    public static void main(String[] args)
    {
      int[] arr = {1,2,3,4,5};
      binarySearch(arr, 5);
      binarySearch(arr,10);
      
    }
  }