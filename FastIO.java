import java.nio.*;
import java.nio.channels.*;
//Fast IO Template with dependencies
class FSU implements Flushable,Closeable{public ReadableByteChannel inputStream;public WritableByteChannel outputStream;public final int bufferSize;public ByteBuffer readBuffer;public ByteBuffer writeBuffer;private int bytesAvailable=0;private boolean closed=false;public FSU(){this(4096);}
    public FSU(int buffer){this(System.in,System.out,buffer);}
    public FSU(InputStream istream,OutputStream ostream,int buffer){inputStream=Channels.newChannel(istream);outputStream=Channels.newChannel(ostream);bufferSize=buffer;readBuffer=ByteBuffer.allocateDirect(buffer);writeBuffer=ByteBuffer.allocateDirect(buffer);}
    public void printAll(Object...validObjects)throws IOException{for(int i=0;i<validObjects.length;i++){print(validObjects[i]);}}
    public void printAllLines(Object...validObjects)throws IOException{for(int i=0;i<validObjects.length;i++){print(validObjects[i]);println();}}
    public void flushBuffer()throws IOException{writeBuffer.flip();outputStream.write(writeBuffer);writeBuffer.clear();}
    public void fillBuffer()throws IOException{readBuffer.clear();bytesAvailable=inputStream.read(readBuffer);readBuffer.position(0);}
    public byte nextByte()throws IOException{if(closed)throw new IOException("FastStreamUtilities Is Already Closed");if(readBuffer.position()>=bytesAvailable)fillBuffer();if(bytesAvailable==0)return-1;return readBuffer.get();}
    public String nextToken()throws IOException{StringBuilder sb=new StringBuilder();byte c=nextByte();while(c<=' ')c=nextByte();do{sb.append((char)c);}while((c=nextByte())>' ');return sb.toString();}
    public long nextLong()throws IOException{long ret=0;byte c=nextByte();while(c<=' ')
        c=nextByte();boolean neg=(c=='-');if(neg)
        c=nextByte();do{ret=ret*10+c-'0';}while((c=nextByte())>='0'&&c<='9');if(neg)
        return-ret;return ret;}
    public double nextDouble()throws IOException{double ret=0,div=1;byte c=nextByte();while(c<=' ')
        c=nextByte();boolean neg=(c=='-');if(neg)
        c=nextByte();do{ret=ret*10+c-'0';}while((c=nextByte())>='0'&&c<='9');if(c=='.'){while((c=nextByte())>='0'&&c<='9'){ret+=(c-'0')/(div*=10);}}
        if(neg)
            return-ret;return ret;}
    public int nextInt()throws IOException{int ret=0;byte c=nextByte();while(c<=' ')
        c=nextByte();boolean neg=(c=='-');if(neg)
        c=nextByte();do{ret=ret*10+c-'0';}while((c=nextByte())>='0'&&c<='9');if(neg)
        return-ret;return ret;}
    public char nextChar()throws IOException{return(char)nextByte();}
    public String nextLine()throws IOException{StringBuilder sb=new StringBuilder();byte c;while((c=nextByte())!=-1){if(c==10)
        break;sb.append((char)c);}
        return sb.toString();}
    public void writeByte(byte b)throws IOException{if(writeBuffer.position()>=bufferSize){flushBuffer();}
        writeBuffer.put(b);}
    public void writeBytes(byte[]arr)throws IOException{if(writeBuffer.remaining()<arr.length){for(int i=0;i<arr.length;i++){writeByte(arr[i]);}}else{writeBuffer.put(arr);}}
    public void print(Object s)throws IOException{writeBytes(s.toString().getBytes());}
    public void println(Object s)throws IOException{writeBytes(s.toString().getBytes());writeByte((byte)10);}
    public void println()throws IOException{writeByte((byte)10);}@Override
    public void flush()throws IOException{flushBuffer();}@Override
    public void close()throws IOException{flush();inputStream.close();outputStream.close();closed=true;}
}
