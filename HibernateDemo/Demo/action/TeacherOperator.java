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
	
	//先配置和创建session
	public void beforeClass(){
		this.session = utils.createSession();
	}
	
	public static void main(String[] args) {
		TeacherOperator tea = new TeacherOperator();
		tea.beforeClass();
		Teacher t = new Teacher();
		String sql = null;
		String hql = null;
		//当通过get或load方法得到的po对象它们都处于persistent(持久态)
//		Teacher t1 = tea.getTeacher();
		//调用方法类作为对象，来使用里面的SQL方法
		CommonMethods commonMethods = new CommonMethods();
		try {
			//暂时不知道用途，先注释掉......
//			Criteria c = session.createCriteria(t.getClass());
			
			//测试原生SQL查询方法
//			sql = "select * from teacher";
//			List test = commonMethods.querySql(sql, session);
//			//查询已经结束，下面的代码只是为了显示查询的结果
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
			
			//测试把School实体set到Teacher实体中
//			School school = new School();
//			hql = "select s from School s where s.name='"+"第一中学'";
//			school = (School)commonMethods.queryHql(hql, session);
//			
//			//测试插入方法
//			t.setName("逗b");
//			t.setAge(23);
//			t.setGender("male");
//			t.setSalary(2333.00);
//			t.setSubject("2b");
//			t.setSchoolID(1);
//			commonMethods.insert(t, session);
			
			
			//测试更新方法a(更新整个对象)
//			t.setId(8); 
//			t.setName("逗b");
//			t.setAge(11);
//			t.setGender("male");
//			t.setSalary(1234.00);
//			t.setSubject("呵呵");
//			t.setSchoolID(2);
//			commonMethods.update_a(t, session);
			
			//测试更新方法b(更新部分字段，测试时更新除id外的部分字段)
//			hql = "update Teacher t set t.name='苦b',t.subject='装b' "
//					   + "where t.id=8";
//			commonMethods.update_b(hql, session);
			
			//测试更新方法c(更新对象的部分字段，先查询得到对象，用saveOrUpdate()方法)
//			hql = "from Teacher t where t.id=8";
//			t = (Teacher)commonMethods.queryHql(hql, session);
//			t.setGender("female");
//			t.setSalary(6666.00);
//			t.setAge(23);
//			commonMethods.update_c(t, session);
			
			
			//测试删除方法a(直接删除对象，需要设定对象，比较麻烦...)
//			t.setId(8); 
//			t.setName("逗b");
//			t.setAge(23);
//			t.setGender("male");
//			t.setSalary(2333.00);
//			t.setSubject("2b");
//			t.setSchoolID(1);
//			commonMethods.delete_a(t, session);
			
			//测试删除方法b(根据id删除数据)
//			hql = "delete Teacher t where t.id=?";
//			commonMethods.delete_b(hql, 8, session);
			
			
			//测试HQL查询方法
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
            //回滚事务  
            session.getTransaction().rollback();
			System.out.println("数据处理失败，执行回滚操作!");
		} 
	}


}
