import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class DMOPC_14_contest_6_P1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		byte r = Byte.parseByte(br.readLine());
		byte h = Byte.parseByte(br.readLine());
		
		System.out.println((Math.pow(r, 2)*3.14*h)/3);
	}

}
