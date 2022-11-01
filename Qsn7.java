package First_Java_Program;

import java.util.Scanner;

public class Qsn7 {
    public static void main(String[] args) {
        //To find out whether the given String is Palindrome or not.
        Scanner in=new Scanner(System.in);
        String a=in.next();
        String b=in.next();

        boolean p=a.equals(b);
        System.out.println(p);
    }
}
