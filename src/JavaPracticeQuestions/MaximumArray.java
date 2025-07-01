package JavaPracticeQuestions;
import java.util.Scanner;
public class MaximumArray {
    public static void main(String[] args) {
        int i,max;
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of an array"); THIS MEANS IF USER WANT THE SIZE OF ARRAY ITS CHOICE(Dynamic Array)
//         num=sc.nextInt();
        // int arr[]=new int[num];

        int[] arr=new int[5];
        System.out.println("Enter the 5 value in an array");


        for(i=0;i<arr.length;i++)
        {
        arr[i]=sc.nextInt();

        }
        max=arr[0];
        for(i=1;i<arr.length;i++){
            if(max<arr[i])
            {
                max=arr[i];
            }

        }
        System.out.println("Maximum value is: "+max);

    }
}
