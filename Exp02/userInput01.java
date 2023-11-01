import java.io.*;

public class userInput01{
    public static void main(String[] args)
        throws IOException
    {    
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter your name: ");
        String name = reader.readLine();
        System.out.println(name);
    }
}