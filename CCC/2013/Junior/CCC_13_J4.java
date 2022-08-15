import java.io.*;
import java.util.Arrays;

public class CCC_13_J4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int lim = Integer.parseInt(br.readLine());
		int num = Integer.parseInt(br.readLine());
		int[] table = new int[num];
		for (int i=0; i<num; i++) {
			table[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(table);
		int total = 0;
		int count = 0;
		for (int i=0; i<num; i++) {
			total+=table[i];
			if (total>lim) break;
			count++;
		}
		System.out.println(count);
	}

}
