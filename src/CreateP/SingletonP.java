package CreateP;

public class SingletonP {

	//私有构造方法，让其无法访问
	private SingletonP(){}
	
	//饿汉式
	//该模式的特点是类一旦加载就创建一个单例，
	//保证在调用 getInstance 方法之前单例已经存在了。
	private static final SingletonP Hungryinstance=new SingletonP();
	public static SingletonP getHungryInstance()
	{
		return Hungryinstance;
	}
	
	//懒汉式
	//该模式的特点是类加载时没有生成单例，只有当第一次调用 getlnstance 方法时才去创建这个单例。
	//注意：如果编写的是多线程程序，则不要删除上例代码中的关键字 volatile 和 synchronized，
	//否则将存在线程非安全的问题。如果不删除这两个关键字就能保证线程安全，但是每次访问时都要同步，
	//会影响性能，且消耗更多的资源，这是懒汉式单例的缺点。
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
		
		//不合法的构造函数
	      //编译时错误：构造函数 SingleObject() 是不可见的
	      //SingleObject object = new SingleObject();
		
		SingletonP sph=new SingletonP().getHungryInstance();
		SingletonP spl=new SingletonP().getLazyInstance();
	}
	
	
	
}
