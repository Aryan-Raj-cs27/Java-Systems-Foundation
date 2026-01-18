import java.util.*;
class Like_unlike
{
    public static void main(String args[])
    {
        String n1,n2;
        int i,L1,L2,m=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name:");
        n1 = sc.next();
        System.out.println("Enter second name:");
        n2 = sc.next();
        L1 = n1.length();
        L2 = n2.length();
        if(L1==L2)
        {
            for(i=0;i<L1;i++)
            {
                if(n1.charAt(i)==n2.charAt(i))
                {
                    m++;
                }
            }
            if(m==L1)
            {
                System.out.println("Both are like String.");
            }
            else
            {
                System.out.println(n1+" and "+n2+" are unlike String.");
            }
        }
        else
        {
            System.out.println(n1+" and "+n2+" are unlike String.");
        }
    }
}