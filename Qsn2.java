package First_Java_Program;

import java.util.Scanner;

public class Qsn2 {
    public static void main(String[] args) {
        //Take name as input and print a greeting message for that particular name.
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a name:");
        String s=in.nextLine();
        System.out.println("Hello "+s+" .How are you?");
    }
}
