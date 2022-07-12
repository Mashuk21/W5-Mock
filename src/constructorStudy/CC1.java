package constructorStudy;

public class CC1 {
	
	int num1;
	int num2;
	int num3;
	
	public CC1 () 
	{
		num1=10;
		num2=20;
		num3=30;
	}
	public CC1(int x )
	{
		num1=x;
	}
	public CC1(int y,int z)
	{
		num2=y;
		num3=z;
		
	}
	public CC1(int m,int n,int o)
	{
	num1=m;
	num2=n;
	num3=o;
	}
	
	//W5 Mock Group Rocks
	
	public static void main(String[] args) {

		CC1 CS=new CC1();
		CS.addition();
		
		CC1 CS1=new CC1(100);
		CS1.addition();
		
		CC1 CS2=new CC1(1000,2000);
		CS2.addition();
		
		CC1 CS3=new CC1(10000,20000,30000);
		CS3.addition();
		
		
		
	}
	public void addition()
	{
		int sum =num1+num2+num3;
		System.out.println(sum);
				
	}
	
}
