import java.util.*;
class bi_dec
{
    public static void main(String args[])
    {
        int n,i,j,p=1,d=0,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number:");
        n = sc.nextInt();
        for(i=1;n>0;i++)
        {
            x = n%10;
            for(j=1;j<i;j++)
            {
                p = p*2;
            }
            d = d+(x*p);
            n = n/10;
            p = 1;
        }
        System.out.println(d);
    }
}