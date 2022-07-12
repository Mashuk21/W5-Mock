package constructorStudy;

public class Hr_Portal {

	public static void main(String[] args) 
	{
       Employee SachinT =new Employee();
       SachinT.gender="Male";
       SachinT.grade='A';
       SachinT.id=001;
       SachinT.name="Sachin Tendulkar";
       SachinT.salary=1000;
       
       SachinT.emp_info();
       
       Employee Ramesh =new Employee();
       Ramesh.gender="Male";
       Ramesh.grade='B';
       Ramesh.name="Arjun Tendulkar";
       Ramesh.salary=5000;
       Ramesh.id=10;
       Ramesh.emp_info();
	}

}
