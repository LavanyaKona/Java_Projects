package Array;

import java.util.Scanner;

public class arrayZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
              a[j]=a[i];
              j++;
            }
        }
        while (j < n) {
            a[j] = 0;
            j++;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
