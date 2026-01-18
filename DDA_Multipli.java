import java.util.*;
class DDA_Multipli
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements of 1st Matrix :");
        int n[][] = new int[3][3];
        int m[][] = new int[3][3];
        int mn[][] = new int[3][3];
        int i,j,sum=0,k;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                n[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nEnter Elements of 2nd Matrix :");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                m[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n\nMultiplication of :\n");
        for(k=0;k<3;k++)
        {
            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    sum += n[i][j]*m[j][k];
                }
                mn[i][k] = sum;
                sum=0;
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(n[i][j]);
                if(j==2)
                {
                    System.out.print("   ");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            if(i==1)
            {
                System.out.print("X   ");
            }
            else
            {
                System.out.print("    ");
            }
            for(j=0;j<3;j++)
            {
                System.out.print(m[i][j]);
                if(j==2)
                {
                    System.out.print("   ");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            if(i==1)
            {
                System.out.print("=   ");
            }
            else
            {
                System.out.print("    ");
            }
            for(j=0;j<3;j++)
            {
                System.out.print(mn[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}