package strings;

import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String var=sc.next();

        var.toLowerCase();
        char[] var1= var.toCharArray();
        int count=0;

        for(int i=0;i<var1.length;i++)
        {
            char c=var1[i];
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                count++;

        }
        System.out.println("Total number of vowels in a string"+ var+" is: "+ count);
    }

}
