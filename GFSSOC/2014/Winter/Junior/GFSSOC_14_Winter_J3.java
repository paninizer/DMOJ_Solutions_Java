import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GFSSOC_14_Winter_J3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] now = br.readLine().split(":");
		String[] time = br.readLine().split(":");
		
		int sc = Integer.parseInt(time[0])*3600+Integer.parseInt(time[1])*60+Integer.parseInt(time[2]);
		int timenow = Integer.parseInt(now[0])*3600+Integer.parseInt(now[1])*60+Integer.parseInt(now[2]);
		
		System.out.println(sc-timenow);
	}

}
