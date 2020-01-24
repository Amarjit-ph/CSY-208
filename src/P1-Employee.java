
public class Employe {
	public
	int Empid;
	String name;
	float Salary;
	void show() {
		System.out.println("EMPLOYEE ID: "+Empid);
		System.out.println("NAME: "+name);
		System.out.println("SALARY: "+Salary);
		
	}
	public static void main(String[] args) {
		Employe EmployeS[] = new Employe[10];
		int i = 1;
		
		for(i=0;i<EmployeS.length;i++) {
			EmployeS[i] = new Employe();
		}
		
		
		EmployeS[0].name ="AMARJIT PHEIROIJAM";
		EmployeS[0].Empid = 1;
		EmployeS[0].Salary=66000;
		
		EmployeS[1].name ="LEONARD CHONGTHAM";
		EmployeS[1].Empid = 2;
		EmployeS[1].Salary=76000;
		
		EmployeS[2].name ="JITESH KUMAR";
		EmployeS[2].Empid = 3;
		EmployeS[2].Salary=26000;
		
		
		for( i=0 ; i<3 ; i++ ) {
			System.out.println("["+(i+1)+"]\n");
			EmployeS[i].show();
			System.out.println("\n");
		}
		
		
				
	}

}
