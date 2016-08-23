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
		//���ֻ�ȡsession�ķ�����hibernate4.0�Ժ�͹�����
//		SessionFactory factory= config.configure("./configs/hibernate.cfg.xml").buildSessionFactory();
//		session = factory.openSession();
		//���ֻ�ȡsession�ķ���������hibernate4.3�Ժ�İ汾
		config.configure();//���hibernate.cfg.xml�ļ��ڸ�Ŀ¼�������Ͳ��ô�·��
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
