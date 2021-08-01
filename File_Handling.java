// Creating a text File using FileWriter
import java.io.FileWriter;
import java.io.IOException;
class CreateFile
{
    public static void main(String[] args) throws IOException
    {
        // Accept a string 
        String str = "File Handling in Java using "+
                " FileWriter and FileReader";
  
        // attach a file to FileWriter 
        FileWriter fw=new FileWriter("output.txt");
  
        // read character wise from string and write 
        // into FileWriter 
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));
  
        System.out.println("Writing successful");
        //close the file 
        fw.close();


        FileReader fr=null;
        try
        {
            fr = new FileReader("text");
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }
  
        // read from FileReader till the end of file
        while ((ch=fr.read())!=-1)
            System.out.print((char)ch);
  
        // close the file
        fr.close();

        File file =
      new File("C:\\Users\\pankaj\\Desktop\\test.txt");
    Scanner sc = new Scanner(file);
  
    }
}