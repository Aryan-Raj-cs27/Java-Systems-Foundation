class even_sum
{
    public static void main (String args[])
    {
        int i,sum = 0;
        for(i=100;i<=500;i++)
        {
            if(i%2==0)
            {
                if (i%4!=0 && i%5!=0)
                {
                    sum += i;
                }
            }
        }
        System.out.println("Sum = "+sum);
    }
}