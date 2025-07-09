package JavaPracticeQuestions;
import java.util.Scanner;
public class CountWordsInString {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int c=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)!=' '&& (i==0||str.charAt(i-1)==' ')) {

            c++;
            }

        }
        System.out.println(c);
    }
}
