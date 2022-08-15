import java.io.*;

public class CCC_20_J3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int minx = Integer.MAX_VALUE;
		int miny = Integer.MAX_VALUE;
		int maxx = Integer.MIN_VALUE;
		int maxy = Integer.MIN_VALUE;
		
		for (int i=0; i<num; i++) {
			String[] ins = br.readLine().split(",");
			int x = Integer.parseInt(ins[0]);
			int y = Integer.parseInt(ins[1]);
			
			if (x<=minx) minx=x;
			if (x>=maxx) maxx=x;
			if (y<=miny) miny=y;
			if (y>=maxy) maxy=y;
		}
		
		System.out.println((minx-1)+","+(miny+1));
		System.out.println((maxx+1)+","+(maxy+1));
	}

}
