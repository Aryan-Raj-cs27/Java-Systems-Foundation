class Pattern_12
{
    void P12()
    {
        int i,j,k,n,x,m;
        n = 5;
        m = n;
        for(k=1;n>0;n--)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(j);
            }
            for(x=m;x>n;x--)
            {
                System.out.print(" ");
            }
            for(j=n;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.print("\n");
            m++;
        }
    }
    public static void main(String args[])
    {
        Pattern_12 obj = new Pattern_12();
        obj.P12();
    }
}