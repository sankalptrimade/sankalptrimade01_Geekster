import java.util.Scanner;

public class Ques_5 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your age");
            int age = sc.nextInt();

            if(age >= 70)
                System.out.println("Super Senior Citizen");
            else if(age >= 59)
                System.out.println("Senior Citizen");
            else if(age >= 18)
                System.out.println("Adult");
            else if(age >= 1)
                System.out.println("Underage");
            else 
                System.out.println("New Born");
        }
    }
}
