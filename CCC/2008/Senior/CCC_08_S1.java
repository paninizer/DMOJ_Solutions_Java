import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CCC_08_S1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String city = "";
		int mintemp = Integer.MAX_VALUE;
		while (true) {
			String[] input = br.readLine().split(" ");
			int temp = Integer.parseInt(input[1]);
			if (temp<mintemp) {
				mintemp = temp;
				city = input[0];
			}
			if (input[0].equals("Waterloo")) break;
		}
		System.out.println(city);
	}

}
