import java.util.*;
class DDA_DiagAddR
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of '3x3' Matrix :");
        int n[][] = new int[3][3];
        int i,j,sum=0;
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
        System.out.println("Sum of the Diagonal of given Matrix are :");
        for(i=0;i<3;i++)
        {  
            for(j=2;j>=0;j--)
            {
                sum += n[i][j];
                System.out.print(n[i][j]+" + ");
                i++;
            }
        }
        System.out.print("= "+sum);
    }
}