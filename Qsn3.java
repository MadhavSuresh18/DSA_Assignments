package First_Java_Program;

import java.util.Scanner;

public class Qsn3 {
    public static void main(String[] args) {
        //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner in=new Scanner(System.in);
        System.out.println("Enter principle amount");
        double Pri=in.nextDouble();
        System.out.println("enter number of years");
        int Years=in.nextInt();
        System.out.println("Enter interest rate");
        double rate=in.nextDouble();

        double PNR=Pri*Years*rate;
        double Simp_int=PNR/100;
        System.out.println("Simple interest :"+Simp_int);
    }
}
