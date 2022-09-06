import java.util.Scanner;

public class Ques_3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your income");
            int income = sc.nextInt();

            if(income >= 500000)
                System.out.println("Tax to be paid");
            else 
                System.out.println("No tax to be paid");
        }

    }
}
