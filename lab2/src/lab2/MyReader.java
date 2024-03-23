package lab2;
import java.io.*;

class MyReader extends FileReader
{
	File file;
	char [] content = new char[1000];
	MyReader(File file) throws Exception
	{
		super(file);
		this.file = file;
	}

	MyReader(String filename) throws Exception
	{
		super(filename);
		file = new File(filename);
	}

	public String readContent() throws Exception
	{
		BufferedReader reader = new BufferedReader(new MyReader(file));
		String line = reader.readLine();
		while (line != null) {
		    return line;
		}
		
		return null;
	/*	Algorithm : Get data from file in String representation
                        Input : -
                        Output: String data
                        // Tips: use class BufferedReader
                       Start :
1.0	loop until end of file //may use .readLine with while loop
1.1	assign the string to a temporary string
1.2	append a string variable with the temporary string
2.0	Return String data
End
             */
		
	}

	public static void main(String [] args) throws 
     Exception
	{
		MyReader reader = new MyReader("Welcome.txt");
		System.out.println(reader.readContent());

	     File file = new File("Welcome.txt");
		MyReader reader2 = new MyReader(file);
		System.out.println(reader2.readContent());
	}

}
