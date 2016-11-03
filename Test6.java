package test;
//取出“Java 技术学习班 20130214”中的第八个字符。
public class Test6 {
	public static void main(String[] args) {
		
		String Str = "Java技术学习班20130214";
		
		System.out.println("\t"+Str.substring(Str.indexOf("20130214")));//截取指定字符串   0214
		System.out.println("==========   截取指定字符串   0214   ================== \n\n");
		
		System.out.println("\t"+Str.charAt(8));//取出第八个字符
		System.out.println("==========      取出第八个字符             ================== \n\n");
		
		System.out.println(Str.replaceAll("0", ""));
		System.out.println("==========      消除所有的0       ================== \n\n");
		
		System.out.println(Str.substring(6,14));
		System.out.println("==========     截取指定长度字符串         ================== \n\n");
		
		
		
		
	}
}
