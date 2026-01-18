import java.util.*;
class CM_Number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("m = ");
        int m = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();
        int i,j,f,x,num,s=0,c=0;
        if(m<1 || n<1 || m>n)
        {
            System.out.println("\nInvalid Input");
            return;
        }
        System.out.println("Composite Magic Integer from "+m+" to "+n+" are : \n");
        for(i=m;i<=n;i++)
        {
            f = 0;
            for(j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    f++;
                }
            }
            if(f>2 && i!=1)
            {
                num = i;
                while(num>9)
                {
                    s = 0;
                    while(num>0)
                    {
                        x = num%10;
                        num = num/10;
                        s += x;
                    }
                    num = s;
                }
                if(s==1)
                {
                    System.out.print(i+" ");
                    c++;
                }
            }
        }
        System.out.println("\n\nFrequency of Composite Magic Integer is : "+c);
    }
}