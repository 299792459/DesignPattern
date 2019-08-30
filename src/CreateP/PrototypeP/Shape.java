package CreateP.PrototypeP;

public abstract class Shape implements Cloneable{

	private String id;
	protected String type;
	
	abstract void draw();
	
	public String getType()
	{
		return type;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String Id)
	{
		this.id=Id;
	}
	
	//�����java�Լ��Ŀ�¡����������һ��obj���������obj�Ŀ�¡
	public Object clone()
	{
		Object clone=null;
		try {
			//ͨ��super�ؼ��ֵ������¡������
			clone=super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clone;
	}
}
