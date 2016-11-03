package test;

interface ClassName {
	abstract public String getClassName();
}

class Company implements ClassName {

	@Override
	public String getClassName() {
		return "Company";
	}

}

public class Test8 {
	public static void main(String[] args) {
		Company c = new Company();
		System.out.println(c.getClassName());
	}
}
