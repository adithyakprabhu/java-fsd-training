import java.util.*;
class QuickSort
{
int partition (int a[], int start, int end)
{
    int pivot = a[end];
    int i = (start - 1);
    for (int j = start; j <= end - 1; j++)
    {
        if (a[j] < pivot)
        {
            i++;
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }
    int t = a[i+1];
    a[i+1] = a[end];
    a[end] = t;
    return (i + 1);
}
void quick(int a[],int start,int end)
{
    if (start<end)
    {
        int p = partition(a,start,end);
        quick(a,start,p-1);
        quick(a,p+1,end);
    }
}

void printArr(int a[], int n)
{
    int i;
    for (i=0;i<n;i++)
    {
      System.out.print(a[i] + " ");
    }
}
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int i;
      System.out.println("Enter number of elements: ");
      int n = sc.nextInt();
      int[] arr =new int[n];
      System.out.println("Enter elements to the array");
      for(i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      System.out.println("Before sorting: ");
      QuickSort q1 = new QuickSort();
      q1.printArr(arr, n);
      q1.quick(arr, 0, n - 1);
      System.out.println("\nAfter sorting: ");
      q1.printArr(arr, n);
      System.out.println();
    }
}
