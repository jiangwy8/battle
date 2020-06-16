/**
 * 
 */
package com.battle.core.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author AceNada
 *
 */

@ApiModel(description = "统一返回结果集类（非实体类）")
public class AResultSet<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty("状态编码")
	private Integer status;

	@ApiModelProperty("信息")
	private String message;

	private T data;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
