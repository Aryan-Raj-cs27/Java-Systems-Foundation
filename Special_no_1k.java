import java.util.*;
class Special_no_1k
{
    public static void main(String args[])
    {
        int i,t,j,k,r,x,y;
        for(i=1;i<=1000;i++)
        {
            t=i;
            y=0;
            for(j=t;t>0;j++)
            {
                r=t%10;
                t=t/10;
                x=1;
                for(k=1;k<=r;k++)
                {
                    x=x*k;
                }
                y=y+x;
            }
            if(y==i)
            {
                System.out.println(y);
            }
        }
    }
}