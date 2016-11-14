import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;


class Send implements Runnable{
	private PipedOutputStream pos= null;
	public Send (){
		this.pos = new PipedOutputStream();
	}
	public void run(){
		String str = "hello world!";
		try {
			this.pos.write(str.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.pos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public PipedOutputStream getPos(){
		return pos;
	}
}
class Receive implements Runnable{
	private PipedInputStream pis = null;
	public Receive(){
		this.pis = new PipedInputStream();
	}
	public void run(){
		byte b[] = new byte[1024];
		int len =0;
		
			try {
				len = this.pis.read(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			try {
				this.pis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("接收的内容问为:"+new String(b,0,len));
	}
	
	
	public PipedInputStream getPis(){
		return pis;
	}
}
public class TestPipedOutputStreadmDemo {
 public static void main(String[] args) {
	Send s = new Send();
	Receive r = new Receive();
	try {
		s.getPos().connect(r.getPis());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	new Thread(s).start();
	new Thread(r).start();
}
}
