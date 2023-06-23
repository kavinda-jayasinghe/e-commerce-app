package com.example.back_end.service;

import com.example.back_end.dao.RoleDao;

import com.example.back_end.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role){
    return roleDao.save(role);
    }
}
