import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CCC_16_J2 {
	

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String lines1 = br.readLine();
        String lines2 = br.readLine();
        String lines3 = br.readLine();
        String lines4 = br.readLine();
        br.close();
        
        String[] strs1 = lines1.trim().split("\\s+");
        String[] strs2 = lines2.trim().split("\\s+");
        String[] strs3 = lines3.trim().split("\\s+");
        String[] strs4 = lines4.trim().split("\\s+");
        
        short[][] array = new short[4][4];
        short[] vertCount = new short[4];
        short[] horiCount = new short[4];
        for (byte i=0; i<4; i++) {
        	array[0][i]=Short.parseShort(strs1[i]);
        	array[1][i]=Short.parseShort(strs2[i]);
        	array[2][i]=Short.parseShort(strs3[i]);
        	array[3][i]=Short.parseShort(strs4[i]);
        }
        for (byte j=0; j<4;j++) {
        	horiCount[j] = (short) (array[j][0]+array[j][1]+array[j][2]+array[j][3]);
        	vertCount[j] = (short) (array[0][j]+array[1][j]+array[2][j]+array[3][j]);
        }

        byte vertcount=0;
        byte horicount=0;
        for(byte k=0; k<3; k++) {
        	if(horiCount[k]==horiCount[k+1]) {
        		horicount++;
        	}
        	if(vertCount[k]==vertCount[k+1]) {
        		vertcount++;
        	}
        	
        }
        
        if (horicount==3&&vertcount==3) {
        	System.out.println("magic");
        }
        else {
        	System.out.println("not magic");
        }
        
        
        
	}

}
