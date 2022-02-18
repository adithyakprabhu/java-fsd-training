import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;
class SampleRead
{
	public static void main(String[] args)throws IOException
	{
		File file1=new File("D:SampleOutputWriter.txt");
		int len=(int) file1.length();
		try(FileReader fr=new FileReader(file1))
		{

			char[] x=new char[len];
      //  fr.close(); TO close the reader
			fr.read(x,0,4);
      //fr.skip(1); Skips Characters
			String filecontent=new String(x);

			System.out.println(filecontent);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
