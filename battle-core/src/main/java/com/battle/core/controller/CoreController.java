package com.battle.core.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述：
 *
 * @ClassName CoreController
 * @Author jiangwy
 * @Date 2020/6/6 20:50
 **/
@Api(tags="核心接口")
@RestController
@RequestMapping("/core")
@Slf4j
public class CoreController {
    @ApiOperation(value = "删除数据", notes = "根据数据id来指定删除数据")
    @PostMapping(value = "/delete")
    public Result delete(@RequestBody(required = true) List<Long> dataCodes) {
        return null;// ResultUtil.success(sysUserService.removeByIds(dataCodes));
    }
}
