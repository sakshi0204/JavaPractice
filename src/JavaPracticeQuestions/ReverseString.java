package JavaPracticeQuestions;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        int i;
        String s1;
        System.out.println("enter the string");
        Scanner obj=new Scanner(System.in);
        s1=obj.nextLine();
        for(i=s1.length()-1;i>=0;i--){// we are using length-1 beacuse length method is not working as n-1 its consider whole length so suppose length is five but index working from 0 to n-1 only thats why we use s1.length()-1
                System.out.print(s1.charAt(i));

        }
    }
}
