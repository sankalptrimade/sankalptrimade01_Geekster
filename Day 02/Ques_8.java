import java.util.Scanner;

public class Ques_8 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if((a*b*c*d) > 1000)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
