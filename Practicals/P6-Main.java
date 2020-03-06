import java.util.HashMap; 
import java.util.Map; 

public class Main { 
	public static void main(String[] args) 
	{ 

		HashMap<String, Integer> map = new HashMap<>(); 

		print(map); 
		map.put("Amarjit", 80); 
		map.put("Sachin", 30); 
		map.put("Vaibhav", 20); 

		System.out.println("Size of map is "+ map.size()); 

		print(map); 
		if (map.containsKey("Amarjit")) { 
			Integer a = map.get("Amarjit"); 
			System.out.println("Value for key"+ " \"Amarjit\" : "+ a); 
		} 

		map.clear(); 
		print(map); 
	} 

	public static void print(Map<String, Integer> map) 
	{ 
		if (map.isEmpty()) { 
			System.out.println("Map is empty"); 
		} 

		else { 
			System.out.println(map); 
		} 
	} 
} 
