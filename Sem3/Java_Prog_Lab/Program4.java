//4.Write a JAVA program using Synchronized Threads, which demonstrates Producer Consumer concept.
class queue 
{ 
  int item; 
  boolean busy=false; 
  synchronized int get() 
  {if(!busy) 
    try 
       { 
         wait(); 
       } 
    catch(InterruptedException e) 
       { 
         System.out.println("Get:Interrupted Exception e"); 
       } 
   System.out.println("Get:"+item); 
   busy=false; 
   notify(); 
   return item; 
   } 
  synchronized void put(int item) 
  {if(busy) 
    try 
       { 
         wait(); 
       } 
   catch(InterruptedException e) 
     { 
      System.out.println("Get:InterruptedException"); 
     } 
   this.item=item; 
   busy=true; 
   System.out.println("put:"+item); 
   notify(); 
  } 
} 
class producer extends Thread 
{ 
 queue q; 
 producer(queue q) 
 { 
  this.q=q; 
 } 
 public void run() 
 { 
   for(int i=0;i<5;i++) 
    { 
     q.put(i); 
    } 
 } 
} 

class consumer extends Thread 
{ 
 queue q; 
 consumer(queue q) 
 { 
  this.q=q; 
 } 
 public void run() 
 { 
   for(int i=0;i<5;i++) 
    { 
     q.get(); 
    } 
 } 
} 

class Program4 
{ 
  public static void main(String args[]) 
   { 
    queue q=new queue(); 
    producer p=new producer(q); 
    consumer c=new consumer(q); 
    p.start(); 
    c.start(); 
   } 
} 
