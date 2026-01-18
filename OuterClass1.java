public class OuterClass1
{
    int a=10;
    class InnerClass
    {
        int b=20;
        void m1()
        {
            System.out.println(a+b);
        }
    }
    public static void main(String args[])
    {
        OuterClass1 o1=new OuterClass1();
        OuterClass1.InnerClass  i1 = o1.new InnerClass();
        System.out.println(o1.a);
        System.out.println(i1.b);
        i1.m1();
    }
}