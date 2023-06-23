package com.example.back_end.dao;


import com.example.back_end.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role,Integer> {
}
