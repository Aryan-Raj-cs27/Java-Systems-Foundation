class Inh_Ci_Display extends Inh_Ci_Data
{
    void display()
    {
        super.input_Details();
        super.input_data();
        super.calc();
        System.out.println("--------------------------------");
        System.out.println("Name : "+nm+"\t"+dt);
        System.out.println("Address : "+ad);
        System.out.println("Principle amount : "+p);
        System.out.println("Rate : "+r+"%\tTime : "+t);
        System.out.println("Coumpound Intrest : "+ci);
    }
    public static void main(String args[])
    {
        Inh_Ci_Display c = new Inh_Ci_Display();
        c.display();
    }
}