package test1;
abstract class Shape{
	public abstract double area();//�������
	public abstract double perimeter();//�����ܳ�
}
class Rectangle extends Shape{
	private double wide ; // ��
	private double longs ;//��
	
	public Rectangle(){
		
	}
public Rectangle(double wide,double longs){
		super();
		this.wide = wide;
		this.longs=longs;
	}
	@Override
	public double area() {
		
		return wide*longs;
	}

	@Override
	public double perimeter() {
		
		return (2*wide)+(2*longs);
	}	
}
public class Test11 {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(2.0,4.0);
		System.out.println(rec.area());
		System.out.println(rec.perimeter());
	}
}
