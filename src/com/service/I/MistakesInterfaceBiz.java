package com.service.I;

import java.util.List;

import com.bean.Bct;
import com.bean.Mistakes;
import com.bean.Tkt;
import com.bean.Xzt;

public interface MistakesInterfaceBiz {
		/**
		 * ����һ������
		 */
		public boolean insert(Mistakes mistakes);		
		/**
		 * ɾ��һ������
		 */
		public boolean delete(Mistakes mistakes);
		/**
		 * ��ѯĳ��ѧ����ȫ������  
		 */
		public List<Mistakes> select(String username);		
		public List<Bct> selectbct(String username);	
		public List<Tkt> selecttkt(String username);	
		public List<Xzt> selectxzt(String username);
		/**
		 * ��֪ʶ���ѯĳ��ѧ����ȫ������
		 */
		public List<Mistakes> select(String username,String questionpoint);
		
}
