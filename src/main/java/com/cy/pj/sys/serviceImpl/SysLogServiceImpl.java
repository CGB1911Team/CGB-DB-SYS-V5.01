package com.cy.pj.sys.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.pj.common.exception.ServiceException;
import com.cy.pj.common.vo.PageObject;
import com.cy.pj.sys.dao.SysLogDao;
import com.cy.pj.sys.entity.SysLog;
import com.cy.pj.sys.service.SysLogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class SysLogServiceImpl implements SysLogService{

	@Autowired
	private SysLogDao sysLogDao;
	
	@Override
	public PageInfo<SysLog> findPageObjects(String username, Integer pageCurrent) {
		if(pageCurrent==null||pageCurrent<1) 
			throw new IllegalArgumentException("当前页码不合法");
		int rowCount = sysLogDao.getRowCount(username);
		if (rowCount<1)
			throw new ServiceException("未查到相关记录");
		int pageSize=7;
		PageHelper.startPage(pageCurrent, pageSize);
		int startIndex=(pageCurrent-1)*pageSize;
		
		List<SysLog> records = sysLogDao.findPageObjects(username, startIndex, pageSize);
		
		return new PageInfo<>(records);
		//return new PageObject<>(pageCurrent, pageSize, rowCount, records);
	}
	
}
