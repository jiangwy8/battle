package com.battle.core.pojo.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 用户
 *
 * @author : code generator
 * @version : 1.0
 * @since : 2018-11-02
 */
@Data
public class SysUser implements Serializable {
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value = "主键ID")
	private Long id;
	@ApiModelProperty(value = "用户编号")
	private String userCode;
	@ApiModelProperty(value = "用户名称")
	private String userName;
	@ApiModelProperty(value = "电话")
	private String phone;
	@ApiModelProperty(value = "手机")
	private String mobile;
	@ApiModelProperty(value = "邮箱")
	private String email;
	@ApiModelProperty(value = "图片")
	private String img;
	@ApiModelProperty(value = "图片路径")
	private String imgPath;
	@ApiModelProperty(value = "仓库编码")
	private String warehouseCode;
	@ApiModelProperty(value = "仓库名称")
	private String warehouseName;
	private Set<String> allowApis;
	private Map<String, String> dataAuth;
	private List<String> roleCodes;
}