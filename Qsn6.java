package First_Java_Program;

import java.util.Scanner;

public class Qsn6 {
    public static void main(String[] args) {
        //Input currency in rupees and output in USD
        Scanner in=new Scanner(System.in);
         int RS=in.nextInt();

         double Dol=RS*0.012;
        System.out.println(Dol);
    }
}
