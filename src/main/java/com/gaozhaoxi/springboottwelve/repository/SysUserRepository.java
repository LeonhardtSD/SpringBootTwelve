package com.gaozhaoxi.springboottwelve.repository;

import com.gaozhaoxi.springboottwelve.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Leon
 */
public interface SysUserRepository extends JpaRepository {
    SysUser findByUsername(String username);
}
