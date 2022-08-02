import java.io.*;

public class CCC_04_J3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int firstnum = Integer.parseInt(br.readLine());
		int secondnum = Integer.parseInt(br.readLine());
		String[] adj = new String[firstnum];
		String[] nouns = new String[secondnum];
		for (int i=0; i<firstnum; i++) {
			adj[i]=br.readLine();
		} for (int i=0; i<secondnum; i++) {
			nouns[i]=br.readLine();
		}
		
		for (int i=0; i<firstnum; i++) {
			for (int j=0; j<secondnum; j++) {
				pw.println(adj[i]+" as "+nouns[j]);
			}
		}
		pw.flush();
	}

}
