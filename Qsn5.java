package First_Java_Program;

import java.util.Scanner;

public class Qsn5 {
    public static void main(String[] args) {
        //Take 2 numbers as input and print the largest number.
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        if(a>b){
            System.out.println("Max:"+a);
        }
        else{
            System.out.println("Max:"+b);
        }
    }
}
