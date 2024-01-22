package strings;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");
        String s = sc.nextLine();

        String[] sa=s.split("\\s");

        for(int i=0;i<sa.length;i++)
        {
            StringBuffer sb=new StringBuffer(sa[i]);
            sb.reverse();
            sa[i]=sb.toString();
        }

        for(int i=0;i<sa.length;i++)
        {
            System.out.print(sa[i]+" ");
        }
    }
}
