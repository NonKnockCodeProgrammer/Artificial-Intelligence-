package test1;
abstract class Shape{
	public abstract double area();//计算面积
	public abstract double perimeter();//计算周长
}
class Rectangle extends Shape{
	private double wide ; // 宽
	private double longs ;//长
	
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
