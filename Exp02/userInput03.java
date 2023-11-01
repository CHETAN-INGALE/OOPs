import java.io.*;

public class userInput03{
    public static void main(String[] args)
        throws IOException
    {    
        String name;
        int age;
        char gender;
        double salary;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("What is your name : ");
        name = reader.readLine();

        System.out.print("What is your age : ");
        age = Integer.parseInt((reader.readLine()));

        //System.out.print("What is your gender : ");
        //gender = reader.read().charAt(0);

        //System.out.print("What is your salary : ");
        //salary = reader.readDouble();

        System.out.print("\nName : " + name);
        System.out.print("\nAge : " + age);
        //System.out.print("\nGender : " + gender);
        //System.out.print("\nSalary : " + salary);
    }
}