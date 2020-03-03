import java.util.*;

class A extends Thread {
	public void run(){
		for ( int i = 0 ; i < 5 ; i ++ )
			System.out.println("THREAD 1");
	}
}

class B extends Thread {
	public void run(){
		for( int i = 0 ; i < 5 ; i++)
			System.out.println("THREAD 2");
	}
}


public class P5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A O1 = new A();
		B O2 = new B();
	
		O1.start();
		O2.start();
	}

}
