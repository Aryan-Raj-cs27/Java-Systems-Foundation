class Poly1 {
    public void display() {
        System.out.println("Base class is called...");
    }
}

class Poly2 extends Poly1 {
    public void display() {
        System.out.println("Child class is called...");
    }
}

class CallPoly {
    public static void main(String args[]) {
        Poly1 bobj = new Poly1();
        bobj.display();
        bobj = new Poly2();
        bobj.display();
    }
}
