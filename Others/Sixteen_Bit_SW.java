import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sixteen_Bit_SW {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		short in = Short.parseShort(br.readLine());
		
		for (short i=0; i<in; i++) {
			String[] threeInputs = br.readLine().split(" ");
			long bigInput1 = Long.parseLong(threeInputs[0]);
			long bigInput2 = Long.parseLong(threeInputs[1]);
			long bigProduct = Long.parseLong(threeInputs[2]);
			if (bigInput1*bigInput2 != bigProduct) System.out.println("16 BIT S/W ONLY");
			else System.out.println("POSSIBLE DOUBLE SIGMA");
		}
	}

}
