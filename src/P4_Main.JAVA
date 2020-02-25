import java.util.*; 

public class P4 {

	public static void main(String[] args) { 
		
		
        int n = 5; 
        ArrayList<Integer> ARL = new ArrayList<Integer>(n); 
        
        System.out.println("ELEMENTS OF ARRAY LIST :"); 

    
        for (int i=0; i<=n; i++)
        ARL.add(i);

        
        //SIZE
        System.out.println(ARL); 
    	System.out.println("SIZE :"+ ARL.size());
    	
      	//GET
    	System.out.println("\nGET: INDEX[1]");
    	System.out.println(ARL.get(1));
    	
      	//SET
    	System.out.println("\nSET: INDEX[0] to 90");
    	ARL.set(0, new Integer(90));
    	System.out.println(ARL); 
 
    
    	//REMOVE INDEX
    	System.out.println("\nREMOVE : INDEX [0]");
    	ARL.remove(0);
    	System.out.println(ARL); 
    	
      	//REMOVE OBJECT
    	System.out.println("\nREMOVE OBJECT: 13");
    	ARL.remove(3);
    	System.out.println(ARL);
    	
    	//CLEAR
    	System.out.println("\nCLEAR:");
    	ARL.clear();
    	System.out.println(ARL); 

    	
      	//REMOVE ALL
    	System.out.println("\nREMOVE ALL:");
    	ARL.removeAll(ARL);
    	System.out.println(ARL);
	
	}
}


