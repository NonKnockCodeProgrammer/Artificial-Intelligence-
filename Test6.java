package test;
//ȡ����Java ����ѧϰ�� 20130214���еĵڰ˸��ַ���
public class Test6 {
	public static void main(String[] args) {
		
		String Str = "Java����ѧϰ��20130214";
		
		System.out.println("\t"+Str.substring(Str.indexOf("20130214")));//��ȡָ���ַ���   0214
		System.out.println("==========   ��ȡָ���ַ���   0214   ================== \n\n");
		
		System.out.println("\t"+Str.charAt(8));//ȡ���ڰ˸��ַ�
		System.out.println("==========      ȡ���ڰ˸��ַ�             ================== \n\n");
		
		System.out.println(Str.replaceAll("0", ""));
		System.out.println("==========      �������е�0       ================== \n\n");
		
		System.out.println(Str.substring(6,14));
		System.out.println("==========     ��ȡָ�������ַ���         ================== \n\n");
		
		
		
		
	}
}
