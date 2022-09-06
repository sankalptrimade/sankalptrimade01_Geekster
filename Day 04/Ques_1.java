import java.util.Scanner;

public class Ques_1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter two numbers to check the largest");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            //larger  number logic
            if(num1 > num2)
                System.out.println(num1+" is the largest number");
            else if(num2 > num1)
                System.out.println(num2+" is the largest number");
            else 
            System.out.println("Numbers are equal");
        }
        
    }
    
}