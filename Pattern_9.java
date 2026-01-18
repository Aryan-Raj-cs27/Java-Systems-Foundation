class Pattern_9
{
    void P9()
    {
        int i,j,x=3;
        for(i=1;i<=3;i++)
        {
            System.out.println("*");
            for(j=1;j<x;j++)
            {
                System.out.print(j);
            }
            x = x+2;
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Pattern_9 obj = new Pattern_9();
        obj.P9();
    }
}