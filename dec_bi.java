import java.util.*;
class dec_bi
{
    public static void main(String args[])
    {
        int i,n,r,s=0,x=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = sc.nextInt();
        for(i=n;n>0;i++)
        {
            r = n%2;
            s = s+r*x;
            x = x*10;
            n = n/2;            
        }
        System.out.println(""+s);
    }
}