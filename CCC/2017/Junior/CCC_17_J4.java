import java.io.*;

public class CCC_17_J4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
        int count = 0;
        count += ((input/720) * 31);
        input%=720;
    	int[] current = {1, 2, 0, 0};
        for (int i=0; i<input; i++) {
        	current[3]+= 1;
            if (current[3] == 10) {
                current[3] = 0;
                current[2] += 1;
                if (current[2] == 6) {
                    current[2] = 0;
                    current[1]++;
                    if (current[1] == 10) {
                        current[1] = 0;
                        current[0] = 1;
                    } else if (current[1] == 3 && current[0] == 1) {
                        current[0] = 0;
                        current[1] = 1;
                    }
                }
            }
            if (current[0] == 0) {
                if (current[3] - current[2] == current[2] - current[1]) {
                    count++;
                }
            } else if (current[3] - current[2] == current[2] - current[1] && current[2] - current[1] == current[1] - current[0]){
                count++;

            }
        }
        System.out.println(count);

	}

}
