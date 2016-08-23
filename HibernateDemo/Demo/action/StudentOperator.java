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
				//�ر�session  
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
			student.setName("����");
			student.setAge(14);
			student.setGender("male");
			student.setClassName("����");
			student.setHeadTeacher("����");
			
			studentDB.Insert(student);
			studentDB.Close();
			System.out.println("�������ݳɹ�!");
		} catch (Exception e) {
			e.printStackTrace();  
            //�ع�����  
//            session.getTransaction().rollback();
			System.out.println("��������ʧ��!");
		} finally {  
			
        } 
	}

}
