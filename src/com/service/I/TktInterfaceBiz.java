package com.service.I;

import java.sql.SQLException;
import java.util.List;

import com.bean.Tkt;

public interface TktInterfaceBiz {
	/**
	 * ����һ�������
	 * @param tkt
	 * @return
	 */
	public boolean insert(Tkt tkt)throws SQLException;
	
	/**
	 * ɾ��һ�������
	 * @param tkt
	 * @return
	 */
	public boolean delete(Tkt tkt);
	
	/**
	 * �����޸�һ�������
	 * @param tkt
	 * @return
	 */
	public boolean update(Tkt tkt);
	
	/**
	 * ��ѯȫ�������
	 * @param tkt
	 * @return ����⼯��
	 */
	public List<Tkt> select();
	
	/**
	 * ��֪ʶ���ѯ�����
	 * @param questionpoint ֪ʶ��
	 * @return ����⼯��
	 */
	public List<Tkt> select(String questionpoint);
}