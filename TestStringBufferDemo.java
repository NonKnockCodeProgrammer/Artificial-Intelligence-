package demo5;

public class TestStringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		int a=0;
		for( char i ='a' ; i <='z'  ; i++ ){
			if(a==13){
				sb.append("\n");
				sb.append("n  ");
				}else{
					sb.append(i+"  ");
				}
			 
			 a++;
		}
		System.out.println(sb);
		
	}
	
}
