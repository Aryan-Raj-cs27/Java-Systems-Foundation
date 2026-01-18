import java.io.*;
class SwitCase_1
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            int n;
            System.out.println("1 forAddition:");
            System.out.println("2 for Subtraction");
            System.out.println("3 for Multiplication");
            System.out.println("4 for Division");
            System.out.println("5 for Exit");
            System.out.println("Option");
            n = Integer.parseInt(ob1.readLine());
            switch(n)
            {
                case 1:
                System.out.println("Addition:");
                break;
                case 2:
                System.out.println("Subtraction");
                break;
                case 3:
                System.out.println("Multiplication");
                break;
                case 4:
                System.out.println("Division");
                break;
                case 5:
                System.out.println("Exit");
                break;
            }
        }
    }
}