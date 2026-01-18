import java.io.*;
import java.lang.*;
class Fun_CI
{
    void ci(float p,float r,float t)
    {
        float i,ci,rate=1;
        for(i=1;i<=t;i++)
        {
            rate = rate*(1+(r/100));;
        }
        ci = (p*rate)-p;
        System.out.println("Compound interest of "+p+ " for "+t+" at "+r+"% intrest per annum is "+ci);
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader ob1 = new BufferedReader(ob);
        {
            float P,R,T;
            System.out.println("Enter the Principle:");
            P = Float.parseFloat(ob1.readLine());
            System.out.println("Enter the Rate of Interest:");
            R = Float.parseFloat(ob1.readLine());
            System.out.println("Enter the Time period:");
            T = Float.parseFloat(ob1.readLine());
            Fun_CI ci = new Fun_CI();
            ci.ci(P,R,T);
        }
    }
}