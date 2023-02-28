public class Main
  {
    public static void main(String[] args)
    {
      int[] arr = {3,4,5,2,1};
      SortingAlgorithms.sort(arr,arr.length);
      SortingAlgorithms.printArray(arr);

      int[] arr2 = {3,4,5,2,1};
      SortingAlgorithms.quicksort(arr2,0,arr2.length-1);
      SortingAlgorithms.printArray(arr2);
    }
  }