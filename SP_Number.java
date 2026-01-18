import java.util.*;
class SP_Number
{
    long num;
    SP_Number()
    {
        num = 0;
    }
    
    SP_Number(long n)
    {
        num = n;
    }
    
    void digitFrequency()
    {
        int n = 0,c = 0, t;
        long N;
        for(int i=0;i<=9;i++)
        {
            c = 0;
            N = num;
            while(N>0)
            {
                t = (int) N%10;
                if(t==i)
                {
                    c++;
                }
                N = N/10;
            }
            if(c>0)
            {
                System.out.println(i+"\t"+c);
            }
        }
    }
    
    int sumDigits()
    {
        long sum = 0, A = 0;
        long P = 0;
        P = num;
        while (P!=0)
        {
            A = P%10;
            sum += A;
            P = P/10;
        }
        return ((int)sum);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        SP_Number obj = new SP_Number(sc.nextInt());
        obj.digitFrequency();
        int s = obj.sumDigits();
        System.out.println("Sum of digits of the number : "+s);
    }
}