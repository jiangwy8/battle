package com.battle.core.controller;

import com.baomidou.mybatisplus.extension.service.IService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 描述：
 *
 * @ClassName BaseController
 * @Author jiangwy
 * @Date 2020/6/6 15:17
 **/
@Slf4j
public class BaseController<T, S extends IService<T>> {
    @Autowired
    S service;

    protected void template(HttpServletRequest request, HttpServletResponse response,Class<T> clazz){

    }

    protected void exportExcel(@RequestBody Search sysUser, HttpServletRequest request,HttpServletResponse response,Search<T> search){

    }
}
