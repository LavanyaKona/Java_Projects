package array;

import java.util.Scanner;

public class MinandMax {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n= sc.nextInt();

        System.out.println("Enter array elements");

        int[] a=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int max=a[0];
        int min=a[0];

        for(int i=0;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
            else if(min>a[i])
            {
                min=a[i];
            }
        }

        System.out.println("Largest no: "+max);
        System.out.println("Smallest no: "+min);

    }
}
