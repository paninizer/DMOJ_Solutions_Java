import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_19_J3 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputnum = Integer.parseInt(br.readLine());
		int counter=1;
		for (int i=0; i<inputnum; i++) {
			String string = br.readLine();
			String out = "";
            for (int j = 0; j < string.length(); j++){
                if (j != string.length() - 1 && string.charAt(j) == string.charAt(j+1)){
                    counter++;
                }else{
                	out+=counter + " " + string.charAt(j) + " ";
                    counter = 1;
                }
            }
            System.out.println(out.trim());
		}
	}

}
