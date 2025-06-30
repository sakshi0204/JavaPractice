package JavaPracticeQuestions;
import java.util.Scanner;

public class CountNumberOfCharacters {
    public static void main(String[] args) {
        int i, c = 0;
        String s1;

        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        for (i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != ' ') {
                c++;
            }

        }
        System.out.println(c);

    }
}

