public class SortingAlgorithms
  {
    /*
    public static void selectionSort(int[] arr)
    {
      
    }

    public static void insertionSort(int[] arr)
    {
      
    }
    */

    public static void printArray(int[] arr)
    {
      for (int i = 0;i<arr.length;i++)
        {
          System.out.print(arr[i] + " ");
        }
      System.out.println();
    }

    /*
      - Mergesort
      - O(NLOGN)
    */

    public static void sort(int[] a, int n)
{
	if (n<2)
	{
		return;
	}
	int mid = n/2;
	int[] l = new int[mid];
	int[] r = new int[n-mid];
	for (int i = 0;i<mid;i++)
	{
		l[i] = a[i];
	}
	for (int i = mid;i<n;i++)
	{
		r[i-mid] = a[i];
	}
	sort(l, mid);
	sort(r, n-mid);
	merge(a,l,r,mid,n-mid);
}

public static void merge(int[] a, int[] l, int[] r, int left, int right)
{
	int i = 0,j=0,k=0;
	while (i<left && j<right)
	{
		if (l[i] <= r[j])
		{
			a[k++] = l[i++];
		}
		else
		{
			a[k++] = r[j++];
		}
	}
	while (i<left)
	{
		a[k++] = l[i++];
	}
	while (j<right)
	{
		a[k++] = r[j++];
	}
}

    /*
      - Quicksort
      - O(NLOGN)
    */

    public static void quicksort(int[] arr, int begin, int end)
    {
      if (begin < end)
      {
        int partitionIndex = partition(arr, begin, end);
        quicksort(arr, begin, partitionIndex-1);
        quicksort(arr, partitionIndex+1, end);
        
      }
    }

    private static int partition(int[] arr, int begin, int end)
    {
      int pivot = arr[end];
      int i = begin - 1;

      for (int j = begin;j<end;j++)
        {
          if (arr[j]<=pivot)
          {
            i++;

            int swapTemp = arr[i];
            arr[i] = arr[j];
            arr[j] = swapTemp;
          }
        }
      int swapTemp = arr[i+1];
      arr[i+1] = pivot;
      arr[end] = swapTemp;
      return i + 1;
    }

  }