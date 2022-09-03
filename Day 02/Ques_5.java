import java.util.Scanner;

public class Ques_5 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int x = 7+3+4;
            System.out.println(x);          //14
            int y = 12 + 5 + 8;
            System.out.println(y);          //25
            int z = 13/5 + 18/8;
            System.out.println(z);          //4
            double a = 12 + 5.0 + 2.76;
            System.out.println(a);          //19.759999999999998
            double b = 12/3 + 13/2;
            System.out.println(b);          //10.0
            double c =12/3 + 13.0/2;
            System.out.println(c);          //10.5
            double d = 14/2 + 15.0/4;
            System.out.println(d);          //10.75
            double e = 13/2 % 5/3;
            System.out.println(e);          //0.0
            double f = 17.0/2 % 16.0/4;
            System.out.println(f);          //2.125
        }
    }
}
