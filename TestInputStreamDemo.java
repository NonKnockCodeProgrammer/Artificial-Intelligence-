import java.io.IOException;
import java.io.InputStream;


public class TestInputStreamDemo {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		byte b[]= new byte[1024];
		System.out.println("«Î ‰»Îƒ⁄»›£∫");
		int len = in.read(b);
		System.out.println(new String(b,0,len));
		in.close();
	}
}
