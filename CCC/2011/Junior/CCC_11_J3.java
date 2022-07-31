import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_11_J3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		short[] temp = new short[1000];
		temp[0] = Short.parseShort(br.readLine());
		temp[1] = Short.parseShort(br.readLine());
		int output = 2;
		for (int i=2; i<temp.length; i++) {
			temp[i] = (short) (temp[i-2]-temp[i-1]);
			output++;
			if (temp[i]>temp[i-1]) break;
		}
		System.out.println(output);
	}

}
