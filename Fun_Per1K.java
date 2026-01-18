import java.lang.*;
class Fun_Per1K
{
    void per1k()
    {
        int i,n,j,p;
        for(i=1;i<=1000;i++)
        {
            p =0;
            n = i;
            for(j=1;j<n;j++)
            {
                if(n%j==0)
                {
                    p = p+j;
                }
            }
            if(p==n)
            {
                System.out.println(p);
            }
        }
    }
    public static void main(String args[])
    {
        Fun_Per1K perfect = new Fun_Per1K();
        perfect.per1k();
    }
}