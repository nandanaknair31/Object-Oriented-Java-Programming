import java.util.*;

class Book
{
String name;
String author;
int price;
int num_pages;

Book(String n, String a, int p, int num)
{
name=n;
author=a;
price=p;
num_pages=num;}

void setdetails(String name, String author, int price, int num_pages)
{this.name=name;
 this.author=author;
 this.price=price;
 this.num_pages=num_pages;
}

void getdetails()
{System.out.println("Book Name : "+name+"\nAuthor Name :"+author+"\nPrice : "+price+"\nNumber of pages : "+num_pages);}

public String toString()
{return ("Book Name : "+name+"\nAuthor Name :"+author+"\nPrice : "+price+"\nNumber of pages : "+num_pages);}

public static void main(String args[])
{Scanner in = new Scanner(System.in);
int n;
System.out.println("Enter the number of books : ");
n=in.nextInt();
Book books[] = new Book[n];
String na;
String auth;
int pr;
int np;

for (int i=0; i<n; i++)
{System.out.println("Enter the name of the book:");
 na=in.nextLine();
 System.out.println("Enter the price of the book :");
 pr=in.nextInt();
 System.out.println("Enter the number of pages in the book :");
 np=in.nextInt();
 System.out.println("Enter the name of the author of the book :");
 auth=in.nextLine();
 books[i] = new Book(na, auth, pr, np);}

System.out.println("Book details :");

for (int i=0; i<n; i++)
{System.out.println(books[i].toString());}
}
}
