import java.util.*;
class DDA_ColSum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of 3x3 Matrix :");
        int n[][] = new int[3][3];
        int i,j,sum=0;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                n[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Matrix is :");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(n[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("Sum of rows are :");
        for(j=0;j<3;j++)
        {
            sum = 0;
            for(i=0;i<3;i++)
            {
                sum = sum+n[i][j];
            }
            System.out.print(sum+"\t");
        }
    }
}