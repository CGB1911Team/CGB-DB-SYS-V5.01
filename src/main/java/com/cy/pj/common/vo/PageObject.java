package com.cy.pj.common.vo;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
<<<<<<< HEAD
 * 此类封 装  分页    信息   的数据
=======
 * 此类封装分页    信息的数据
>>>>>>> branch 'master' of https://github.com/CGB1911Team/CGB-DB-SYS-V5.01.git
 * @author Administrator
 *
 * @param <T>
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class PageObject<T> implements Serializable {
//测试一下
	private static final long serialVersionUID = -5445557439367144431L;

	/**当前页的页码值*/
	private Integer pageCurrent=1;
    /**页面大小*/
    private Integer pageSize=3;
    /**总行数(通过查询获得)*/
    private Integer rowCount=0;
    /**总页数(通过计算获得)*/
    private Integer pageCount=0;
    /**当前页记录*/
    private List<T> records;
    
	public PageObject(Integer pageCurrent, Integer pageSize, Integer rowCount, List<T> records) {
		super();
		this.pageCurrent = pageCurrent;
		this.pageSize = pageSize;
		this.rowCount = rowCount;
		this.records = records;
		this.pageCount=(rowCount-1)/pageSize +1;
	}

}
