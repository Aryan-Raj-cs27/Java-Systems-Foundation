class Pattern_10
{
    void P10()
    {
        int i,j;
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        for(i=i-2;i>0;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i);                
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Pattern_10 obj = new Pattern_10();
        obj.P10();
    }
}