package demo2;

public class LognDemo {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("����ĸ�ʽ����ȷ��ϵͳ�˳�");
			System.out.println("��ʽ��java LoginDEMO ");
		}
		String name = args[0];
		
		String password = args[1];
		
		if (name.equals("lixinghua") && password.equals("mldn")) {
			System.out.println("��ӭ " + name + "���٣�");
		} else {
			System.out.println("�����û��������� ");
		}
	}
}