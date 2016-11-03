package demo2;

public class LognDemo {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("输入的格式不正确，系统退出");
			System.out.println("格式：java LoginDEMO ");
		}
		String name = args[0];
		
		String password = args[1];
		
		if (name.equals("lixinghua") && password.equals("mldn")) {
			System.out.println("欢迎 " + name + "光临！");
		} else {
			System.out.println("错误用户名和密码 ");
		}
	}
}