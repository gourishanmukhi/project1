package abstraction;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Square s = new Square();
      Rectangle r = new Rectangle();
      System.out.println(s);
      System.out.println(r);
      Shape sh;
      //create an object through implementable method
      sh = new Square(4.0f);
      sh.calArea();
      sh.show();
      sh=new Rectangle(4.0f,2.0f);
      sh.calArea();
      sh.show();
	}

}
