import java.io.*;

public class CCC_01_J2 {
	
    static int modInverse(int a, int m) {
        
        for (int x = 1; x < m; x++)
            if (((a%m) * (x%m)) % m == 1)
                return x;
        return -1;
    }
    
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int check = modInverse(a, m);
		if (check==-1) {
			System.out.println("No such integer exists.");
		} else {
			System.out.println(check);
		}
	}

}
