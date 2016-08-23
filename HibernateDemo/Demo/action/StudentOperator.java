package action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class StudentOperator {	
	
	private Session session = null;
	public void Setting(){
		Configuration config = new Configuration();
		SessionFactory factory= config.configure("./configs/hibernate.cfg.xml").buildSessionFactory();
		session = factory.openSession();
	}
	
	public void Insert(Student student){
		Transaction trans = this.session.beginTransaction();
		this.session.save(student);
		trans.commit();
	}
	
	public void Close(){
		if (session != null) {  
			if (session.isOpen()) {  
				//关闭session  
				session.close();  
			}  
		} 
	}
	
	public static void main(String[] args) {
		try {
						
			StudentOperator studentDB = new StudentOperator();
			studentDB.Setting();
			
			Student student = new Student();
//			student.setId(3);
			student.setName("李四");
			student.setAge(14);
			student.setGender("male");
			student.setClassName("三班");
			student.setHeadTeacher("王斌");
			
			studentDB.Insert(student);
			studentDB.Close();
			System.out.println("插入数据成功!");
		} catch (Exception e) {
			e.printStackTrace();  
            //回滚事务  
//            session.getTransaction().rollback();
			System.out.println("插入数据失败!");
		} finally {  
			
        } 
	}

}
