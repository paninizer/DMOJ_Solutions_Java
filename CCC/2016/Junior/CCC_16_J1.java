import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CCC_16_J1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		byte winCounter = 0;
		for (byte i=0; i<6; i++) {
			String A = br.readLine().strip();
			if (A.equals("W")) winCounter++;
		}
		if (winCounter==5||winCounter==6) System.out.println(1);
		else if (winCounter==3||winCounter==4) System.out.println(2);
		else if (winCounter==1||winCounter==2) System.out.println(3);
		else System.out.println(-1);
		
	}

}
