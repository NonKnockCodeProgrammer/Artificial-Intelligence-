import java.io.*;

public class TestSetoutDemo {
	public static void main(String[] args) throws IOException {
		System.setOut(new PrintStream(new FileOutputStream(new File("G:\\"
				+ "text3.txt"))));
		System.out.println("ÀîÐË»ª,");
		System.out.println("www.mldnjava.com¡£");
	}
}
