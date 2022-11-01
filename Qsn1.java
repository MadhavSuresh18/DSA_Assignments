package First_Java_Program;

import java.util.Scanner;

public class Qsn1 {
    public static void main(String[] args) {
        //Write a program to print whether a number is even or odd, also take input from the user.
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int c=n%2;
        if(c==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
