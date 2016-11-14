import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


public class TestWriteDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("G:"+File.separator+"test.txt");
		RandomAccessFile rdf = new RandomAccessFile(file, "rw");
		String name = "ÔçË¯ÔçÆð£¡good evening in chinese";
		char age = '2';
		rdf.writeBytes(name);
		rdf.writeChar(age);
		
		rdf.writeInt(20);
		
		rdf.seek(0);
		byte[] b = new byte[8];
		String str=null;
		for( int i = 0 ; i < b.length ; i++ ){
			b[i]=rdf.readByte();
		}
		str = new String(b);
		 age = (char) rdf.readChar();
		System.out.println(name+"    "+age);
		
		rdf.close();
		
	}
}
