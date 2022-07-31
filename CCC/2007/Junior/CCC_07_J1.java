import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CCC_07_J1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int min = Integer.MAX_VALUE;
		int mid = Integer.MAX_VALUE;
		
		for (byte i=0; i<3; i++) {
			int input = Integer.parseInt(br.readLine());
			if (input<min) {
				mid=min;
				min=input;
			}
			else if (input<mid&&input>min) mid = input;
		}
		System.out.println(mid);
	}

}
