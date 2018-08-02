package session3;

public class TestEmployee {
	
	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.setEmployeeId(1);
		e1.setFirstName("Rupesh");
		e1.setLastName("Ghadage");
		e1.setSalary(10000.0f);
		
		Employee e2= new Employee();
		e2.setEmployeeId(2);
		e2.setFirstName("Ganesh");
		e2.setLastName("Ghatage");
		e2.setSalary(20000.0f);	
		
		System.out.println(e1);

		System.out.println(e2);
		
	}

}
