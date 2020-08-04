package com.zz.service.impl;

import com.zz.dao.AdminMapper;
import com.zz.pojo.Admin;
import com.zz.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin findOne(Admin admin) {
        return adminMapper.findOne(admin);
    }
}
