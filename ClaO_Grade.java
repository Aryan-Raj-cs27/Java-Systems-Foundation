import java.util.*;
class ClaO_Grade
{
    int i,a,b,c;int marks;
    String name,roll,clas;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the student :");
        name = sc.next();
        System.out.println("Enter class of the Student : ");
        clas = sc.next();
        System.out.println("Enter roll No. of the student :");
        roll = sc.next();
        System.out.println("Enter marks of the student :");
        marks = sc.nextInt();
    }
    void display()
    {
        if (marks>=70)
        {
            System.out.println("Grade is A+");
        }
         if (marks>=60&&marks<70)
        {
            System.out.println("Grade is A");
        }
         if (marks>=50&&marks<60)
        {
            System.out.println("Grade is B+");
        }
         if (marks>40&&marks<50)
        {
            System.out.println("Grade is B");
        }
         if (marks==40)
        {
            System.out.println("Grade is C");
        }
         if (marks<40)
        {
            System.out.println("Fail");
        }
    }
    public static void main(String args[])
    {
        ClaO_Grade obj = new ClaO_Grade();
        obj.input();
        obj.display();
    }
}
