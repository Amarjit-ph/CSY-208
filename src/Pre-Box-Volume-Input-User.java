
import java.util.*;
class Box{
	public 
	int length,breath,height;
	void CalVol(int l,int b, int h){
		length = l;
		breath = b;
		height = h;
		System.out.println("BOX \n");
		System.out.println("LENGTH : "+l);
		System.out.println("BREATH : "+b);
		System.out.println("HEIGHT : "+h);
		System.out.println("VOLUME : "+(length+breath+height));
	}
}

public class CubeVolume {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("\nENTER\nLENGTH:");
		int l = S.nextInt();
		
		System.out.println("BREATH : ");
		int b = S.nextInt();
		
		System.out.println("HEIGHT : ");
		int h = S.nextInt();
		
		Box obj2 = new Box();
		obj2.CalVol(l,b,h);
		
	}

}

