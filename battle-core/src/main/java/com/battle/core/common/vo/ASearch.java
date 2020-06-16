package com.battle.core.common.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Data
public class ASearch<T> implements Serializable {
	private static final long serialVersionUID = 1L;
	private T search;
	@ApiModelProperty(value = "页码", example = "1")
	private int pageNo;
	@ApiModelProperty(value = "条数", example = "20")
	private int pageSize;
	@ApiModelProperty(value = "排序", example = "id")
	private String sort;

	public void setSort(String sort) {
		this.sort = filterSpecialChar(sort == null || sort.equals("") ? "createTime desc" : sort);
	}

	public static String filterSpecialChar(String str) {
		String regEx="[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(str);
		return m.replaceAll("");
	}

}
