/*
 PRE-PROGRAM 3
 ADD TWO NUMBER INPUT FROM USER
*/
import java.util.*;

public class Add3 {
	public
	int a,b,c;
	void Add(){
	int c = a+b; 
	System.out.println("SUM :"+ c);
}

	public static void main(String[] args) {
		int a,b;
		System.out.println("17BCS2198 \n");
		Scanner S = new Scanner(System.in);
		add2 obj1 = new add2();
		
		System.out.println("Enter The First Number: ");
		a = S.nextInt();
		System.out.println("Enter The Second Number: ");
		b = S.nextInt();

		obj1.a = a;
		obj1.b = b;
		obj1.Add();
		

	}

}
