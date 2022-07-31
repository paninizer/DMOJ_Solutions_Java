import java.io.*;
public class CCC_18_S2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		int[][] table = new int[input][input];
		
		int smallest = Integer.MAX_VALUE;
		for (int i =0; i<input; i++) {
			String[] row = br.readLine().split(" ");
			for (int j=0; j<input; j++) {
				table[i][j] = Integer.parseInt(row[j]);
				if (table[i][j]<smallest) smallest = table[i][j];
			}
		}
		
		if (smallest==table[0][0]) {
			for (int i=0; i<input; i++) {
				String ansrow = "";
				for (int j=0; j<input; j++) {
					ansrow = ansrow + table[i][j]+" ";
				}
				System.out.println(ansrow.trim());
			}
		} else if (smallest==table[0][input-1]) {
			for (int j=input-1; j>=0; j--) {
				String ansrow = "";
				for (int i=0; i<input; i++) {
					ansrow = ansrow + table[i][j]+" ";
				}
				System.out.println(ansrow.trim());
			}			
		} else if (smallest==table[input-1][input-1]) {
			for (int i=input-1; i>=0; i--) {
				String ansrow = "";
				for (int j=input-1; j>=0; j--) {
					ansrow = ansrow + table[i][j]+" ";
				}
				System.out.println(ansrow.trim());
			}			
		} else {
			for (int j=0; j<input; j++) {
				String ansrow = "";
				for (int i=input-1; i>=0; i--) {
					ansrow = ansrow + table[i][j]+" ";
				}
				System.out.println(ansrow.trim());
			}	
		}
	}

}
