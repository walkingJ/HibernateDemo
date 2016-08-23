package methods;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CommonMethods {
	/*1.select����*/
	//��ѯ���ݷ���1(ֱ��ʹ��sql���)
	public List querySql (String sql,Session session) {
		List result = null;
		result = session.createSQLQuery(sql).list();
		return result;
	}
	//��ѯ���ݷ���2(ʹ�÷�װ�õ�hql���)
	public Object queryHql (String hql,Session session) {
		List result = null;
		result = session.createQuery(hql).list();
		if(result!=null && result.size()>0){
			return result.get(0);			
		}
		return null;
	}
	
	/*2.insert����*/
	//�������ݷ���a(�����������ݵ������ֶ�)
	public void insert(Object object,Session session){
		Transaction trans = session.beginTransaction();
		session.save(object);
		trans.commit();
		System.out.println("�������ݳɹ�!");
	}
	
	/*3.update����*/
	//�������ݷ���a(�����������ݵ������ֶΣ��޷����²����ֶΣ�������ȫ�ֶθ���Ч�ʽϵ�)
	public void update_a(Object object,Session session){
		Transaction trans = session.beginTransaction();
		session.update(object);
		trans.commit();
		System.out.println("�������ݳɹ�!");
	}
	//�������ݷ���b(ֻ�������趨���ֶΣ��Ƚ���Ч��Ҳ�ϸ�)
	public void update_b(String hql,Session session){
		Transaction trans = session.beginTransaction();
		Query query = session.createQuery(hql);
		query.executeUpdate();
		trans.commit();
		System.out.println("�������ݳɹ�!");
	}
	//�������ݷ���c(������a���ƣ�ʹ��saveOrUpdate()������������)
	public void update_c(Object object,Session session){
		Transaction trans = session.beginTransaction();
		session.saveOrUpdate(object);
		trans.commit();
		System.out.println("�������ݳɹ�!");
	}
	
	/*4.delete����*/
	//ɾ�����ݷ���a(ֱ��ɾ��������Ҫ�趨ɾ����������ԣ��о���ʵ��)
	public void delete_a(Object object,Session session){
		Transaction trans = session.beginTransaction();
		session.delete(object);
		trans.commit();
		System.out.println("ɾ�����ݳɹ�!");
	}
	//ɾ�����ݷ���b(����idɾ������)
	public void delete_b(String hql,int id,Session session){
		Transaction trans = session.beginTransaction();
		Query query = session.createQuery(hql);
//		query.setParameter(0, id);
		query.setInteger(0, id);//setInteger�Ĳ�����0�����id��Ӧ�еĵ�0�п�ʼ��������
		query.executeUpdate();
		trans.commit();
		System.out.println("ɾ�����ݳɹ�!");
	}
}
