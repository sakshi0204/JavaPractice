package JavaPracticeQuestions;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ArrayListAddAndPrint {
    public static void main(String[] args) {
        int i;
    List<Integer> a1=new ArrayList<>();
    System.out.print("Enter the size of an array: ");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    System.out.print("enter "+num+" numbers: ");
    for (i=0;i<num;i++){
        int input= sc.nextInt();
        a1.add(input);
    }
    System.out.println("ArrayList contents "+a1);
    System.out.println("Values: ");

    for(int j : a1){
        System.out.println(j +" ");

    }
//    for(i=0;i<num;i++){
//        System.out.println(a1.get(i) +" ");
//
//    }
    }
}
