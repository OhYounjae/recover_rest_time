package review_days;

public class Triangle implements Shape{
	int x, y;
	double area;
	
	Triangle(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	
	public void getArea() {
		this.area = this.x * this.y * 0.5;
	}
	
	
	Shape shape1 = new Triangle(10, 20);
	Shape shape2 = new Triangle(20, 30);
}
