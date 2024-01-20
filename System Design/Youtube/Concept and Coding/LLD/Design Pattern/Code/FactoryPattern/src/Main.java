
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shapeObj = shapeFactory.getShape("Rectangle");
		shapeObj.draw();
	}

}
