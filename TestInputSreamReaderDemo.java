package OutputStreamDemo;

import java.io.*;

public class TestInputSreamReaderDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("G:"+File.separator+"Text1.txt");
		Reader read = null;
		 read = new InputStreamReader(new FileInputStream(file));
		 char c[] = new char[1024];
		int len= read.read(c);
		 read.close();
		 System.out.println(len);
		 System.out.println(new String(c,0,len));
	}
}
