package JavaPracticeQuestions;

import java.util.Scanner;

public class PrintEachCharacter {

    public static void main(String[] args) {
        int i;
        String s1;

        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        // s1=sc.next();//takes length for the first world before space
        s1 = sc.nextLine();//takes length including space
        //int s2=s1.length();

        for (i = 0; i < s1.length(); i++) {

            System.out.println(s1.charAt(i));

        }

    }
}

