import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CCC_17_J2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		short input = Short.parseShort(br.readLine());
		short num = Short.parseShort(br.readLine());
		int out=0;
		
		for (short i=0; i<=num; i++) {
			out+=input*(Math.pow(10, i));
		}
		System.out.println(out);
	}

}
