package test_dmoj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CCC_15_J1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		byte month = Byte.parseByte(br.readLine());
		byte day = Byte.parseByte(br.readLine());
		if (month>2||(month==2&&day>18)) {
			System.out.println("After");
			System.out.flush();
		}
		else if (month<2||(month==2&&day<18)) {
			System.out.println("Before");
			System.out.flush();
		}
		else {
			System.out.println("Special");
			System.out.flush();
		}
	}

}
