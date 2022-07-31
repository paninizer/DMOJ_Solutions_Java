import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class DMOPC_14_contest_5_P2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		short numinput = Short.parseShort(br.readLine());
		int[] lengths = new int[numinput];
		for (short i=0; i<numinput; i++) {
			String[] input = br.readLine().split(" ");
			int start = Integer.parseInt(input[0]);
			int end = Integer.parseInt(input[1]);
			lengths[i] = end-start;
		}
		Arrays.sort(lengths);
		System.out.println(lengths[numinput-1]);
	}

}
