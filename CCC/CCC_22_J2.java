package test_dmoj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
public class CCC_22_J2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = System.out;
		
		byte goldcounter = 0;
		byte pln = Byte.parseByte(br.readLine());
		short totals = 0;
		for (short c=0; c<pln; c++) {
			short score = (short) (Short.parseShort(br.readLine())*5);
			short foul = (short) (Short.parseShort(br.readLine())*3);
			
			totals = (short) (totals+score-foul);
			
			if (totals>40) {
				goldcounter ++;
			}
		}
		
		if (goldcounter==pln) out.println(goldcounter+"+");
		else out.println(goldcounter);
	}

}
