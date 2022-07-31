package test_dmoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class CCC_22_J1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = System.out;
		
		short in1=Short.parseShort(br.readLine());
		short in2=Short.parseShort(br.readLine());
		
		out.println((in1*8+in2*3)-28);
		
	}

}
