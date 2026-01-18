import java.util.*;
class Perfect_no_100
{
    public static void main(String args[])
    {
        int i,j,p=0,n=6;
        for (j=1;j<=100;j++)
        {
            for(i=1;i<n;i++)
            {
                if (n%i==0)
                {
                    p = p+i;
                }
            }
            if(p==n)
            {
                System.out.print(n+" ");
            }
            n++;
            p=0;
        }
    }
}