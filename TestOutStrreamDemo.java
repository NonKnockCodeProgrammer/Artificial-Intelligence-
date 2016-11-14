import java.io.IOException;
import java.io.OutputStream;


public class TestOutStrreamDemo {
	public static void main(String[] args) throws IOException {
		OutputStream  out = System.out;
		out.write("hello world".getBytes());
		out.close();
	
	}
}
