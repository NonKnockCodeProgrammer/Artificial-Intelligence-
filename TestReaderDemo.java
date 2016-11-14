package OutputStreamDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestReaderDemo {
	public static void main(String[] args) throws IOException {
		File file =  new File("G:"+File.separator+"Text.txt");
		
		Reader  reader = null;
		reader  =new FileReader(file);
		char[] c = new char[1024];
//		int temp=0;
		int len=reader.read(c);
//		while((temp  =reader.read())!=-1){
//			c[len]  =(char) reader.read();
//			len++;
//		}
		reader.close();
		System.out.println(new String(c,0,len));
	}
}
