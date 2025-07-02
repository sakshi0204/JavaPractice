package JavaPracticeQuestions;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        EvenOdd eo1 = new EvenOdd();
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        eo1.findEvenOdd(num,sc);

    }

    void findEvenOdd(int num,Scanner sc) {
        int e=0,o=0;
        int[] arr = new int[num];
        System.out.println("enter the " + num + " numbers in the array");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            if (arr[i] % 2 == 0) {
                e++;
            }
            else {
                o++;
            }
        }
        System.out.println("Total even numbers are "+e);

        System.out.println("Total odd numbers are "+o);
    }
}
