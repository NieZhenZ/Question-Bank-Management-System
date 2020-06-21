package com.dao.l;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;





import com.bean.StudentGrade;

/**
 * ѧ���ɼ������ݿ�ӿ���
 *
 */
public interface StudentGradeInterfaceDao {

	/**
	 * ����һ��ѧ���ɼ���¼
	 * @param studentGrade
	 * @return
	 */
	public boolean insert(StudentGrade studentGrade);
	
	public boolean updatesc(StudentGrade studentgrade, Connection con)throws SQLException;
	
	/**
	 * ɾ��һ��ѧ���ɼ���¼
	 * @param studentGrade
	 * @return
	 */
	public boolean delete(StudentGrade studentGrade);
	
	/**
	 * �޸�һ��ѧ���ɼ���¼
	 * @param studentGrade
	 * @return
	 */
	public boolean update(int bctscore,String username,String papername);
	
	/**
	 * ��ѯĳ��ѧ����ȫ���ɼ���¼
	 * @param username ѧ������
	 * @return ĳ��ѧ����ȫ���ɼ���¼StudentGrade
	 */
	public List<StudentGrade> select(String username);
	
	/**
	 * ��ѯĳ���Ծ���ĳ���༶��ȫ���ɼ���¼
	 * @param studentclass ѧ�����ڰ༶
	 * @param  papername �Ծ���
	 * @return ĳ���Ծ��ȫ���ɼ���¼
	 */
	public List<StudentGrade> select(String studentclass,String papername);
}