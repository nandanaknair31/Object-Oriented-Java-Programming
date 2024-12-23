import java.util.*;

class Student
{
String usn,name;
int credits[], marks[], n;

void accept()
{Scanner in = new Scanner(System.in);
System.out.println("Enter the name of the student :");
name=in.nextLine();
System.out.println("Enter the usn of the student :");
usn=in.nextLine();
System.out.println("Enter the number of subjects :");
n=in.nextInt();
credits = new int[n];
marks = new int[n];
for (int i=0; i<n; i++)
{System.out.println("Enter the number of credits awarded and marks obtained for Subject "+(i+1));
 credits[i]=in.nextInt();
 marks[i]=in.nextInt();}
}

int getgp(int m)
{if (m>=90)
 {return 10;}
else if (m>=80)
 {return 9;}
else if (m>=70)
 {return 8;}
else if (m>=60)
 {return 7;}
else if (m>=50)
 {return 6;}
else if (m>=45)
 {return 5;}
else if (m>=40)
 {return 4;}
else 
{return 0;}
}

double calcgpa(int credits[], int marks[])
{dnle sum=0, c=0;
 for (int i=0; i<n; i++)
 {int g=getgp(marks[i]);
  c+=credits[i];
  sum+=(g*credits[i]);}
 double gpa = (sum)/c;
return gpa;
}

void display()
{System.out.println("Name of the student :"+name);
System.out.println("USN of the student :"+usn);
System.out.println("Credits and marks of each subject ");
for (int i=0; i<n; i++)
{System.out.println("Subject: "+(i+1)+"\tCredits: "+credits[i]+"\tMarks Obtained : "+marks[i]);}
double sgpa=calcgpa(credits, marks);
System.out.println("SGPA secured by the student : "+sgpa);
}

public static void main(String args[])
{Student ob= new Student();
 ob.accept();
 ob.display();
}
}

