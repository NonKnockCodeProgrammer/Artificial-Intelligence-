package OutputStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestCopyDemo {
	public static void main(String[] args) throws IOException {
		File file1 = null;
		File file2 = null;

		file1 = new File("G:" + File.separator + "Text1.txt");
		file2 = new File("G:" + File.separator + "Text2.txt");

		if (file1.exists() && file2.exists()) {
			System.out.println("文件不存在！程序将退出");
			System.exit(0);
		}
		InputStream ip = null;
		OutputStream out = null;
		ip = new FileInputStream(file1);
		out = new FileOutputStream(file2);

		int temp = 0;
		int len = 0;
		if (ip != null && out != null) {
			while ((temp = ip.read()) != -1) {
				out.write(temp);	
			}
			System.out.println("文件复制成功");
		}else{
			System.out.println("文件复制失败");
		}

		ip.close();
		out.close();
	}
}
