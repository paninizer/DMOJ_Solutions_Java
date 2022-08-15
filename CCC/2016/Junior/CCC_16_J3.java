import java.io.*;

public class CCC_16_J3 {

	static void findLPS(String text) {
        int N = text.length();
        if (N == 0)
            return;
        N = 2 * N + 1; 
        int[] L = new int[N + 1]; 
        L[0] = 0;
        L[1] = 1;
        int C = 1; 
        int R = 2; 
        int i = 0; 
        int iMirror; 
        int maxLPSLength = 0;
        int diff = -1;
        for (i = 2; i < N; i++) {
            iMirror = 2 * C - i;
            L[i] = 0;
            diff = R - i;
            if (diff > 0)
                L[i] = Math.min(L[iMirror], diff);
            while (((i + L[i]) + 1 < N && (i - L[i]) > 0) &&
                               (((i + L[i] + 1) % 2 == 0) ||
                         (text.charAt((i + L[i] + 1) / 2) ==
                          text.charAt((i - L[i] - 1) / 2)))) {
                L[i]++;
            }
 
            if (L[i] > maxLPSLength) {
                maxLPSLength = L[i];
            }
            if (i + L[i] > R) {
                C = i;
                R = i + L[i];
            }
        }
        System.out.println(maxLPSLength);
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String f = br.readLine();
		
		findLPS(f);
	}

}
