package methodstudy;

public class ParameterStudy {

	public static void main(String[] args) 
	{
    School("Velocity", 130, 'A');
    ParameterStudy As6=new ParameterStudy();
    As6.School1("Velocity1", 136, 'A');
	}
public static void School(String schoolname ,int No , char acc ) {
	System.out.println("********************************************");
	System.out.println("Name of the School is "+schoolname);
	System.out.println("No Of the Students In the School is "+No);
	System.out.println("Acc of School is "+acc);
    System.out.println("********************************************");
}
public void School1(String schoolname,int no,char grade ) {
	
	System.out.println("********************************************");
	System.out.println("Name of the School is "+schoolname);
	System.out.println("No Of the Students In the School is "+no);
	System.out.println("Acc of School is "+grade);
    System.out.println("********************************************");
	
}

}
