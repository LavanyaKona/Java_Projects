package Array;

import java.util.Scanner;

public class arrayLRotation {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter array size");
            int n= sc.nextInt();
            System.out.println("Enter array elements");
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println("Enter value of x");
            int x=sc.nextInt();
            int[] b=new int[x];
            for(int i=0;i<x;i++)
            {
                b[i]=a[i];
            }
            int j=0;
            for(int i=0;i<n;i++)
            {
                if(n>i+x)
                    a[i]=a[i+x];
                else
                {
                    a[i]=b[j];
                    j++;
                }
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }

    }
}
