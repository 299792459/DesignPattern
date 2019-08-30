package CreateP.AbstractFactoryP;

public class FactoryProducer {

	public static AbstractFactoryP getFactory(String choice)
	{
		if(choice.equalsIgnoreCase("SHAPE")){
	         return new ShapeFactory();
	      } else if(choice.equalsIgnoreCase("COLOR")){
	         return new ColorFactory();
	      }
	      return null;
	}
}
