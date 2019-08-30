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
	
	//这个是java自己的克隆方法，传入一个obj，返回这个obj的克隆
	public Object clone()
	{
		Object clone=null;
		try {
			//通过super关键字调用其克隆方法。
			clone=super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clone;
	}
}
