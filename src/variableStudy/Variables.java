package variableStudy;

public class Variables {
     int a=10;//Non Static Variable Declare and initialize in Class
	static int b=20;// Static Variable Declare and initialize in Class
	
	
	
	public static void main(String[] args) {
    Variables obj=new Variables();
    obj.test();
    test1();
		
    System.out.println("The Value Of A is "+obj.a);//Calling Non Static Global Variable From Class
    //obejectname.globalvariable
     //we have created a object for non static method and then we have called global variable 'a'
   // globalvariable
    System.out.println("the value of B is "+b);//Calling Static Variable Global From Same Class
	//in this we directly called global variable because it is a static Method
    System.out.println("the value of p from another class "+Sample.q);
    Sample M=new Sample();
    System.out.println("the value of q from another class "+M.p);
    
    int sum=800-obj.a;
    int sub=900-b;
    System.out.println("the value of sum is "+sum);
    System.out.println("the value of sub is "+sub);
	 
    int sub1=1000-Sample.q;
    int sub2=1200-M.p;
    
    System.out.println("the value of sub1 from another class is "+sub1);
    System.out.println("the value of sub2 from another class is "+sub2);

	
	}
	public void test()
	{
	int sum=a+10;
	int sub=b-20;
	}
	
	public static void test1() 
	{
	int sum=b-20;
	
	
	}
	
}
