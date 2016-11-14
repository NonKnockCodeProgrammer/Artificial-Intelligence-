package OutputStreamDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("G:"+File.separator+"Test.txt");
		OutputStream out = null;
		out = new FileOutputStream(file,true);
		String str = "lolololo";
		byte[] b = str.getBytes();
		for( int i = 0 ; i < b.length ; i++ ){
			out.write(b[i]);
		}
		out.close();
	}

	
}
