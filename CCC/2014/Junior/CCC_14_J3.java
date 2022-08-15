import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_14_J3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		byte a=100, b=100;
		
		byte inputnum = Byte.parseByte(br.readLine());
		
		for (byte i=0; i<inputnum; i++) {
			String[] input = br.readLine().split(" ");
			byte inputa = Byte.parseByte(input[0]);
			byte inputb = Byte.parseByte(input[1]);
			
			if (inputa>inputb) {
				b-=inputa;
			} else if (inputa<inputb) {
				a-=inputb;				
			}
		}
		
		System.out.println(a);
		System.out.println(b);
	}

}
