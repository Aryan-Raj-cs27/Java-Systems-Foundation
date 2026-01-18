import java.util.*;
class SP_NoRepeat
{
    String word;
    int len;
    SP_NoRepeat(String wd)
    {
        word = wd.toUpperCase();
        len = word.length();
    }
    
    boolean check()
    {
        for(int i=0;i<len;i++)
        {
            int count = 0;
            for(int j=0;j<len;j++)
            {
                if(word.charAt(j)==word.charAt(i))
                {
                    count++;
                }
            }
            if(count>1)
            {
                return true;
            } 
        }
        return false;
    }
    
    void prn()
    {
        if(check())
        {
            System.out.println("The Word "+word+" has repeated alphabets ");
        }
        else
        {
            System.out.println("The Word "+word+" has no repeated alphabets ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word : ");
        SP_NoRepeat obj = new SP_NoRepeat(sc.nextLine());
        obj.prn();
    }
}