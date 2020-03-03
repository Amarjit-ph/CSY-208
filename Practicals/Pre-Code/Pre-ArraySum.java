import java.util.*;

public class ArraySum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER ARRAY:");
		int arr[] = new int[5];
		int sum = 0;
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			arr[i]=s.nextInt();
			sum=sum+arr[i];
			
		} 
		System.out.println("SUM :" + sum);
	
		
		}

}
