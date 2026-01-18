import java.util.*;
class DDA_Transpose
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of '3x3' Matrix :");
        int n[][] = new int[3][3];
        int i,j,temp;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                n[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nEntered Matrix :");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(n[i][j]+"\t");
            }
            System.out.println("");
        }
        for(i=0;i<3;i++)
        {
            for(j=i;j<3;j++)
            {
                temp = n[i][j];
                n[i][j] = n[j][i];
                n[j][i] = temp;
            }
        }
        System.out.println("\nTranspose of Matrix :");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(n[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}