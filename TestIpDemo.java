package demo5;

public class TestIpDemo {
	public static void main(String[] args) {
		String str = "192.168.1.1";
		String regex = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
		if(str.matches(regex)){
			System.out.println("���Ϲ���");
		}else{
			System.out.println("�����Ϲ���");
		}
	}
}
