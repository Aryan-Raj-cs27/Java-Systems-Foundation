import java.io.*;
class Fun_add
{
    void add(int a,int b)
    {
        int c;
        c = a+b;
        System.out.println("Answer = "+c);
    }
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob); 
        int x,y;
        System.out.println("Enter the first number :");
        x = Integer.parseInt(ob1.readLine());
        System.out.println("Enter the second number :");
        y = Integer.parseInt(ob1.readLine());
        Fun_add fun = new Fun_add();
        fun.add(x,y);
    }
}