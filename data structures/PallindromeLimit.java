class PallindromeLimit
{
  public static void main(String[] args)
  {
    int n,i,rev=0,rem;
    {
    System.out.println("The first 10 natural pallindrome numbers are: ");
    for (i=0;i<10;i++)
		{
			   n=i;
			   while(n>0)
			   {
				     rem=n%10;
				     rev=rev*10+rem;
				     n=n/10;
			   }
			   if(rev==i)
			   {
				     System.out.print(i+" ");
			   }
			   rev=0;
		  }
    }
  }
}
