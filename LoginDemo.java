package demo2;

class Check {
	public boolean validata(String name, String password) {
		if (name.equals("110") && password.equals("aaa")) {
			return true;
		} else {
			return false;
		}
	}
}

class Operate {
	private String info[];

	public Operate(String info[]) {
		this.info = info;
	}

	public String login() {
		Check check = new Check();
		this.isExit();
		String name = this.info[0];
		String password = this.info[1];
		String string = null;
		if (check.validata(name, password)) {
			string = "欢迎: " + name;
		}
		return string;
	}

	public void isExit() {
		if (this.info.length != 2) {
			System.out.println("输入的参数不正确，系统退出 ");
			System.out.println("格式：名字     密码 ");
			System.exit(1);
		}
	}
}

public class LoginDemo {
	public static void main(String[] args) {
		Operate oper = new Operate(args);
		System.out.println(oper.login());
	}
}
