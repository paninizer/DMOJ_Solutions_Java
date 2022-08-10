import java.io.*;

public class SEED_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long low = 1, high = 2000000000;
		
		while (low<=high) {
			long mid = (low+high)/2;
			System.out.println(mid);
			System.out.flush();
			String ins = br.readLine();
			if (ins.equals("FLOATS")) {
				high = mid-1;
			} else if (ins.equals("SINKS")) {
				low = mid+1;
			} else if (ins.equals("OK")) break;
		}
	}

}
