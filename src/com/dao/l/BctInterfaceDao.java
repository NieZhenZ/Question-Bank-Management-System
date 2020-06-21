package com.dao.l;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.bean.Bct;

/**
 * ��������ݿ�ӿ���
 *
 */
public interface BctInterfaceDao {

	/**
	 * ����һ�������
	 * @param bct
	 * @return
	 */
	public boolean insert(Bct bct, Connection con)throws SQLException;
	
	/**
	 * ɾ��һ�������
	 * @param bct
	 * @return
	 */
	public boolean delete(Bct bct);
	
	/**
	 * �����޸�һ�������
	 * @param bct
	 * @return
	 */
	public boolean update(Bct bct);
	
	/**
	 * ��ѯȫ�������
	 * @param ��
	 * @return ����⼯��
	 */
	public List<Bct> select();
	
	/**
	 * ��֪ʶ���ѯ�����
	 * @param questionpoint ֪ʶ��
	 * @return ����⼯��
	 */
	public List<Bct> select(String questionpoint);
}