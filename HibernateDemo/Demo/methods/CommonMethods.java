package methods;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CommonMethods {
	/*1.select方法*/
	//查询数据方法1(直接使用sql语句)
	public List querySql (String sql,Session session) {
		List result = null;
		result = session.createSQLQuery(sql).list();
		return result;
	}
	//查询数据方法2(使用封装好的hql语句)
	public Object queryHql (String hql,Session session) {
		List result = null;
		result = session.createQuery(hql).list();
		if(result!=null && result.size()>0){
			return result.get(0);			
		}
		return null;
	}
	
	/*2.insert方法*/
	//插入数据方法a(插入整体数据的所有字段)
	public void insert(Object object,Session session){
		Transaction trans = session.beginTransaction();
		session.save(object);
		trans.commit();
		System.out.println("插入数据成功!");
	}
	
	/*3.update方法*/
	//更新数据方法a(更新整体数据的所有字段，无法更新部分字段，而且因全字段更新效率较低)
	public void update_a(Object object,Session session){
		Transaction trans = session.beginTransaction();
		session.update(object);
		trans.commit();
		System.out.println("更新数据成功!");
	}
	//更新数据方法b(只更新所设定的字段，比较灵活，效率也较高)
	public void update_b(String hql,Session session){
		Transaction trans = session.beginTransaction();
		Query query = session.createQuery(hql);
		query.executeUpdate();
		trans.commit();
		System.out.println("更新数据成功!");
	}
	//更新数据方法c(跟方法a相似，使用saveOrUpdate()方法更新数据)
	public void update_c(Object object,Session session){
		Transaction trans = session.beginTransaction();
		session.saveOrUpdate(object);
		trans.commit();
		System.out.println("更新数据成功!");
	}
	
	/*4.delete方法*/
	//删除数据方法a(直接删除对象，需要设定删除对象的属性，感觉不实用)
	public void delete_a(Object object,Session session){
		Transaction trans = session.beginTransaction();
		session.delete(object);
		trans.commit();
		System.out.println("删除数据成功!");
	}
	//删除数据方法b(根据id删除数据)
	public void delete_b(String hql,int id,Session session){
		Transaction trans = session.beginTransaction();
		Query query = session.createQuery(hql);
//		query.setParameter(0, id);
		query.setInteger(0, id);//setInteger的参数：0代表从id对应行的第0列开始处理数据
		query.executeUpdate();
		trans.commit();
		System.out.println("删除数据成功!");
	}
}
