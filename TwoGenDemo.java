class TwoGen<T,V>
{
T ob1;
V ob2;

TwoGen(T o, V u)
{
ob1=o;
ob2=u;
}

T getOb1()
{return ob1;}

V getOb2()
{return ob2;}

void showtypes()
{System.out.println("Type of T is : "+ob1.getClass().getName());
 System.out.println("Type of V is : "+ob2.getClass().getName());
}

}

class TwoGenDemo
{public static void main(String args[])
 {TwoGen<Integer, String> tgobj= new TwoGen<Integer, String>(20, "years old");
  tgobj.showtypes();
  int a=tgobj.getOb1();
  String s = tgobj.getOb2();
  System.out.println(a);
  System.out.println(s);
 }
}