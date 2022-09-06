import java.util.Scanner;

public class Ques_2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number to check whether its even or odd");
            int num = sc.nextInt();

            // logic for even and odd 
            if(num%2 == 0)
                System.out.println(num+" is an even number");
            else 
                System.out.println(num+" is an odd number");
        }
        
    }
}
