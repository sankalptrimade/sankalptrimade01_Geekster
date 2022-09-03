import java.util.Scanner;

public class Ques_7 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            double sub1 = sc.nextDouble();
            double sub2 = sc.nextDouble();
            double sub3 = sc.nextDouble();
            double sub4 = sc.nextDouble();
            double sub5 = sc.nextDouble();
            double sum = sub1+sub2+sub3+sub4+sub5;
            double percentage = (sum/500)*100.0;
            System.out.println("Sum of marks: "+sum);
            System.out.println("Percentage: "+percentage);
        }
    }
}
