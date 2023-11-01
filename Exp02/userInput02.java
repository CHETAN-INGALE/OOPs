import java.util.Scanner;

public class userInput02{
    public static void main(String[] args) {    
        String name;
        int age;
        char gender;
        double salary;

        Scanner console = new Scanner(System.in);

        System.out.print("What is your name : ");
        name = console.nextLine();

        System.out.print("What is your age : ");
        age = console.nextInt();

        System.out.print("What is your gender : ");
        gender = console.next().charAt(0);

        System.out.print("What is your salary : ");
        salary = console.nextDouble();

        System.out.print("\nName : " + name);
        System.out.print("\nAge : " + age);
        System.out.print("\nGender : " + gender);
        System.out.print("\nSalary : " + salary);

    }
}