import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class GFSSOC_14_Winter_J1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		short height = Short.parseShort(br.readLine());
		short in = Short.parseShort(br.readLine());
		byte counter = 0;
		for (byte i=1; i<=in; i++) {
			short e = Short.parseShort(br.readLine());
			if (e>=height) counter++;
		}
		System.out.println(counter);
	}

}
