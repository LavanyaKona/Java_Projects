package array;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int t = a[0];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (a[i] > a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        //Done sorting
        System.out.println("Enter element to be searched");
        int s=sc.nextInt();

        int low=0;
        int high=n-1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == s) {
                System.out.println(" Element "+s+" is in position : "+mid);
                break;
            } else if (a[mid] < s) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

    }
}
