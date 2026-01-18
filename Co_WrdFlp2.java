import java.util.*;
class Co_WrdFlp2
{
    String nm;
    int l;
    Co_WrdFlp2(String n)
    {
        nm = n;
        l = nm.length();
    }
    void display()
    {
        int i;
        for(i=(l-1);i>=0;i--)
        {
            System.out.print(nm.charAt(i)+"");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String m;
        System.out.println("Enter Word : ");
        m = sc.next();;
        Co_WrdFlp2 obj = new Co_WrdFlp2(m);
        obj.display();
    }
}