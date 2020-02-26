package com.cy.pj.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.cy.pj.sys.entity.SysLog;

@Mapper
public interface SysLogDao {
	
	/*总记录数*/
	int getRowCount(@Param("username") String username);
	
	/*获取记录信息*/
	List<SysLog> findPageObjects(
			@Param("username") String username,
			@Param("startIndex") Integer startIndex,
			@Param("pageSize") Integer pageSize);
}
