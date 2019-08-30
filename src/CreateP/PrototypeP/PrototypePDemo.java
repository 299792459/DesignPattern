package CreateP.PrototypeP;

public class PrototypePDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShapeCache.loadCache();
		
		Shape clonedshape=(Shape)ShapeCache.getShape("1");
		System.out.println("shape:"+clonedshape.getType());
		
		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
	    System.out.println("Shape : " + clonedShape2.getType());        
	 
	    Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
	    System.out.println("Shape : " + clonedShape3.getType());
	}

}
