import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestReadDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("c:" + File.separator + "Users" + File.separator
				+ "Administrator" + File.separator + "Desktop" + File.separator
				+ "Test.txt");
		RandomAccessFile rdf = new RandomAccessFile(file, "r");

		String name = null;
		int age = 0;
		byte[] b = new byte[8];
		rdf.skipBytes(12);
		for( int i = 0 ; i < b.length ; i++ ){
			b[1] = rdf.readByte();			
		}
		 name = new String(b);
		 age = rdf.readInt();
		 System.out.println("第二个人的信息"+"名字 "+name+"年龄 "+age);
		 
		 rdf.seek(0);
		 b = new byte[8];
		 for( int i = 0 ; i < b.length ; i++ ){
			b[i] = rdf.readByte();
		}
		 name = new String(b);
		 age = rdf.readInt();
		 System.out.println("第一个人的信息"+"名字 "+name+"年龄 "+age);
		 
		 rdf.skipBytes(12);
		 b = new byte[8];
		 for( int i = 0 ; i < b.length ; i++ ){
			b[i] = rdf.readByte();
		}
		 name = new String(b);
		 age = rdf.readInt();
		 System.out.print("第三个人的信息"+"名字 "+name+"年龄 "+age);
		 rdf.close();
		 String str=null;
		 str=rdf.readLine();
		 System.out.println(str);
	}
}