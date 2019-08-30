package CreateP.PrototypeP;

import java.util.Hashtable;

public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap
	=new Hashtable<String,Shape>();
	
	public static Shape getShape(String shapeId){
		Shape cachedShape=shapeMap.get(shapeId);
		return (Shape)cachedShape.clone();
		
	}
	
	// 对每种形状都运行数据库查询，并创建该形状
	   // shapeMap.put(shapeKey, shape);
	   // 例如，我们要添加三种形状
	
	public static void loadCache(){
		
		//添加三种形状的原型，存到哈希表中
		//下次再new这三种形象，就可以直接克隆哈希表中的相应模型
		
		Circle circle=new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Square square=new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
		
		Rectangle rectangle = new Rectangle();
	    rectangle.setId("3");
	    shapeMap.put(rectangle.getId(),rectangle);
	}
}
