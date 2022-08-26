import java.io.*;

public class CCC_04_J4 {
	
	static char shift(char a, char b) {
		int c = a+(b%65);
		
		if (c>90) c-=26;
		
		return (char) c;
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String key = br.readLine();
		int l = key.length();
		
		String encrypt = br.readLine().replaceAll("[^A-Za-z]+", "");

		int i=0;
		int j=0;
		
		while (j<encrypt.length()) {
			char k = key.charAt(i);
			char unf = encrypt.charAt(j);
			
			System.out.print(shift(unf, k));
			
			i++; i%=l;
			j++;
		}
		System.out.println();
		
		
	}

}
