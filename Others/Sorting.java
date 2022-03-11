package test_dmoj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {



	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintStream out = System.out;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		byte num = Byte.parseByte(br.readLine());
		
		List<Byte> array = new ArrayList<Byte>();

		for (byte c=0; c<num; c++) {
			byte in = Byte.parseByte(br.readLine());
			array.add(in);
		}
		
		Collections.sort(array);
		
		for (Byte i : array) {
			out.println(i);
		}
		
	}

}
