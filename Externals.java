package SEE;

import CIE.StudentP;
import CIE.Internals;

class Externals extends CIE.StudentP
{int externalm[];

public Externals(String name, String us, int s,int marks[])
{super(name, us, s);
if (marks.length ==5)
 {externalm=marks;}
else 
{System.out.println("Invalid input");}
}


public void displayext()
{System.out.println("External marks : ");
 for (int k=0; k<5; k++)
 {System.out.println(externalm[k]);}
}


public void displayfinal(Internals intern)
{System.out.println("Final marks : ");
 for (int k=0; k<5; k++)
 {System.out.println(externalm[k]+intern.internalm[k]);}
}
}