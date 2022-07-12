package constructorStudy;

public class Userdefined {
// Variable Declaration
	int a; int b; int c;
	
	public Userdefined () 
	{
		a=10;b=15;c=18;
		System.out.println("Addition is "+(a+b+c));
	}
	public Userdefined(int x,int y,int z)
	{
		int a=x;int b=y;int c=z;
		System.out.println("Addition is "+(a+b+c));

	}
	
	public static void main(String[] args) {
	
    Userdefined Vi =new Userdefined();
    Userdefined Vi1 =new Userdefined(12,12, 12);
	}

}
