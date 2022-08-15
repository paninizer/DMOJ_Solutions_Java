import java.io.*;

public class CCC_21_S2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int inputnum = Integer.parseInt(br.readLine());
		
		int[] frqr = new int[m];
		int[] frqc = new int[n];
		
		for (int i=0; i<inputnum; i++) {
			String[] ins = br.readLine().split(" ");
			String dir = ins[0];
			int num = Integer.parseInt(ins[1])-1;
			
			if (dir.equals("R")) frqr[num]++;
			else frqc[num]++;
		}
		int flipped_row = 0;
		for (int i=0; i<m; i++) {
			if (frqr[i]%2==1) flipped_row++;
		}
		int unflipped_row = m-flipped_row;
		long total = 0;
		for (int i=0; i<n; i++) {
			if (frqc[i]%2==1) total+=unflipped_row;
			else total+=flipped_row;
		}
		
		System.out.println(total);
		
	}

}
