import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_21_J2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		short input = Short.parseShort(br.readLine());
		
		short max = Short.MIN_VALUE;
		String winner = "";
		for (short i=0; i<input; i++) {
			String person = br.readLine();
			short bid = Short.parseShort(br.readLine());
			if (bid>max) {
				max=bid;
				winner=person;
			}
		}
		System.out.println(winner);
	}

}
