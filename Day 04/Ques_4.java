import java.util.Scanner;

public class Ques_4 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your marks");
            int marks = sc.nextInt();

            if(marks < 33)
                System.out.println("Final marks is: "+(marks+4));
            else 
                System.out.println("Final marks is: "+marks);
        }
    }
}
