package com.imooc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.imooc.entity.Role;

/**
 * 角色数据DAO
 *
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
    List<Role> findRolesByUserId(Long userId);
}
