import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CCC_12_J3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Byte e = Byte.parseByte(br.readLine());
		
		for (byte i=0; i<e; i++) {
			for (byte j=0; j<e; j++) System.out.print('*');
			for (byte j=0; j<e; j++) System.out.print('x');
			for (byte j=0; j<e; j++) System.out.print('*');
			System.out.println();
		}
		for (byte i=0; i<e; i++) {
			for (byte j=0; j<e; j++) System.out.print(' ');
			for (byte j=0; j<e; j++) System.out.print('x');
			for (byte j=0; j<e; j++) System.out.print('x');
			System.out.println();
		}
		for (byte i=0; i<e; i++) {
			for (byte j=0; j<e; j++) System.out.print('*');
			for (byte j=0; j<e; j++) System.out.print(' ');
			for (byte j=0; j<e; j++) System.out.print('*');
			System.out.println();
		}

	}

}
