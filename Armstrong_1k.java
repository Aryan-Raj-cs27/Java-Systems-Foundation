import java.util.*;
class Armstrong_1k
{
    public static void main(String args[])
    {
        int i,j,n,x,a;
        for(i=1;i<=1000;i++)
        {
            n = i;
            a = 0;
            for(j=1;n>0;j++)
            {
                x = n%10;
                a = a+(x*x*x);
                n = n/10;
            }
            if(a==i)
            {
                System.out.println(i);
            }
        }
    }
}