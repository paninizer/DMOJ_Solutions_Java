import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Main {
	private static final DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      short day = Short.parseShort(br.readLine);
	      short eve = Short.parseShort(br.readLine);
	      short end = Short.parseShort(br.readLine);
	      short dayuseA = day-100;
	      short dayuseB = day-250;
	      if (dayuseA<0){
		dayuseA=0;
	      }
	      if (dayuseB<0) {
		dayuseB=0;
	      }
	      String allA = df.format(dayuseA*0.25+eve*0.15+end*0.2);
	      String allB = df.format(dayuseB*0.45+eve*0.35+end*0.25);
	      System.out.println("Plan A costs "+allA);
	      System.out.println("Plan B costs "+allB);
	      float f=Float.parseFloat(allA);
	      float g=Float.parseFloat(allB);
	      if (f<g) {
		System.out.println("Plan A is cheapest.");
	      }

	      else if (g<f) {
		System.out.println("Plan B is cheapest.");
	      }
	      else {
		System.out.println("Plan A and B are the same price.");
	      }
    }
}
