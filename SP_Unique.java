//program to check whether a word begins and ends with vowels
import java.util.*;
public class SP_Unique 
{
    String word;
    int len;

    SP_Unique() 
    {
        word = "";
        len = 0;
    }

    void acceptword() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        word = sc.nextLine();
        word = word.toUpperCase();
        len = word.length();
    }

    boolean checkunique() 
    {
        String vowel = "AEIOU";
        
        if(vowel.indexOf(word.charAt(0))>=0)
        {
            if(vowel.indexOf(word.charAt(len-1))>=0)
            {
                return true;
            }
        }
        return false;
    }

    void display() 
    {
        if (checkunique()) 
        {
            System.out.println("The word " + word + " starts and ends with vowels.");
        } 
        else
        {
            System.out.println("The word " + word + " does not start and end with vowels.");
        }
    }
    public static void main(String[] args) 
    {
        SP_Unique obj = new SP_Unique();
        obj.acceptword();
        obj.display();
    }
}