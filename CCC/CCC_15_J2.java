package test_dmoj;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class CCC_15_J2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		byte placeholder1 = (byte) in.length();
		byte placeholder2 = (byte) in.replace(":-)", "").length();
		byte placeholder3 = (byte) in.replace(":-(", "").length();
		
		if (placeholder1==placeholder2&&placeholder1==placeholder3) {
			System.out.println("none");
			System.out.flush();
		}
		else if (placeholder2>placeholder3) {
			System.out.println("sad");
			System.out.flush();
		}
		else if (placeholder2<placeholder3) {
			System.out.println("happy");
			System.out.flush();
		}
		else {
			System.out.println("unsure");
			System.out.flush();
		}
		
	}

}
