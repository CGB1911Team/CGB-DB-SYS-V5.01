package com.cy.pj.sys.service;

import com.cy.pj.sys.entity.SysLog;
import com.github.pagehelper.PageInfo;

public interface SysLogService {
	
	/**
	 * 获取记录信息
	 * @param username
	 * @param startIndex
	 * @param pageSize
	 * @return
	 */
	PageInfo<SysLog> findPageObjects(String username,Integer pageCurrent);
}
