class Inh_Grade_out extends Inh_Grade_Data
{
    void display()
    {
        super.input_data();
        System.out.println("-------------------------");
        System.out.print("Name : "+nm+"\tDTOB : "+dt);
        System.out.print("\nAddress : "+ad);
        System.out.print("\nClass : "+cl+"\tRoll No. : "+rn);
        System.out.print("\nMarks : "+m);
        if(m>=70)
        {
            System.out.println("\nGrade : A+");
        }
        else if(m>=60 && m<70)
        {
            System.out.println("\nGrade : A");
        }
        else if(m>=50 && m<60)
        {
            System.out.println("\nGrade : B+");
        }
        else if(m>40 && m<50)
        {
            System.out.println("\nGrade : B");
        }
        else if(m==40)
        {
            System.out.println("\nGrade : C");
        }
        else if(m<40)
        {
            System.out.println("\nGrade : Fail");
        }
        else
        {
            System.out.println("\nINVALID MARKS");
        }
    }
    public static void main(String args[])
    {
        Inh_Grade_out a = new Inh_Grade_out();
        a.display();
    }
}