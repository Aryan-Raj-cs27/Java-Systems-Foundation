import java.util.*;
class DDA_RowSum
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
        System.out.println("\nSum of row of Matrix are :\n");
        for(i=0;i<3;i++)
        {
            sum = 0;
            for(j=0;j<3;j++)
            {
                System.out.print(n[i][j]+"\t");
                sum = sum+n[i][j];
            }
            System.out.print("= "+sum+"\n");
        }
    }
}