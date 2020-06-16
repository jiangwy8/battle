package com.battle.core.controller;

import com.battle.core.pojo.bean.SysUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * 描述：
 *
 * @ClassName PageController
 * @Author jiangwy
 * @Date 2020/6/6 21:43
 **/
@Api(tags="核心接口")
@RestController
@RequestMapping("/page")
@Slf4j
public class PageController {
    @ApiOperation(value = "获取信息(id)", notes = "根据id获取匹配的信息", position = 1)
    @ApiImplicitParam(name = "id", value = "id", defaultValue = "", required = true, paramType = "path")
    @GetMapping(value = "/get/{id}")
    public Result<SysUser> get(@PathVariable(value = "id") java.lang.String id) {
        return ResultUtil.success();
    }
}