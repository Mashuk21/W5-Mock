package methodstudy;

public class Mathoperation {

	public static void main(String[] args) 
	{
		add();
        Mathoperation As4=new Mathoperation();
        As4.add1();
        SampleMathoperation.mul();
        SampleMathoperation As5=new SampleMathoperation();
        As5.div();
        
        
        
        
	}
public static void add() {
	int a=50;
	int b=100;
	int c=200;
	int addition;
	addition=a+b+c;
	
	System.out.println("Addition of all is "+addition);
	
	
}
public void add1() {
	int a=10;int b=20;int c=30;
	int addition;
	addition=a+b+c;
	System.out.println("Addition of Non Satic is "+addition);
	
}



}
