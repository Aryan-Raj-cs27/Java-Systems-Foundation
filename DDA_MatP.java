import java.util.*;
class DDA_MatP
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order of Matrix :");
        int n = sc.nextInt();
        int m[][] = new int[n][n];
        int i,j;
        System.out.println("\nEnter elements of Matrix :\n");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                m[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nElements of order '"+n+"x"+n+"' in Matrix format is :\n");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}