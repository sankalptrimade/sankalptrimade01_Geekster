import java.util.Scanner;

public class Ques_6 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your salary");
            int salary = sc.nextInt();
            System.out.println("Enter your age");
            int age = sc.nextInt();

            if(age > 60)
                System.out.println("1000 added to your salary\nTotal Salary: "+(salary+1000));
            else if(age > 40)
                System.out.println("500 added to your salary\nTotal Salary: "+(salary+500));
            else
            System.out.println("No money added\nTotal Salary: "+(salary+1000));
        }
    }
}
