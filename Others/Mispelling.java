import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mispelling {

	public static void main(String[] args) throws IOException, NumberFormatException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		short e = Short.parseShort(br.readLine());
		
		for (short i=0; i<e; i++) {
			String input = br.readLine();

			input = input.replaceFirst(" ", "%");
			String[] in = input.split("%");
			short tr = Short.parseShort(in[0]);
			StringBuilder sb = new StringBuilder(in[1]).deleteCharAt(tr-1);
			String resultString = sb.toString();
			System.out.println(i+1+" "+resultString);

		}
	}

}
