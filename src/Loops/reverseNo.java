package Loops;

import java.util.Scanner;

public class reverseNo {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a,sum=0,t=n;
        while(n>0)
        {
            a=n%10;
            sum=sum*10+a;
            n=n/10;
        }
        System.out.println("Number entered: "+t+" , Reversed Number: "+sum);

    }
}
