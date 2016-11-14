package demo5;

public class TestIpDemo {
	public static void main(String[] args) {
		String str = "192.168.1.1";
		String regex = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
		if(str.matches(regex)){
			System.out.println("符合规则");
		}else{
			System.out.println("不符合过则");
		}
	}
}
