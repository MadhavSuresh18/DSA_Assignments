package First_Java_Program;

import java.util.Scanner;

public class Qsn4 {
    public static void main(String[] args) {
        //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner in=new Scanner(System.in);
        char op=in.next().trim().charAt(0);

        if(op=='+' || op=='-' || op=='*' || op=='/'){
            System.out.println("Enter two number :" );
            int a=in.nextInt();
            int b=in.nextInt();
            if(op=='+'){
                System.out.println(a+b);
            }
            if(op=='-'){
                System.out.println(a-b);
            }
            if(op=='*'){
                System.out.println(a*b);
            }
            if(op=='/') {
                if (b > a) {
                    System.out.println(a / b);
                }
            }


        }
        else {
            System.out.println("Invalid input");
        }
    }
}
