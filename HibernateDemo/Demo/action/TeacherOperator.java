package action;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import methods.CommonMethods;
import methods.Utils;
import entity.Teacher;
import entity.Student;
import entity.School;

public class TeacherOperator {	
	
	private Teacher teacher;
	private static Utils utils = new Utils();
	private static Session session = null;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	//�����úʹ���session
	public void beforeClass(){
		this.session = utils.createSession();
	}
	
	public static void main(String[] args) {
		TeacherOperator tea = new TeacherOperator();
		tea.beforeClass();
		Teacher t = new Teacher();
		String sql = null;
		String hql = null;
		//��ͨ��get��load�����õ���po�������Ƕ�����persistent(�־�̬)
//		Teacher t1 = tea.getTeacher();
		//���÷�������Ϊ������ʹ�������SQL����
		CommonMethods commonMethods = new CommonMethods();
		try {
			//��ʱ��֪����;����ע�͵�......
//			Criteria c = session.createCriteria(t.getClass());
			
			//����ԭ��SQL��ѯ����
//			sql = "select * from teacher";
//			List test = commonMethods.querySql(sql, session);
//			//��ѯ�Ѿ�����������Ĵ���ֻ��Ϊ����ʾ��ѯ�Ľ��
//			for (int i = 0; i < test.size(); i++) {
//				Object[] ob = (Object[])test.get(i);
//				t.setId((Integer)ob[0]); 
//				t.setName(ob[1].toString());
//				t.setAge((Integer)ob[2]);
//		     	t.setGender(ob[3].toString());
//				t.setSalary((Double)ob[4]);
//				t.setSubject(ob[5].toString());
//				t.setSchoolID((Integer)ob[6]);
//				for (int j = 0; j < ob.length; j++) {
//					String type = (ob[j].getClass().getName()).substring(10);
//					String enter = "";
//					if (j == ob.length - 1) {
//						enter = "\n";
//					}
//					System.out.print(ob[j]+"("+type+")"+"\t"+enter);
//				}
//			}
			
			//���԰�Schoolʵ��set��Teacherʵ����
//			School school = new School();
//			hql = "select s from School s where s.name='"+"��һ��ѧ'";
//			school = (School)commonMethods.queryHql(hql, session);
//			
//			//���Բ��뷽��
//			t.setName("��b");
//			t.setAge(23);
//			t.setGender("male");
//			t.setSalary(2333.00);
//			t.setSubject("2b");
//			t.setSchoolID(1);
//			commonMethods.insert(t, session);
			
			
			//���Ը��·���a(������������)
//			t.setId(8); 
//			t.setName("��b");
//			t.setAge(11);
//			t.setGender("male");
//			t.setSalary(1234.00);
//			t.setSubject("�Ǻ�");
//			t.setSchoolID(2);
//			commonMethods.update_a(t, session);
			
			//���Ը��·���b(���²����ֶΣ�����ʱ���³�id��Ĳ����ֶ�)
//			hql = "update Teacher t set t.name='��b',t.subject='װb' "
//					   + "where t.id=8";
//			commonMethods.update_b(hql, session);
			
			//���Ը��·���c(���¶���Ĳ����ֶΣ��Ȳ�ѯ�õ�������saveOrUpdate()����)
//			hql = "from Teacher t where t.id=8";
//			t = (Teacher)commonMethods.queryHql(hql, session);
//			t.setGender("female");
//			t.setSalary(6666.00);
//			t.setAge(23);
//			commonMethods.update_c(t, session);
			
			
			//����ɾ������a(ֱ��ɾ��������Ҫ�趨���󣬱Ƚ��鷳...)
//			t.setId(8); 
//			t.setName("��b");
//			t.setAge(23);
//			t.setGender("male");
//			t.setSalary(2333.00);
//			t.setSubject("2b");
//			t.setSchoolID(1);
//			commonMethods.delete_a(t, session);
			
			//����ɾ������b(����idɾ������)
//			hql = "delete Teacher t where t.id=?";
//			commonMethods.delete_b(hql, 8, session);
			
			
			//����HQL��ѯ����
//			t = null;
//			hql = "select s.teacher from Student s where s.id=1";
//			t = (Teacher)commonMethods.queryHql(hql, session);
//			System.out.println(t.getId()+t.getName()+t.getAge()+t.getGender()+t.getSalary()+t.getSubject()+t.getSchoolID());
//			
//			School s = null;
//			hql = "select s.school from Student s where s.id=1";
//			s = (School)commonMethods.queryHql(hql, session);
//			System.out.println(s.getId()+s.getName()+s.getTel()+s.getCity()+s.getOutlay()+s.getType());
//			
//			s = null;
//			hql = "select t.school from Teacher t where t.id=1";
//			s = (School)commonMethods.queryHql(hql, session);
//			System.out.println(s.getId()+s.getName()+s.getTel()+s.getCity()+s.getOutlay()+s.getType());
			
			utils.close();

		} catch (Exception e) {
			e.printStackTrace();  
            //�ع�����  
            session.getTransaction().rollback();
			System.out.println("���ݴ���ʧ�ܣ�ִ�лع�����!");
		} 
	}


}
