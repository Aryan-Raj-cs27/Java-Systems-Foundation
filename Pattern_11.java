class Pattern_11
{
    void P11()
    {
        int i,j,x=1;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(x);
                x++;
            }
            if(x>2)
            x--;
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Pattern_11 obj = new Pattern_11();
        obj.P11();
    }
}