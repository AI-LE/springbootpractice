package com.aile.springbootpractice.dao;

import com.aile.springbootpractice.entity.SysUser;

/**
 * @Author aile
 * @Date 2019/12/11 17:41
 */

public interface UserDao {
    public SysUser findByUserName(String username);
}

