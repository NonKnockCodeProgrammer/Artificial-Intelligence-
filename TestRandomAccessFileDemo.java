import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class TestRandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		File f = new File("c:"+File.separator+"Users"+File.separator+
				"Administrator"+File.separator+"Desktop"+File.separator+
				"Test.txt");
		RandomAccessFile raf = null;
		raf = new RandomAccessFile(f,"rw");
		
		String name = null;
		String age = null;
		int n = 0;
		
		
		name = "lishiguang";
		age ="  20    ";
		n=20;
		raf.writeBytes(name);
		raf.writeBytes(age);
		raf.write(n);
		raf.writeByte(n);
		raf.writeInt(n);
		raf.writeChar(n);
		raf.write(n);
		
		raf.read();
		
		raf.close();
		
	}
}
