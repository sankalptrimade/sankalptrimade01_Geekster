import java.util.Scanner;

public class Ques_6 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            boolean ans = 3 > 2;
            System.out.println(ans);            //true
            boolean ans1 = 3 >= 3;
            System.out.println(ans1);           //true
            boolean ans2 = 4 + 3 > 9;
            System.out.println(ans2);           //false
            boolean ans3 = 10 + 8 > 10;
            System.out.println(ans3);           //true
            boolean ans4 = 12 != 10;
            System.out.println(ans4);           //true
            boolean ans5 = (13 == 13);
            System.out.println(ans5);           //true
            boolean ans6 = 14 != 14;
            System.out.println(ans6);           //false
            boolean ans7 = 20 == 5*4;
            System.out.println(ans7);           //true
            boolean ans8 = 30 != 3+4-10;
            System.out.println(ans8);           //true
            boolean ans9 = 20 == 41/2;
            System.out.println(ans9);           //true
        }
    }
}
