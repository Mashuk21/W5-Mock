package constructorStudy;

public class CC11 {
	
	int a;
	int b;
	
	public CC11(){
		a=20;
		b=5;
		
	}
	public CC11(int x)
	{
	a=x;
	}
	public CC11(int m,int n)
	{
		a=m;
		b=n;
	}

	public static void main(String[] args) {
		
		CC11 C=new CC11();
		C.sum();
		CC11 CC=new CC11(10);
		CC.sum();
		CC11 CCC=new CC11(10,10);
	    CCC.sum();
	}
	public void sum()
	{
		System.out.println(a+b);
	}
}
