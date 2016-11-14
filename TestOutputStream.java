package OutputStreamDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestOutputStream {
	public static void main(String[] args) throws IOException {
		File file = new File("G:"+File.separator+"Text1.txt");
		Writer out = null;
		out = new OutputStreamWriter(new FileOutputStream(file));
		out.write(111111111+"\n"+222222222);
		out.close();
		
	}
}
