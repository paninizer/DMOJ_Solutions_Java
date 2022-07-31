package test_dmoj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CCC_15_J3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String in = br.readLine();
		String consonants = "bcdfghjklmnpqrstvwxyz";
		String closest_vowels = "aaeeeiiiiooooouuuuuuu";
		String rovarspraket = "";
		
		for (int counter=0; counter<in.length(); counter++) {
			int placeholder = consonants.indexOf(in.charAt(counter));
			rovarspraket = rovarspraket + in.charAt(counter);
			if (placeholder!=-1) {
				if (placeholder==20) {
					rovarspraket = rovarspraket + closest_vowels.charAt(placeholder)+"z";
				}
				else {
					rovarspraket = rovarspraket + closest_vowels.charAt(placeholder)+consonants.charAt(placeholder+1);
				}
			}
		}
		
		System.out.println(rovarspraket);
		
	}

}
