package com.service.I;

import java.util.List;

import com.bean.Bct;
import com.bean.Mistakes;
import com.bean.Tkt;
import com.bean.Xzt;

public interface MistakesInterfaceBiz {
		/**
		 * 增加一道错题
		 */
		public boolean insert(Mistakes mistakes);		
		/**
		 * 删除一道错题
		 */
		public boolean delete(Mistakes mistakes);
		/**
		 * 查询某个学生的全部错题  
		 */
		public List<Mistakes> select(String username);		
		public List<Bct> selectbct(String username);	
		public List<Tkt> selecttkt(String username);	
		public List<Xzt> selectxzt(String username);
		/**
		 * 按知识点查询某个学生的全部错题
		 */
		public List<Mistakes> select(String username,String questionpoint);
		
}
