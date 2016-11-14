package OutputStreamDemo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestReaderDemo1 {
	public static void main(String[] args) throws IOException {
		File file = new File("G:" + File.separator + "Text.txt");

		Reader reader = null;
		reader = new FileReader(file);
		char[] c = new char[1024];
		int temp=0;
		int len = 0;
		
		while((temp=reader.read())!=-1){
			c[len]  =(char) temp;
			len++;
		}
		reader.close();
		System.out.println(new String(c));
	}
}
