import java.util.*;
class result
{
    public static void main(String args[])
    {
        double clas,p,c,m,t,a,per;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name, class of student :");
        name = sc.next();
        clas = sc.nextDouble();
        System.out.println("Enter the marks of physics, chemistry and math of student :");
        p = sc.nextDouble();        
        c = sc.nextDouble();
        m = sc.nextDouble();
        t = p+c+m;
        a = t/3;
        per = (t*100)/300;
        System.out.println("Name of student : "+name);
        System.out.println("Class of student : "+clas);
        System.out.println("Total marks of student : "+t);
        System.out.println("Average of student : "+a);
        System.out.println("Percentage of student : "+per);
    }
}