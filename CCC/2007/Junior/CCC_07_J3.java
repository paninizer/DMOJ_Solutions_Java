import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_07_J3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] money = {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
		
		byte inputnum = Byte.parseByte(br.readLine());
		
		for (byte i = inputnum; i>0; i--) {
			byte boxnum = Byte.parseByte(br.readLine());
			money[boxnum-1] = 0;
		}
		
		int deal = Integer.parseInt(br.readLine());
		
		int average = 0;
		for (int i:money) {
			average+=i;
		}
		average=average/(10-inputnum);
		
		if (average>deal) System.out.println("no deal");
		else System.out.println("deal");
	}

}
