package com.cy.pj.common.vo;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 将最终的查询结果，信息状态，封装成Json数据
 * @author Administrator
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class JsonResult implements Serializable{

	private static final long serialVersionUID = -7795815851642138272L;

	private int state=1;
	private String message="ok";
	private Object data;
	
	public JsonResult(Object data) {
		this.data = data;
	}

	public JsonResult(String message) {
		this.message = message;
	}
	
	public JsonResult(Throwable t) {
		this.state=0;
		this.message=t.getMessage();
	}
}
