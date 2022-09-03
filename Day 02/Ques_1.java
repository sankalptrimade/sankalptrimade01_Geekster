import java.util.Scanner;

public class Ques_1{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int diameter = sc.nextInt();
            int radius = diameter/2;
            int area = (22*radius*radius)/7;
            System.out.println("Area of circle is: "+area);
        }
    }
}