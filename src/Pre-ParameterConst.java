class ConstExample{
	public
	int Roll;
	String Name;
	
	ConstExample(){
		Roll = 2132;
		Name = "SANJIB_REGMI";
		System.out.println("\nNON-PARAMETERIZE CONSTRUCTOR ");
		System.out.println("Roll .No :"+Roll);
		System.out.println("Name : "+Name);
	}
	
	ConstExample(int Roll,String Name){
		System.out.println("\nPARAMETERIZE CONSTRUCTOR ");
		System.out.println("Roll .No :"+Roll);
		System.out.println("Name : "+Name);
	}
}

public class ConstExp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstExample obj1 = new ConstExample(2198,"AMARJIT_PHEIROIJAM");
		ConstExample obj2 = new ConstExample();
		
	}

}
