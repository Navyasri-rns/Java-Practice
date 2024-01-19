package oops;

class Triangle{
	int length = 3,width=4,height=5;
	
	Triangle(){
		int length; 
		int width; 
		int height;
			
	}
//	Triangle(int l, int w, int h){
//		length = l;
//		width = w;
//		height = h;
//	}
	int area() {
		return length*width*height;
}
	int perimeter() {
		return length+width+height;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
		
}
public class AreaPerimeterTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle();
		Triangle t1 = new Triangle();
		System.out.println("Area of Triangle: "+t.area());
		System.out.println("Perimeter of Triangle: "+t.perimeter());
    	t.setLength(10);
		System.out.println("Area of Triangle1: "+t.area());
		System.out.println("Area of Triangle1: "+ t.area()+ " and width is "+ t.getWidth());
	}

}
