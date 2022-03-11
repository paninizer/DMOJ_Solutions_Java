package test_dmoj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CCC_18_J1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		byte in1 = Byte.parseByte(br.readLine());
		byte in2 = Byte.parseByte(br.readLine());
		byte in3 = Byte.parseByte(br.readLine());
		byte in4 = Byte.parseByte(br.readLine());
		
		if ((in1==8||in1==9)&&(in4==8||in4==9)&&(in2==in3)) {
			System.out.println("ignore");
		}
		else {
			System.out.println("answer");
		}
	}

}