package JavaPracticeQuestions;
import java.util.HashSet;
import java.util.Scanner;
public class HashSetRemoveDuplicates
{
    public static void main(String[] args)
    {
        HashSet<Integer> hs=new HashSet<>();
        System.out.print("Enter the size of the input: ");
        Scanner ob=new Scanner(System.in);
        int num=ob.nextInt();
        System.out.print("Enter the "+num+" numbers: ");
        for(int i=0;i<num;i++){
        int input=ob.nextInt();
        hs.add(input);
        }
        System.out.print("Hashset Contents: "+" ");

        for(int j:hs)
        {
            System.out.print(j+" ");

        }
    }
}
