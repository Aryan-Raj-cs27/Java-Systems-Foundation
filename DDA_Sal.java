import java.util.*;
class DDA_Sal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String nm[][] = new String[2][2];
        String ad[][] = new String[2][2];
        int sal[][] = new int[2][2];
        int i,j;
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print("\nEnter Name : ");
                nm[i][j] = sc.next();
                System.out.print("\nEnter Adress of "+nm[i][j]+" : ");
                ad[i][j] = sc.next();
                System.out.print("\nEnter salary of "+nm[i][j]+" : ");
                sal[i][j] = sc.nextInt();
                System.out.println("");
            }
        }
        System.out.println("--------------------------------");
        System.out.println("Name\tAddress\tSalary");
        System.out.println("--------------------------------");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.println(nm[i][j]+"\t"+ad[i][j]+"\t"+sal[i][j]);
            }
        }
    }
}