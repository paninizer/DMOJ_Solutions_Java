import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  byte A = Byte.parseByte(br.readLine());
  byte B = Byte.parseByte(br.readLine());
  byte C = Byte.parseByte(br.readLine());
  byte D = Byte.parseByte(br.readLine());

	if (A<B&& B<C && C<D){
	System.out.println("Fish Rising");
  }
	else if (A>B&&B>C&&C>D){
	System.out.println("Fish Diving");
  }
	else if (A==B&&B==C&&C==D){
	System.out.println("Fish At Constant Depth");
  }
	else{
	System.out.println("No Fish");
  }
    }
}
