import java.io.*;
import java.util.StringTokenizer;

public class CCC_00_J1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		int first = Integer.parseInt(st1.nextToken());
		int second = Integer.parseInt(st1.nextToken());

		System.out.println("Sun Mon Tue Wed Thr Fri Sat");
		
		int preceding_space = first * 4 - 5;
		
		if (first==1) {
			for (int i=0; i<preceding_space; i++) {
				System.out.print(" ");
			}
			System.out.print("  ");
		} else {
			for (int i=0; i<preceding_space; i++) {
				System.out.print(" ");
			}
			System.out.print("   ");			
		}
		
		int day_at_end = 8 - first;
		int row_num = 0;
		
		for (int i=1; i<=second; i++) {
			if (i==second) {
				System.out.print(i);
			} else {
				if (i%(day_at_end+7*row_num)==0) {
					System.out.print(i);
					System.out.println();
					if (i<9) {
						System.out.print("  ");
					} else {
						System.out.print(" ");
					}
					row_num++;
				} else {
					if (i<9) {
						System.out.print(i+"   ");
					} else {
						System.out.print(i+"  ");
					}					
				}
			}
		}
		System.out.println();
	}

}
