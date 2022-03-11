package test_dmoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class CCC_07_J2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = System.out;
		while (true){
			String in = br.readLine();
			
			if (in.equals("CU")) out.println("see you");
			else if (in.equals("CCC")) out.println("Canadian Computing Competition");
			else if (in.equals(":-)")) out.println("I'm happy");
			else if (in.equals(":-(")) out.println("I'm unhappy");
			else if (in.equals(";-)")) out.println("wink");
			else if (in.equals(":-P")) out.println("stick out my tongue");
			else if (in.equals("(~.~)")) out.println("sleepy");
			else if (in.equals("TA")) out.println("totally awesome");
			else if (in.equals("CUZ")) out.println("because");
			else if (in.equals("TY")) out.println("thank-you");
			else if (in.equals("YW")) out.println("you're welcome");
			else if (in.equals("TTYL")) {
				out.println("talk to you later");
				break;
			}
			else {
				out.println(in);
			}
			
		}
	}

}
