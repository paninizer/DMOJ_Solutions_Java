import java.io.*;

public class Mirrored_Pairs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Ready");
		String input = br.readLine().toLowerCase();
		
		while (!input.equals("  ")) {
			if (input.equals("pq")||input.equals("qp")||input.equals("db")||input.equals("bd")) {
				System.out.println("Mirrored pair");
			} else System.out.println("Ordinary pair");
			
			input = br.readLine().toLowerCase();
		}
	}

}
