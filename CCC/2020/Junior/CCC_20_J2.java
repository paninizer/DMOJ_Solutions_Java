import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CCC_20_J2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int target = Integer.parseInt(br.readLine());
		int ini = Integer.parseInt(br.readLine());
		byte spread = Byte.parseByte(br.readLine());
		
		int cases = ini;
		int days = 0;
		int cases_last = ini;
		while (cases<=target) {
			days++;
			cases+=cases_last*spread;
			cases_last*=spread;
		}
		System.out.println(days);
	}

}
