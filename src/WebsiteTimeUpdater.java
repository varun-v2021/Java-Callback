
class WebsiteTimeUpdater1 {

	public static void main1(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//SystemTimer systimer = new SystemTimer();
		//TimeUpdaterCallback websiteCallbackUpdater = new WebsiteUpdaterCallBack();
		//systimer.registerCallbackForEveryHourUpdate(websiteCallbackUpdater);
		
		//Immutable example
		String x = new String("abcd");
		x.concat("xyz");
		System.out.println("x: "+x); //a new object with "abcdxyz" will be created but x will point to "abcd"
		
		//we have to explicitly assign to a reference variable to access the newly created object
		String s = "Sachin";
		s = s.concat("tendulkar");
		System.out.println("s: "+s);
		
		MyThread worker1 = new MyThread();
		Thread th1 = new Thread(worker1);
		th1.start();
		
		MyNewThread worker2 = new MyNewThread();
		worker2.start();
		System.out.println("Waiting ...");
		worker2.join();
		System.out.println("Completed ...");
		
		
	}
}

class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("In runnable run method");
	}
	
}

class MyNewThread extends Thread{
	@Override
	public void run(){
		System.out.println("In Thread extended run method");
		try {
			this.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


class A
{
    static String s = "AAA";
 
    static
    {
    	System.out.println("A static ---->");
        s = s + "BBB";
    }
 
    {
    	System.out.println("A instant ---->");
        s = "AAABBB";
    }
}
 
class B extends A
{
    static
    {
    	System.out.println("B static ---->");
        s = s + "BBBAAA";
    }
 
    {
    	System.out.println("B instant ---->");
        System.out.println(s);
    }
}
 

public class WebsiteTimeUpdater
{
    static int i = 1;
 
    static
    {
    	System.out.println(">>>> i-- "+i--);
        i = i-- + --i;
        System.out.println("i here: "+i);
    }
 
    {
    	System.out.println(">>>> i++ "+i++);
        i = i++ - ++i;
        System.out.println("i here again: "+i);
    }
 
    int methodOfTest()
    {
        return i + i - i * i / i;
    }
 
    public static void main(String[] args)
    {
        System.out.println(new WebsiteTimeUpdater().methodOfTest());
        B b = new B();
    }
}
