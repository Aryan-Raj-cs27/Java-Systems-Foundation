import java.util.*;
class ary_edit
{
    public static void main(String args[])
    {
        int i,j,n,c;
        int nm[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.println("");
            System.out.print("Enter number : ");
            nm[i] = sc.nextInt();
            System.out.println("");
        }
        System.out.print("Enter number to Edit : ");
        n = sc.nextInt();
        System.out.print("\nEnter number behalf of "+n+" : ");
        c = sc.nextInt();
        System.out.println("");
        for(i=0;i<5;i++)
        {
            if(nm[i] == n)
            {
                nm[i] = c;
            }
            System.out.print(nm[i]);
        }
    }
}