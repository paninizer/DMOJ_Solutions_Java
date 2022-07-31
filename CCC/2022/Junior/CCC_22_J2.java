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
		
		short goldcounter = 0;
		int pln = Integer.parseInt(br.readLine());
		for (int c=0; c<pln; c++) {
			int totals = 0;
			int score = Integer.parseInt(br.readLine())*5;
			int foul = Integer.parseInt(br.readLine())*3;
			
			totals = totals+score-foul;
			
			if (totals>40) {
				goldcounter ++;
			}
		}
		
		if (goldcounter==pln) out.println(goldcounter+"+");
		else out.println(goldcounter);
	}

}
