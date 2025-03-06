import java.util.Scanner;

public class EqualOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        Boolean check1 = s1.equals(s2);
        Boolean check2 = true;
        if (s1.length() == s2.length()) {

            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    check2 = false;
                    break;
                }
            }
            System.out.println("Comparison using Equals Method result is :" + check1);
            System.out.println("Comparison using Loop with charAt() result is : " + check2);

            if (check1 == check2) {
                System.out.print("Both comparison gave same result");
            } else System.out.print("Different results");

        }
        else System.out.println("Not Equal , length is not same");
    }
}6