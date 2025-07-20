package JavaPracticeQuestions;
import java.util.Scanner;
public class InheritancePractice2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("ENter your Age");
        int age=sc.nextInt();
        System.out.println("Enter your Employee id");
        int empid= sc.nextInt();
        System.out.println("Enter your Salary");
        double salary=sc.nextDouble();

        Person p1=new Person(name,age);
        p1.displayInfo();
        Employe e1=new Employe(name,age,empid,salary);
        e1.displayInfo();

    }
}
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo(){
       System.out.println("Name: "+name+" "+"Age: "+age);
    }
}

class Employe extends Person{
    int emp_id;
    double salary;

    public Employe(String name,int age, int emp_id, double salary)
    {
        super(name,age);
        this.emp_id = emp_id;
        this.salary = salary;
    }

    @Override
    void displayInfo() {
        System.out.println("Name: "+name+" "+"Age: "+age+" "+"EmpId: "+emp_id+" "+"Salary: "+salary);
    }
}
