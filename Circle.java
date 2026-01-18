class Circle 
{
    double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    public double calArea() 
    {
        return 3.14 * (radius * radius);
    }

    public double calPerimeter() 
    {
        return 2 * 3.14 * radius;
    }

    public void displayAreaPerimeter() 
    {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calArea());
        System.out.println("Perimeter: " + calPerimeter());
    }

    public static void main(String[] args) 
    {
        Circle circ1 = new Circle(10);
        Circle circ2 = new Circle(20);

        System.out.println("Circle 1:");
        circ1.displayAreaPerimeter();

        System.out.println("\nCircle 2:");
        circ2.displayAreaPerimeter();
    }
}
