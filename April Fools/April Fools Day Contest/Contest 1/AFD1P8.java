import java.io.*;
import java.util.Random;

public class April_Fools_Contest_1_P8 {
//pure RNG based for the last entry, read editorial (1/4 AC rate)
//solution: spam this code until you AC
	static boolean ok(int n) { return 1 <= n && n <= 100000; }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random rand = new Random();
        int num = Integer.parseInt(br.readLine());
        int[] input = new int[num];
        boolean[] ans = new boolean[num];
        int Y = 1431655765, N = 715827882;
        for (int i=0; i<num; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }
        for (int i=0; i<num-1; i++) {
            if (ok(input[i+1]^Y)) {
                ans[i] = true;
            }
            else if (ok(input[i+1]^N)) {
                ans[i] = false;
            }
        }
        int random = rand.nextInt(2);
        if (random==1) ans[num-1] = true;
        else ans[num-1] = false;
        
        for (int i=0; i<num; i++) {
            System.out.println("NY".charAt(ans[i] ? 1 : 0));
        }
    }

}
