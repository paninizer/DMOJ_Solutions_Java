import java.io.*;
import java.util.*;

public class CCC_05_J3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> arr = new ArrayList<String>();
		String lastin = br.readLine();
		while (!lastin.equals("SCHOOL")) {
			arr.add(lastin);
			lastin = br.readLine();
		}
		int i = arr.size()-1;
		while (i>=0) {
			if (i==0) {
				if (arr.get(i).equals("R")) {
					System.out.println("Turn LEFT into your HOME.");
				} else {
					System.out.println("Turn RIGHT into your HOME.");
				}
			} else {
				if (arr.get(i).equals("R")) {
					System.out.println("Turn LEFT onto "+arr.get(i-1)+" street.");
				} else {
					System.out.println("Turn RIGHT onto "+arr.get(i-1)+" street.");
				}
			}
			
			i-=2;
		}

	}
}
