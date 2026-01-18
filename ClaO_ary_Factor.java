import java.util.*;
class ClaO_ary_Factor
{
    int f[] = new int[5];
    int n[] = new int[5];
    int i,j;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.print("Enter "+(i+1)+" Number : ");
            n[i] = sc.nextInt();
            System.out.println("\n\n");
            f[i] = 1;
        }
    }
    void calc()
    {
        for(i=0;i<5;i++)
        {
            for(j=1;j<=n[i];j++)
            {
                f[i] = f[i]*j;
            }
        }
    }
    void display()
    {
        for(i=0;i<5;i++)
        {
            System.out.println("Factor of "+n[i]+" = "+f[i]);
        }
    }
    public static void main(String args[])
    {
        ClaO_ary_Factor obj = new ClaO_ary_Factor();
        obj.input();
        obj.calc();
        obj.display();
    }
}