import java.io.File;

	
public class TestisDirectoryDemo {
	public static void main(String[] args) {
		File f = new File("C:"+File.separator+"Intel");
		if (f.isDirectory()) {
			System.out.println(f.getPath()+"�� Ŀ¼");
		}else{
			System.out.println(f.getPath()+"  ����Ŀ¼");
		}
	}
}
