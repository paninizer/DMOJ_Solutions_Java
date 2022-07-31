import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Triple_fat_ladies {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		byte num = Byte.parseByte(br.readLine());
		
		for (short t=0; t<num; t++) {
			short v = Short.parseShort(br.readLine());
			for (long count = v; count<1000000000; count++) {
				long ph = (long) Math.pow(count, 3);
				String ph3 = String.valueOf(ph);
				if (ph3.endsWith("888")) {
					System.out.println(count);
					break;
				}
				else {continue;}
			}
		}
	}

}
