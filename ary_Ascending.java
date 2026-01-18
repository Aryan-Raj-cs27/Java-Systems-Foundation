import java.util.*;
class ary_Ascending
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n[] = new int[5];
        int i,j,s=0,temp;
        for(i=0;i<5;i++)
        {
            n[i] = sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            for(j=0;j<4;j++)
            {
                if(n[j]>n[j+1])
                {
                    temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
            }
        }
        System.out.println("\nAfter Sorting\n");
        for(i=0;i<5;i++)
        {
            System.out.print(n[i]+" ");
        }
    }
}