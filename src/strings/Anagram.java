package strings;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String1");
        String s1=sc.next();

        System.out.println("Enter String2");
        String s2=sc.next();

        int[] counter=new int[26];

        if(s1.length()==s2.length())
        {
            for(char c: s1.toCharArray()){
                counter[c-'a']++;
            }
            for(char c: s2.toCharArray()){
                counter[c-'a']--;
            }

            for(int i: counter){
                if(counter[i]!=0){
                    System.out.println("Not anagrams");
                    break;
                }
            }
            System.out.println("Given strings are Anagrams");
        }
        else{
            System.out.println("Not anagrams");
        }




    }
}
