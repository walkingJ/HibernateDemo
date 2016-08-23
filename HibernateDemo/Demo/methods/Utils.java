package methods;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Utils {
	private Session session = null;
	
	public Session createSession(){
		Configuration config = new Configuration();
		//这种获取session的方法在hibernate4.0以后就过期了
//		SessionFactory factory= config.configure("./configs/hibernate.cfg.xml").buildSessionFactory();
//		session = factory.openSession();
		//这种获取session的方法适用于hibernate4.3以后的版本
		config.configure();//如果hibernate.cfg.xml文件在根目录，参数就不用带路径
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		SessionFactory sf = config.buildSessionFactory(sr);
		this.session = sf.openSession();
		return session;
	}
	
	public void close(){
		if (session!=null && session.isOpen()) {  
			session.close();  
		} 
	}
}
