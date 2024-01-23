package loops;

import java.util.Scanner;

public class Age {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter age");
        int n=sc.nextInt();

        if(n<13){
            System.out.println(" KID ");
        }
        else if(n>=13 && n<=19){
            System.out.println(" TEEN ");
        }
        else if(n>19){
            System.out.println(" ADULT ");
        }


    }
}
