import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    short limit = Short.parseShort(br.readLine);
	    short speed = Short.parseShort(br.readLine);

	    short overspeed = speed-limit;

	    if (overspeed<=0) {
	    	System.out.println("Congratulations, you are within the speed limit!");
	    }
	    else if (1 <= overspeed && overspeed <=20) {
	    	System.out.println("You are speeding and your fine is $100.");
	    }
	    else if (21 <= overspeed && overspeed <=30) {
	    	System.out.println("You are speeding and your fine is $270.");
	    }
	    else {
	    	System.out.println("You are speeding and your fine is $500.");
	    }

    }
}
