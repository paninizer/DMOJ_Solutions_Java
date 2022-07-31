import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class DMOPC_15_contest_1_P1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String bestname = "";
		float bestrate = 0.0f;
		
		byte numinput = Byte.parseByte(br.readLine());
		
		for (byte i=0; i<numinput; i++) {
			String[] input = br.readLine().split(" ");
			String name = input[0];
			float rate = Float.parseFloat(input[1]);
			if (rate>bestrate) {
				bestrate = rate;
				bestname = name;
			}
		}
		System.out.println(bestname);
	}

}
