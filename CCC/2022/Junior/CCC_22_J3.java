import java.io.*;

public class CCC_22_J3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String letters = "ABCDEFGHIJKLMNOPQRST";
		String numbers = "0123456789";
		
		String input = br.readLine();
		

		for (int i=1; i<input.length(); i++) {
			if (letters.contains(Character.toString(input.charAt(i)))&&numbers.contains(Character.toString(input.charAt(i-1)))) {
				input = input.substring(0, i) + "*" + input.substring(i);
			}
		}
		
		input = input.replace("+", " tighten ");
		input = input.replace("-", " loosen ");
		input = input.replace("*", "\n");
		
		System.out.println(input);
  }
}
