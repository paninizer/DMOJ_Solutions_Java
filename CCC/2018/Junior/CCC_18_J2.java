import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class CCC_18_J2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		byte empty = Byte.parseByte(br.readLine());
		
		String day1 = br.readLine();
		String day2 = br.readLine();
		
		byte count = 0;
		for (byte i=0; i<empty; i++) {
			if (day1.charAt(i)=='C'&&day1.charAt(i)==day2.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
