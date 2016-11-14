package OutputStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestInputStreamDemo1 {
	public static void main(String[] args) throws IOException {
		File file = new File("G:"+File.separator+"Test.txt");
		InputStream ip = new FileInputStream(file);
		int temp=0;
		int len =0;
		byte b[] =new byte[1024];
		while((temp=ip.read())!=-1){
			b[len]= (byte) temp;
			len++;
			System.out.println(temp);
		}
		ip.close();
		System.out.println(temp);
		System.out.println(new String(b));
	}
}
