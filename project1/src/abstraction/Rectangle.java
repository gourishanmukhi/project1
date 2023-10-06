package abstraction;

public class Rectangle extends Shape{
private float height;
private float width;
     void calArea() {
    	 //TODO Auto-generated method stub
    	 super.area=height*width;
     }
     public Rectangle() {
    	 super();
    	 this.width=0.5f;
    	 this.height=2.5f;
     }
     public Rectangle(float height, float width) {
    	 super();
    	 this.height=height;
    	 this.width=width;
     }
	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}
     
}
