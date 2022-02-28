class BreakLabel
{
  public static void main(String[] args)
  {
    int i=10;
    loop1:
    while(i<20)
    {
	     if(i==15)
		   break loop1;
	     System.out.println("i ="+i);
	     i++;
    }
System.out.println("Out of the loop");
  }
}
