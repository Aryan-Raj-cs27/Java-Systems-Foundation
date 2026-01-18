import java.util.*;
class Decode1
{
    public static void main(String args[])
    {
        int i,l,a=0,s;
        String str1,str2 = "";
        char chr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coded text ");
        str1 = sc.nextLine();
        System.out.println("Enter shift : ");
        s = sc.nextInt();
        if((s<1)||(s>26))
        {
            System.out.println("Enter Invalid Input : ");
        }
        else 
        {
            l = str1.length();
            for(i=0;i<l;i++)
            {
                chr = str1.charAt(i);
                a = (int)chr+(s-1);
                if((char)a=='Q')
                {
                    if(str1.charAt(i+1)+(s-1)=='Q' && i<l)
                    {
                        a = 32;
                        i++;
                    }
                }
                if(a>90)
                a=a-26;
                str2 = str2+(char)a;
            }
        }
        System.out.println("Decoded Text : "+str2);
    }
}