package test_dmoj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CCC_13_J2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		input = input.replace("I", "");
		input = input.replace("O", "");
		input = input.replace("S", "");
		input = input.replace("H", "");
		input = input.replace("Z", "");
		input = input.replace("X", "");
		input = input.replace("N", "");
		
		if (input.length()==0) {
			System.out.println("YES");
			System.out.flush();
		}
		else {
			System.out.println("NO");
			System.out.flush();
		}
		
	}

}
