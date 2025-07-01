package JavaPracticeQuestions;
import java.util.Scanner;
public class CountVowelConsonents {
    public static void main(String[] args) {
        String s1;
        int i,c=0,v=0;
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        for(i=0;i<s1.length();i++){
            if(s1.charAt(i)>='a' && s1.charAt(i)<='z'||s1.charAt(i)>'A' && s1.charAt(i)<='Z'){
                if("aeiou".indexOf(s1.charAt(i))!=-1){//this line traverse in this string indexof already have internally loop thts why it check each character in the index & dot operato to access the methods on objects like(string,indexOf,charAt,etc)
                    v++;
                }
                else{
                    c++;
                }
            }
            else {
                continue;
            }

        }
        System.out.println("Vowels are" +v);
        System.out.println("consonants are" +c);


    }
}
