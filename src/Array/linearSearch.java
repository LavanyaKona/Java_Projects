package Array;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter element to be searched");
        int s=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(s==a[i])
                System.out.println("Element is in position "+i);
        }
    }
}
