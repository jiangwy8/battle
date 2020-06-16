package com.battle.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.battle.core.dao.SysUserDao;
import com.battle.core.pojo.bean.SysUser;
import com.battle.core.service.ISysUserService;
import org.springframework.stereotype.Service;

/**
 * 描述：
 *
 * @ClassName SysUserServiceImpl
 * @Author jiangwy
 * @Date 2020/6/6 14:39
 **/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUser> implements ISysUserService {
}
