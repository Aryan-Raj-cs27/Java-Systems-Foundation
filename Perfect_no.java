import java.util.*;
class Perfect_no
{
    public static void main(String args[])
    {
        int i,n,x=0,p=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        n = sc.nextInt();
        for(i=1;i<n;i++)
        {
            if (n%i==0)
            {
                p = p+i;
            }
        }
        if(p==n)
        {
            System.out.println(n+" is a Perfect number.");
        }
        else
        {
            System.out.println(n+" is not a perfect number.");
        }
    }
}