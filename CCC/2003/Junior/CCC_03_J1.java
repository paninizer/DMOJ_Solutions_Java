import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CCC_03_J1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		byte fork = Byte.parseByte(br.readLine());
		byte space = Byte.parseByte(br.readLine());
		byte handle = Byte.parseByte(br.readLine());
		
		
		for (byte i=0; i<fork; i++) {
			for (byte m=0; m<2; m++) {
				System.out.print('*');
				for (byte j=0; j<space; j++) {
					System.out.print(" ");
				}
			}
			System.out.print('*');
			System.out.println();
		}
		
		for (byte i=0; i<space*2+3; i++) {
			System.out.print('*');
		}
		System.out.println();

		for (byte i=0; i<handle; i++) {
			for (byte j=0; j<space+1; j++) {
				System.out.print(" ");
			}
			System.out.print('*');
			System.out.println();
		}
		
	}

}
