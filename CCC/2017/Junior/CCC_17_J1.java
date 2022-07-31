package test_dmoj;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class CCC_17_J1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		short in1 = Short.parseShort(br.readLine());
		short in2 = Short.parseShort(br.readLine());
		
		if (in1>0&&in2>0) {
			System.out.println(1);
		}
		else if (in1<0&&in2>0) {
			System.out.println(2);
		}
		else if (in1<0&&in2<0) {
			System.out.println(3);
		}
		else {
			System.out.println(4);
		}
	}

}
