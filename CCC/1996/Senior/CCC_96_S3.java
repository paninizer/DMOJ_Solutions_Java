import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class CCC_96_S3 {
	static Deque<String> out = new ArrayDeque<>();

	static boolean next_permutation(ArrayList<Integer> p) {
		for (int a = p.size() - 2; a >= 0; --a)
			if (p.get(a) < p.get(a+1))
				for (int b = p.size() - 1;; --b)
					if (p.get(b) > p.get(a)) {
						int t = p.get(a);
						p.set(a, p.get(b));
						p.set(b, t);
						for (++a, b = p.size() - 1; a < b; ++a, --b) {
							t = p.get(a);
							p.set(a, p.get(b));
							p.set(b, t);
						}
						return true;
					}
		return false;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int num = Integer.parseInt(br.readLine());

		for (int i=0; i<num; i++) {
			ArrayList<Integer> arr = new ArrayList<>();

			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			for (int j=1; j<=a; j++) {
				if (j<=a-b) arr.add(0); 
				else arr.add(1);
			}

			System.out.println("The bit patterns are");

			do {
				String temp = "";
				for (int x:arr) {
					temp=temp+x;
				}
				out.push(temp);
			} while (next_permutation(arr));
			
			while(!out.isEmpty()) {
				System.out.println(out.pop());
			}
			System.out.println();
		}
	}

}
