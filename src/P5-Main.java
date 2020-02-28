// Java program to demonstrate working of HashSet 
import java.util.*; 
  
class P5 
{ 
    public static void main(String[]args) 
    { 
        
    	HashSet<String> hash = new HashSet<String>();
    	hash.add("India");
    	hash.add("Australia");
    	hash.add("China");
    	hash.add("Japan");
    	hash.add("India");  // ADDING DUPLICATE ELEMENT BUT NOT ADDED
    	
    	System.out.println(hash);
    	
    	 System.out.println("\nList contains India or not: " + 
                 hash.contains("India")); 
    	 
    	// Removing items from HashSet using remove() 
         hash.remove("Australia"); 
         System.out.println("\nList after removing Australia: "+hash); 
         
         // Iterating over hash set items 
         System.out.println("\nIterating over list:"); 
         Iterator<String> i = hash.iterator(); 
         while (i.hasNext()) 
             System.out.println(i.next()); 

    } 
} 
