class DispMsg
{
public synchronized void display(String msg)
{System.out.println(msg);}
}


class College implements Runnable
{private DispMsg displaymessage;
 Thread t;
 public College(DispMsg displaymessage)
 {this.displaymessage=displaymessage;
  t=new Thread(this);}
 

 public void run()
{ 
 while(true)
 {displaymessage.display("BMS College of Engineering");
 try
 {
  Thread.sleep(10000);}
 catch(InterruptedException e)
 {System.out.println("College Interrupted");}
}
}
} 

class Dept implements Runnable
{private DispMsg displaymessage;
 Thread t;
 public Dept(DispMsg displaymessage)
 {this.displaymessage=displaymessage;
  t=new Thread(this);}
 

 public void run()
{
 while(true)
 {displaymessage.display("CSE");
 try
 {
  Thread.sleep(2000);}
 catch(InterruptedException e)
 {System.out.println("Department Interrupted");}
}
}
}

class SynchronizedThreadsW8
{public static void main(String args[])
 {DispMsg displaymsg= new DispMsg();
  College clg = new College(displaymsg);
  Dept d = new Dept(displaymsg);
  d.t.start();
  clg.t.start();
 }
}