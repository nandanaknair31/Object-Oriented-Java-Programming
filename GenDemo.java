class Gen <T>
{ 
T ob;

Gen (T o)
{ob=o;}

T getOb()
{return ob;}

void showtype()
{System.out.println("Type of T is "+ob.getClass().getName());}

}

class GenDemo
{public static void main(String args[])
 {Gen <Integer> iob = new Gen<Integer>(88);
  iob.showtype();
  int a = iob.getOb();
  System.out.println(a);
 
 Gen <Double> dob = new Gen<Double>(88.0);
  dob.showtype();
  double b = dob.getOb();
  System.out.println(b);

 Gen <Float> fob = new Gen<Float>(15.5f);
  fob.showtype();
  float c = fob.getOb();
  System.out.println(c);

 }
}
  