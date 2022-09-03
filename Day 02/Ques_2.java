import java.util.Scanner;

public class Ques_2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            double height = sc.nextDouble();
            double base = sc.nextDouble();
            double area = 0.5 * base * height;
            System.out.println("Area of Triangle: "+area);
        }
    }
}
