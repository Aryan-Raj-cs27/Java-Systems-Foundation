import java.util.*;
class SP_CalSeries
{
    int x,n,sum;
    
    SP_CalSeries()
    {
        x=0;
        n=0;
        sum=0;
    }
    
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x : ");
        x = sc.nextInt();
        System.out.println("Enter value of n : ");
        n = sc.nextInt();
    }
    
    int power(int p, int q)
    {
        if(q==0)
        return 1;
        else 
        {
            return p*power(p,q-1);
        }
    }
    
    void cal()
    {
        for(int i=0;i<=n;i++)
        {
            sum = sum+power(x,i);
        }
        System.out.println("Sum of the series is : "+sum);
    }
    public static void main(String args[])
    {
        SP_CalSeries obj = new SP_CalSeries();
        obj.input();
        obj.cal();
    }
}