package CreateP;

public class SingletonP {

	//˽�й��췽���������޷�����
	private SingletonP(){}
	
	//����ʽ
	//��ģʽ���ص�����һ�����ؾʹ���һ��������
	//��֤�ڵ��� getInstance ����֮ǰ�����Ѿ������ˡ�
	private static final SingletonP Hungryinstance=new SingletonP();
	public static SingletonP getHungryInstance()
	{
		return Hungryinstance;
	}
	
	//����ʽ
	//��ģʽ���ص��������ʱû�����ɵ�����ֻ�е���һ�ε��� getlnstance ����ʱ��ȥ�������������
	//ע�⣺�����д���Ƕ��̳߳�����Ҫɾ�����������еĹؼ��� volatile �� synchronized��
	//���򽫴����̷߳ǰ�ȫ�����⡣�����ɾ���������ؼ��־��ܱ�֤�̰߳�ȫ������ÿ�η���ʱ��Ҫͬ����
	//��Ӱ�����ܣ������ĸ������Դ����������ʽ������ȱ�㡣
	private static volatile SingletonP Lazyinstance=null;
	public static synchronized SingletonP getLazyInstance()
	{
		if(Lazyinstance==null)
		{
			Lazyinstance=new SingletonP();
		}
		return Lazyinstance;
	}
	
	public static void main(String []args)
	{
		
		//���Ϸ��Ĺ��캯��
	      //����ʱ���󣺹��캯�� SingleObject() �ǲ��ɼ���
	      //SingleObject object = new SingleObject();
		
		SingletonP sph=new SingletonP().getHungryInstance();
		SingletonP spl=new SingletonP().getLazyInstance();
	}
	
	
	
}
