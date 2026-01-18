import java.util.*;
class ClaO_Marks_Ary
{
    String nm[] = new String[5];
    int marks[][] = new int[5][3];
    int t,a,i,j;
    String sub[] = new String[3];
    void input()
    {
        Scanner sc = new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            System.out.print("Enter Subject "+(i+1)+" : ");
            sub [i] = sc.next();
        }
        for(i=0;i<5;i++)
        {
            System.out.print("Enter Name "+(i+1)+" : ");
            nm[i] = sc.next();
            for(j=0;j<3;j++)
            {
                System.out.print("Enter Marks "+sub[j]+" : ");
                marks[i][j] = sc.nextInt();
            }
        }
    }
    void display()
    {
        System.out.println("\nName\tphy\tchem\tmath\tTotal\tAverage");
        for(i=0;i<5;i++)
        {
            t = 0;
            a = 0;
            System.out.print(nm[i]+"\t");
            for(j=0;j<3;j++)
            {
                System.out.print(marks[i][j]+"\t");
                t += marks[i][j];
            }
            a = t/3;
            System.out.println(t+"\t"+a);
        }
    }
    public static void main(String args[])
    {
        ClaO_Marks_Ary obj = new ClaO_Marks_Ary();
        obj.input();
        obj.display();
    }
}