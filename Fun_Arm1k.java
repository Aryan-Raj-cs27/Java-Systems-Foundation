import java.lang.*;
class Fun_Arm1k
{
    void Arm1k()
    {
        int i,j,p,n,x,a;
        for(i=1;i<=1000;i++)
        {
            n = i;
            a = 0;
            for(j=1;n>0;j++)
            {
                x = n%10;
                p = (x*x*x);
                a = a+p;
                n = n/10;
            }
            if(a==i)
            {
                System.out.println(a);
            }
        }
    }
    public static void main(String args[])
    {
        Fun_Arm1k arm = new Fun_Arm1k();
        arm.Arm1k();
    }
}