abstract class Shape
{int a;
 int b;
 
Shape(int x, int y)
{a=x; 
 b=y;}

abstract void printArea();
}

class Rectangle extends Shape
{
Rectangle(int l, int b)
{super(l,b);}

void printArea()
{System.out.println("Area of the given Rectangle : "+(a*b));}
}

class Triangle extends Shape
{
Triangle(int b, int h)
{super(b,h);}

void printArea()
{System.out.println("Area of the given Triangle : "+(0.5*a*b));}
}

class Circle extends Shape
{
Circle(int r)
{super(r,r);}

void printArea()
{System.out.println("Area of the given Circle : "+((22/7)*(a*b)));}
}

class Area
{public static void main(String args[])
{
Rectangle r = new Rectangle(4,5);
Triangle t = new Triangle(4,5);
Circle c = new Circle(7);

r.printArea();
t.printArea();
c.printArea();
}
}