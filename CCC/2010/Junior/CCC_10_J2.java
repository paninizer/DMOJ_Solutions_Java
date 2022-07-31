import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CCC_10_J2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		short a = Short.parseShort(br.readLine());
		short b = Short.parseShort(br.readLine());
		short c = Short.parseShort(br.readLine());
		short d = Short.parseShort(br.readLine());
		short s = Short.parseShort(br.readLine());
		
		int sum1=0;
		int sum2=0;
		short forward=0;
		short backward=0;

		for (short i=0; i<s; i++) {
			if(i%a==0&&i>=a) {
	            backward +=b;
	        }
	        else {
	        	forward +=1;
	        }
	        if(forward+backward>=s) {
	        	break;
	        }
		}
		sum1 = forward-backward;
		
		forward=0;
		backward=0;
		for (short i=0; i<s; i++) {
			if(i%c==0&&i>=c) {
	            backward +=d;
	        }
	        else {
	        	forward +=1;
	        }
	        if(forward+backward>=s) {
	        	break;
	        }
		}
		sum2 = forward-backward;		
		
		
		if (sum1>sum2) System.out.println("Nikky");
		else if (sum2>sum1) System.out.println("Byron");
		else System.out.println("Tied");
	}

}
