import java.io.*;
class R
{
	public static void main(String arg[])throws IOException
	{
		FileInputStream f1=null;
		FileOutputStream f2=null;
		try
		{
			f1=new FileInputStream("read.txt");
			f2=new FileOutputStream("write.txt");
			int check;
			do
			{
				check=f1.read();
				if(check!=-1)
				{
					f2.write(check);
					System.out.print((char)check);
				}
			}while(check!=-1);
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			f1.close();
			f2.close();
		}
	}
}
