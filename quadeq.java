import java.util.*;

class quadeq
{public static void main(String args[])
 {Scanner in = new Scanner(System.in);
  int a,b,c;
  System.out.println("Enter the value of a, b and c : ");
  a=in.nextInt();
  b=in.nextInt();
  c=in.nextInt();
  double d=(Math.pow(b,2)-(4*a*c));
  if (d<0)
  {System.out.println("This equation has no real solutions.");}
  else if (d==0)
  {double r = ((-b) + Math.sqrt(d))/(2*a);
   System.out.println("This equation has one real solution : "+r);}
 else if (d>0)
  {double r1 = ((-b) + Math.sqrt(d))/(2*a);
   double r2 = ((-b) - Math.sqrt(d))/(2*a);
   System.out.println("This equation has two real solutions : "+r1+", "+r2);}
}
}

