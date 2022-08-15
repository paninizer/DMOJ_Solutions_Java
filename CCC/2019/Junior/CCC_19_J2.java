import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CCC_19_J2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		byte a = Byte.parseByte(br.readLine());
		
		for (byte i=0; i<a; i++) {
			String[] s = br.readLine().split(" ");
			byte num = Byte.parseByte(s[0]);
			String out = s[1];
			for (byte j=0; j<num; j++) {
				System.out.print(out);
			}
			System.out.println();
		}
	}

}
