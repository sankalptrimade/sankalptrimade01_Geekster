import java.util.Scanner;

public class Ques_3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int x = sc.nextInt();
            if(x>1000)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}

