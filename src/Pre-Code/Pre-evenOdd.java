/*
 PRE-PROGRAM 4
 CHECK EVEN ODD NUMBER INPUT FROM USER
*/

import java.util.Scanner;
public class evenOdd {
	public static void main(String[] args) {
		System.out.println("17BCS2198 \n");
		int a;
		Scanner S = new Scanner(System.in);

		System.out.println("Enter The Number: ");
		a = S.nextInt();
		if(a%2==0){
			System.out.println("EVEN ");
		}else{
			System.out.println("ODD ");
		}

	}

}
