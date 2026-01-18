import java.util.*;
class ary_delete
{
    public static void main(String args[])
    {
        int i,j,n;
        int nm[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.println("");
            System.out.print("Enter number : ");
            nm[i] = sc.nextInt();
            System.out.println("");
        }
        System.out.print("Enter number to Delete : ");
        n = sc.nextInt();
        System.out.println("");
        for(i=0;i<5;i++)
        {
            if(nm[i] == n)
            {
                nm[i] = 0;
            }
            System.out.print(nm[i]);
        }
    }
}