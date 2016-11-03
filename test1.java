package test2;

class math{
	int temp;
	public int  div(int a,int b) throws Exception {
		try{
			temp= a/b;
		}catch(Exception e){
				throw e;
		}
		return temp;
	}
}

public class test1 {
	public static void main(String[] args) {
		math m = new math();
		try {
			System.out.println(m.div(5, 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}