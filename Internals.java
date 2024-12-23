package CIE;

public class Internals
{public int internalm[];
 
public Internals(int marks[])
{if (marks.length ==5)
 {internalm=marks;}
else 
{System.out.println("Invalid input");}
}


public void displayint()
{System.out.println("Internal marks : ");
 for (int k=0; k<5; k++)
 {System.out.println(internalm[k]);}
}
}


