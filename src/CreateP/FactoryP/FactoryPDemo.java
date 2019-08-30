package CreateP.FactoryP;

public class FactoryPDemo {

	public static void main(String[] args) {
	      ShapeFactory shapeFactory = new ShapeFactory();
	 
	      //��ȡ Circle �Ķ��󣬲��������� draw ����
	      Shape shape1 = shapeFactory.getShape(1);
	 
	      //���� Circle �� draw ����
	      shape1.draw();
	 
	      //��ȡ Rectangle �Ķ��󣬲��������� draw ����
	      Shape shape2 = shapeFactory.getShape(2);
	 
	      //���� Rectangle �� draw ����
	      shape2.draw();
	 
	      //��ȡ Square �Ķ��󣬲��������� draw ����
	      Shape shape3 = shapeFactory.getShape(3);
	 
	      if(shape3==null) System.out.println("");
	      //���� Square �� draw ����
	      
	   }
	}

