package CreateP.FactoryP;

public class ShapeFactory {

	public Shape getShape(int ShapeTypeId)
	{
		if(ShapeTypeId==1)
		{
			return new Rectangle();
		}
		if(ShapeTypeId==2)
		{
			return new Square();
		}
		System.out.println("��������ȷ��ѡ�");
		
		return null;
	}
}
