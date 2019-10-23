public class MaxSumArray {
  public static void main(String[] args )
  {


    System.out.println("Exercise number 3");
    int [] a = {12, -34, 40, 6, -10, 56, 12, -1, -15, 10, 4};

    maxArray(a,a.length);



  }static void maxArray(int a[], int sizeArray)
  {
    int maxStart = Integer.MIN_VALUE,
        maxEnd = 0,start = 0,
        end = 0, s = 0;

    for (int i = 0; i < sizeArray; i++)
    {
      maxEnd += a[i];

      if (maxStart < maxEnd)
      {
        maxStart = maxEnd;
        start = s;
        end = i;
      }

      if (maxEnd < 0)
      {
        maxEnd = 0;
        s = i + 1;
      }
    }
    System.out.println("Maximal continous sequence sum is :"
                       + maxStart);
    System.out.println("Starting index is :" + start);
    System.out.println("Ending index is :" + end);
  }
}
