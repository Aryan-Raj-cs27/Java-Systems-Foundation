import java.util.*;
class Grade
{
    public static void main (String args[])
    {
        int marks;
        String name,roll,clas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the student :");
        name = sc.next();
        System.out.println("Enter class of the Student : ");
        clas = sc.next();
        System.out.println("Enter roll No. of the student :");
        roll = sc.next();
        System.out.println("Enter marks of the student :");
        marks = sc.nextInt();
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
}