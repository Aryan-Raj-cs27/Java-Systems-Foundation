import java.util.*;
class ary_Search
{
    public static void main(String args[])
    {
        int i,j,n;
        int nm[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            System.out.print("Enter number : ");
            nm[i] = sc.nextInt();
        }
        System.out.print("Enter number to Search : ");
        n = sc.nextInt();
        for(i=0;i<10;i++)
        {
            if(nm[i] == n)
            {
                System.out.println(n+" found\nPosition of "+n+" is : "+(i+1));
            }
        }
    }
}