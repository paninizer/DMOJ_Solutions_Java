import java.io.*;
public class CCC_13_S2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int maxweight = Integer.parseInt(br.readLine());
		int carnum = Integer.parseInt(br.readLine());
		
		int[] cars = new int[carnum];
		for (int i=0; i<carnum; i++) {
			cars[i]=Integer.parseInt(br.readLine());
		}
		
		int index = 0;
		boolean complete = false;
		while (index+4<=carnum) {
			int weight = 0;
			for (int i=index; i<index+4; i++) {
				weight+=cars[i];
				if (weight>maxweight) {
					index=i;
					complete=true;
					break;
				}
			}
			if (complete==true) break;
			weight=0;
			index++;
			if (index+4>carnum) {
				index = carnum;
				break;
			}
		}
		System.out.println(index);

	}

}
