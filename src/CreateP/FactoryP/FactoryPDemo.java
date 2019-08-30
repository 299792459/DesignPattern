package CreateP.FactoryP;

public class FactoryPDemo {

	public static void main(String[] args) {
	      ShapeFactory shapeFactory = new ShapeFactory();
	 
	      //获取 Circle 的对象，并调用它的 draw 方法
	      Shape shape1 = shapeFactory.getShape(1);
	 
	      //调用 Circle 的 draw 方法
	      shape1.draw();
	 
	      //获取 Rectangle 的对象，并调用它的 draw 方法
	      Shape shape2 = shapeFactory.getShape(2);
	 
	      //调用 Rectangle 的 draw 方法
	      shape2.draw();
	 
	      //获取 Square 的对象，并调用它的 draw 方法
	      Shape shape3 = shapeFactory.getShape(3);
	 
	      if(shape3==null) System.out.println("");
	      //调用 Square 的 draw 方法
	      
	   }
	}

