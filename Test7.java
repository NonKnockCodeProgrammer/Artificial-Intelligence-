package test;

class Acount{
	private String name;
	private double balance;
	
	Acount(String n,double d){
		name = n;
		balance = d;
	}
	public Acount() {
		// TODO Auto-generated constructor stub
	}
	public String toString (){
		return "姓名: "+name+"\n"+"余额: "+balance+"\n";
	}
}

public class Test7 {
	

	public static void main(String[] args) {
		
		String	str = new Acount("王时光",2000.0).toString();
	
		System.out.println(str);
		
	}
}
