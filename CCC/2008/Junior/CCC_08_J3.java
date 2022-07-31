import java.io.*;

public class CCC_08_J3 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total_moves = 0, last_line, last_pos, line = 0, pos = 0;		
		char[] input = br.readLine().toCharArray();
		
		for (int i=0; i<input.length; ++i) {
			last_pos = pos;
			last_line = line;
			if (input[i] == ' ') {
				line = 4;
				pos = 2;
			} else if (input[i] == '-') {
				line = 4;
				pos = 3;
			} else if (input[i] == '.') {
				line = 4;
				pos = 4;
			} else {
				line = (input[i] - 'A') / 6;
				pos = (input[i] - 'A') % 6;
			}
			total_moves += Math.abs(line - last_line) + Math.abs(pos - last_pos);
		}
		
		total_moves += Math.abs(line - 4) + Math.abs(pos - 5);
		
		System.out.println(total_moves);
	}
}
